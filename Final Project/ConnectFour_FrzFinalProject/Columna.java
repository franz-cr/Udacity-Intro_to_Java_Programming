import java.util.ArrayList;
/*******************************************************************************
 * Una columna para el tablero de Línea 4. Una columna es la unidad del tablero
 * que se compone de una cantidad celdas especificadas por el tablero y se 
 * ordenan en forma vertical. Las celdas entonces se apilan una sobre otra para 
 * formar una columna o pila.
 * La columna define el tamaño de una celda, la cual es cuadrada, pero recibe su
 * punto de origen del tablero por las coordenadas x-y. El punto de origen es la 
 * esquina superior izquierda.
 * 
 * @author      Franz Ulrich
 * @address     franz.ulrich.cr@gmail.com
 * @version     Original
 */

public class Columna {
    // Class Instance variables
    private ArrayList<Celda> celdas = new ArrayList<Celda>();
    private int qtyCeldas = 0, columnaID, marcador;
    private final int ANCHO = 60;

    /**
     * Constructor de objetos de clase Columna
     */
    public Columna(int celdas, int numColumna) {
        // initialise instance variables
        this.qtyCeldas = celdas;
        this.columnaID = numColumna;
        this.marcador = 0;
        for (int i = 0; i < qtyCeldas; i++) {
            this.celdas.add(new Celda(ANCHO * numColumna, ANCHO * i, ANCHO, i));
        }
    }

    /**
     * Recibir Ficha - Recibe una ficha y llena la celda vacía más baja de la 
     * columna.
     * 
     * @param   Ejemplar de una ficha de un jugador
     * @return  Estado de la acción, 'true' o 'false'
     */
    public boolean recibirFicha(Color color) {

        if (marcador < qtyCeldas) {
            celdas.get(qtyCeldas - marcador - 1).recibirFicha(color);
            marcador++;
            return true;
        }
        else
            return false;
    }    
    
    /**
     * Draw - Dibuja las celdas de una columna
     */
    public void draw() {

        if (celdas.size() > 0)
            for (int i = 0; i < qtyCeldas; i++) {
                celdas.get(i).draw();
            }
    }
 
     /**
     * toString - Entrega una representación de caracteres de una columna.
     *
     * @param   Ninguno
     * @return  Cadena de caracteres (String)
     */
    @Override
    public String toString() {
        return ("Clm:" + columnaID + celdas.toString());
    }
}
