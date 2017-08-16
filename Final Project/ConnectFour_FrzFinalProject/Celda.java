
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
    private boolean isHighlighted = false;
    private final int BORDE = 5;
    // BORDE: Márgen interno en pixeles desde el borde externo de la celda y el borde
    // externo del agujero que aloja a la ficha.
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
     * recibirFicha - Recibe una ficha y llena la celda.
     *
     * @param   La ficha que llenará la celda
     * @return  El estado de la celda una vez llena
     */
    public boolean recibirFicha(Color color) {

        ficha.setColor(color);
        estaLlena = true;
        
        return estaLlena;
    }
    
    /**
     * emptySlot - Vacía la ficha de la celda.
     *
     * @return  Void
     */
    public void unloadSlot() {

        ficha.setColor(Color.WHITE);
        estaLlena = false;
    }
        
    /**
     * estaLlena - Indica si la celda tiene una ficha.
     *
     * @return  El verdadero si la celda tiene una ficha.
     */    
    public boolean estaLlena() {
        
        return estaLlena;
    }

    /**
     * Draw - Dibuja la ficha.
     *
     * @param   Ninguno
     * @return  Void
     */    
    public void draw() {
        celda.fill();
        if (estaLlena)
            ficha.draw();
        else
            ficha.drawHole();
    }
    
    /**
     * toString - Entrega una representación de caracteres de una celda.
     *
     * @return  Cadena de caracteres (String)
     */    
    @Override
    public String toString() {
        return ("Cld:" + celdaID + ">" + estaLlena);
    }
}
