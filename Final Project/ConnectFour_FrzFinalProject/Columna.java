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
    private int qtyCeldas = 0;
    private int marcador = 0;
    private final int COLUMN_ID;
    private final int ANCHO = 60;
    private final int MARGEN_SUP = 30;
    private final int MARGEN_IZQ = 10;

    /**
     * Constructor de objetos de clase Columna
     */
    public Columna(int celdas, int numColumna) {
        // initialise instance variables
        this.qtyCeldas = celdas;
        this.COLUMN_ID = numColumna;

        for (int i = 0; i < qtyCeldas; i++) {
            this.celdas.add(
                new Celda(
                    ANCHO * COLUMN_ID + MARGEN_IZQ,
                    ANCHO * i + MARGEN_SUP,
                    ANCHO, i));
        }
    }

    /**
     * recibirFicha - Si hay espacio recibe una ficha y llena la celda vacía más baja 
     * de la  columna.
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
     * getRowsNumber - Obtiene la cantidad de filas de la columna.
     * 
     * @return  La cantidad de filas de la columna
     */
    public int getRowsNumber() {

        return (celdas.size());
    }
    
    /**
     * getColumnWidth - Retorna el ancho de la celda alojada en la variable estática
     * 'ANCHO' en esta clase.
     * 
     * @return  El ancho de la celda en pixeles.
     */    
    public int getColumnWidth() {
        return ANCHO;
    }
    
    /**
     * getUpperMargin - Retorna la altura del borde superior entre el tablero y el borde
     * superior del 'Canvas' o panel superior. Este valor se aloja en la variable estática
     * 'MARGEN_SUP' en esta clase.
     * 
     * @return  La altura del márgen superior en pixeles.
     */
    public int getUpperMargin() {
        return MARGEN_SUP;
    }
    
    /**
     * getLeftMargin - Retorna la distancia del borde izquierdo entre el tablero y el borde
     * izquierdo del 'Canvas'. Este valor se aloja en la variable estática 'MARGEN_IZQ' en 
     * esta clase.
     * 
     * @return  El márgen izquierdo en pixeles.
     */            
    public int getLeftMargin() {
        return MARGEN_IZQ;
    }

    /**
     * getLeftMargin - Retorna la distancia del borde izquierdo entre el tablero y el borde
     * izquierdo del 'Canvas'. Este valor se aloja en la variable estática 'MARGEN_IZQ' en 
     * esta clase.
     * 
     * @return  El márgen izquierdo en pixeles.
     */            
    public boolean isFull() {
        
        if (marcador < qtyCeldas)
            return false;
        else
            return true;
    }
    
    /**
     * unloadColumn - Vacía la columna de las fichas que contiene.
     * 
     * @return  Ninguno
     */    
    public void unloadColumn() {
        
        celdas.clear();
        for (int i = 0; i < qtyCeldas; i++) {
            this.celdas.add(
                new Celda(
                    ANCHO * COLUMN_ID + MARGEN_IZQ,
                    ANCHO * i + MARGEN_SUP,
                    ANCHO, i));
            }
        marcador = 0;
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
        return ("Clm:" + COLUMN_ID + celdas.toString());
    }
}
