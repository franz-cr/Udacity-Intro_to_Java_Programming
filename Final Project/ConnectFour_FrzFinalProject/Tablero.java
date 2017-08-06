
/*******************************************************************************
 * Un tablero contiene las columnas de Línea 4. Un tablero es la unidad lógica que
 * contiene las columnas del juego, y determina cuantas columnas y celdas tiene.
 * 
 * @author      Franz Ulrich
 * @address     franz.ulrich.cr@gmail.com
 * @version     Original
 */
public class Tablero {
    // instance variables - replace the example below with your own
    private Columna[] columnas;

    /**
     * Constructor de objetos de clase Tablero
     */
    public Tablero(int columnas, int celdas) { 
        // initialise instance variables
        this.columnas = new Columna[columnas];
        
        for (int i = 0; i < columnas; i++)
            this.columnas[i] = new Columna(celdas, i);
    }
    
    /**
     * Recibir Ficha - Recibe el color de la ficha y la columna a la que se le 
     * debe asignar.
     * 
     * @param   Ejemplar del color de la ficha de un jugador
     * @param   Número de la columna a la cual asignar la ficha
     * @return  Estado de la acción, 'true' o 'false'
     */
    public boolean recibirFicha(Color color, int columnaID) {

        if (columnaID < columnas.length) {
            columnas[columnaID].recibirFicha(color);
            return true;
        }
        else
            return false;
    }    
        
    /**
     * Draw - Dibuja las columnas del tablero
     */
    public void draw() {

        if (columnas.length > 0)
            for (int i = 0; i < columnas.length; i++) {
                columnas[i].draw();
            }
    }
    
    /**
     * toString - Entrega una representación de caracteres de un tablero
     *
     * @param   Ninguno
     * @return  Cadena de caracters (String)
     */
    
    public String toString() {
        // put your code here
        return "";
    }
}
