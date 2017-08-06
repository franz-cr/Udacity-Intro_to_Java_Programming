
/*******************************************************************************
 * Una celda para la columna de Línea 4. Una celda es la unidad básica del tablero,
 * la celda es cuadrada y dimensiones constantes, y tiene un punto de origen dado
 * por las coordenadas x-y. El punto de origen es la esquina superior izquierda.
 * 
 * @author      Franz Ulrich
 * @address     franz.ulrich.cr@gmail.com
 * @version     Original
 */

public class Celda {
    // Class Instance Variables:
    private Rectangle celda;
    private Ficha ficha;
    private boolean estaLlena = false;
    private final int BORDE = 5;
    private int celdaID;
    
    /**
     * Constructor de objetos de la clase Celda
     */
    public Celda(double x_origin, double y_origin, int lado, int numCelda) {
        // initialise instance variables
        celdaID = numCelda;
        celda = new Rectangle(x_origin, y_origin, lado, lado);
        celda.setColor(Color.YELLOW);
        ficha = new Ficha((int)(x_origin + BORDE), (int)(y_origin + (int)BORDE), 
            (int)(lado - 2 * BORDE), Color.WHITE);
    }

    /**
     * Draw - Dibuja la ficha.
     *
     * @param   Ninguno
     * @return  Ninguno
     */    
    public void draw() {
        celda.fill();
        if (estaLlena)
            ficha.draw();
        else
            ficha.drawHole();
    }
    
    /**
     * Recibir Ficha - Recibe una ficha y llena la celda.
     *
     * @param   La ficha que llenará la celda
     * @return  El estado de la celda una vez llena
     */
    public boolean recibirFicha(Color color) {

        ficha.setColor(color);
        estaLlena = true;
        
        return estaLlena;
    }
    
    public boolean estaLlena() {
        
        return estaLlena;
    }
    
    /**
     * toString - Entrega una representación de caracteres de una celda.
     *
     * @param   Ninguno
     * @return  Cadena de caracteres (String)
     */    
    @Override
    public String toString() {
        return ("Cld:" + celdaID + ">" + estaLlena);
    }
}
