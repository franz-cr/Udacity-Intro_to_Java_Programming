
/*******************************************************************************
 * Una ficha para el juego de Línea 4. Una ficha es un círculo de radio constante, 
 * un color y unas coordinadas x-y del punto de orígen recibido en el constructor.
 * 
 * @author      Franz Ulrich
 * @address     franz.ulrich.cr@gmail.com
 * @version     Original
 */

public class Ficha {
    // Class Instance Variables:
    private int anchoLabio;
    //private int xOrigen, yOrigen;
    private Ellipse cuerpo, borde, centro;

    /**
     * Constructor de objetos de clase Ficha vacía
     */
    public Ficha() {
        
    }
    /**
     * Constructor de objetos de clase Ficha con sus atributos
     */
    public Ficha(int x, int y, int lado, Color colorFicha) {

        anchoLabio = (int)(lado * 0.15);
        cuerpo = new Ellipse(x, y, lado, lado);
        cuerpo.setColor(colorFicha);
        
        borde = new Ellipse(x, y, lado, lado);
        borde.setColor(Color.BLACK);
        
        centro = new Ellipse(x + anchoLabio, y + anchoLabio, 
            lado - 2 * anchoLabio, lado - 2 * anchoLabio);
        centro.setColor(Color.BLACK);
    }
    
    /**
     * Sets the color of this ellipse.
     * @param newColor the new color
     */
    public void setColor(Color newColor) {
        cuerpo.setColor(newColor);
    }
    
    /**
     * DrawHole - Dibuja un espacio vacío del tamaño de una ficha.
     *
     * @param   Ninguno
     * @return  Ninguno
     */    
    public void drawHole() {
        cuerpo.fill();
        borde.draw();
    }    
    
    /**
     * Draw - Dibuja la ficha.
     *
     * @param   Ninguno
     * @return  Ninguno
     */    
    public void draw() {
        cuerpo.fill();
        borde.draw();
        centro.draw();
    }

    /**
     * toString - Entrega una representación de caracteres de una ficha.
     *
     * @param   Ninguno
     * @return  Cadena de caracteres (String)
     */
    @Override
    public String toString() {
        
        return ("OR: (" + cuerpo.getX() + ", " + cuerpo.getY() + "), DIM:(" + 
            cuerpo.getWidth() + ", " + cuerpo.getHeight() + ")");
    }
}
