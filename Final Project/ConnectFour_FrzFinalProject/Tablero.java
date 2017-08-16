
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
    private int qtyFichas = 0;
    private boolean estaLleno = false;
    
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
     * debe asignar. Ejecuta el chequeo de si ha ganado o no.
     * 
     * @param   Ejemplar del color de la ficha de un jugador
     * @param   Número de la columna a la cual asignar la ficha
     * @return  Si el último jugador ha ganado (true) o no (false)
     */
    public boolean recibirFicha(Color color, int columnaID) {

        qtyFichas++;
        // TODO: Esto suma fichas aunque no se agreguen por estar llenos los espacios
        if (columnaID < columnas.length) {
            if (columnas[columnaID].recibirFicha(color));
                System.out.println("* La columna está llena, ");
            return true;
        }
        else
            return false;
    }    
    
    /**
     * unloadBoard - Descarga las fichas del tablero dejando los espacios vacíos.
     * 
     * @return  Void
     */
    public void unloadBoard() {

        for (int i = 0; i < columnas.length; i++)
            columnas[i].unloadColumn();
        qtyFichas = 0;
    }

    /**
     * getColumnsNumber - Obtiene la cantidad de columnas del tablero.
     * 
     * @return  La cantidad de columnas
     */
    public int getColumnsNumber() {

        return (columnas.length);
    }

    /**
     * getRowsNumber - Obtiene la cantidad de filas del tablero.
     * 
     * @return  La cantidad de filas
     */
    public int getRowsNumber() {

        return (columnas[0].getRowsNumber());
    }

    /**
     * getSlotsNumber - Obtiene la cantidad total de espacios del tablero.
     * 
     * @return  La cantidad de espacios
     */
    public int getSlotsNumber() {

        return (getColumnsNumber() * getRowsNumber());
    }
    
    /**
     * getBoardColumnWidth - Obtiene la constante del ancho de la columna definido 
     * en la clase columna.
     * 
     * @return  El ancho de la celda en pixeles
     */    
    public int getBoardColumnWidth() {
        
        return (columnas[0].getColumnWidth());
    }
        
    /**
     * getBoardUpperMargin - Obtiene la constante del márgen superior definido en
     * la clase columna.
     * 
     * @return  El márgen superior en pixeles
     */
    public int getBoardUpperMargin() {
        return columnas[0].getUpperMargin();
    }

    /**
     * getBoardLeftMargin - Obtiene la constante del márgen izquierdo definido en
     * la clase columna.
     * 
     * @return  El márgen izquierdo en pixeles
     */    
    public int getBoardLeftMargin() {
        return columnas[0].getLeftMargin();
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
     * @return  Cadena de caracteres (String)
     */
    public String toString() {

        return "Tablero (" + columnas.length + ")";
    }
}
