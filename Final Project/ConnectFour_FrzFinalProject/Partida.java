import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*******************************************************************************
 * Una partida contiene los elementos necesarios para efectuar un juego de Línea 4.
 * Una partida es la unidad lógica que contiene el tablero de juego, los jugadores, 
 * el inicio de una partida, el manejo de los turnos de cada jugador, la evaluación
 * de cual jugador forma primero la Línea objetivo, el otorgamiento del gane de la
 * partida y el manejo para finalizar el juego o reiniciar una partida nueva.
 * 
 * @author      Franz Ulrich
 * @address     franz.ulrich.cr@gmail.com
 * @version     Original
 */
public class Partida {
    // Class Instance Variables
    private Tablero tablero;
    private boolean esTurnoAzul = false;
    private String nombreJugador1, nombreJugador2;
    private final Color COLOR_JUGADOR1 = Color.RED;
    private final Color COLOR_JUGADOR2 = Color.BLUE;
    private Canvas gameCanvas;
    private int linea;
    public enum Dificultad {
        SENCILLA,
        NORMAL,
        DIFICIL
    } 

    /**
     * Constructor de objetos de la clase Partida
     */
    public Partida(Dificultad dificultad) {
        // Inicializar variables de clase
        this.nombreJugador1 = "";
        this.nombreJugador2 = "";
        // Obtener los parámetros del juego
        int[] parametros = parametrosJuego(dificultad);
        tablero = new Tablero(parametros[0], parametros[1]);
        linea = parametros[2];
        // Agregar paneles a la ventana de juego
        gameCanvas = Canvas.getInstance();
        gameCanvas.addPanelToFrame(crearPanelSuperior(), 'N');
    }

    /**
     * crearPanelSuperior - Crea el panel superior con sus diferentes componentes
     * que se han diagramado según lo requerido.
     * 
     * @return  Un panel con sus respectivos componentes.
     */    
    private JPanel crearPanelSuperior() {
        JPanel upperPanel = new JPanel();
        JButton leftMove = new JButton("<");
        JButton rightMove = new JButton(">");
        JButton playToken = new JButton("Jugar Ficha");
        JLabel label = new JLabel("Game controls:");
        // Diagramación del panel
        GridBagConstraints gridLayout = new GridBagConstraints();
        gridLayout.insets = new Insets(10,10,10,10); 
        //10px border all around
        
        // Formatear los botones
        leftMove.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftMove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                leftButtonPressed();
            }
        });        
        rightMove.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftMove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rightButtonPressed();
            }
        });
        playToken.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftMove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playButtonPressed();
            }
        });                
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Formatear el panel superior
        upperPanel.setBackground(java.awt.Color.LIGHT_GRAY);
        upperPanel.add(label, gridLayout);
        upperPanel.add(leftMove, gridLayout);
        upperPanel.add(playToken, gridLayout);
        upperPanel.add(rightMove, gridLayout);
        
        return upperPanel;
    }

    /**
     * parametrosJuego - Define los parámetros básicos de un juego de acuerdo a 
     * un nivel recibido de dificultad.
     *
     * @param   Enumerado del nivel de dificultad.
     * @return  Un arreglo de enteros con los parámetros del juego.
     */
    public int[] parametrosJuego(Dificultad dificultad) {
        // Los parámetros del juego se estructuran así:
        // - Primer valor: Cantidad de columnas del tablero.
        // - Segundo valor: Cantidad de celdas por columna.
        // - Tercer valor: Tamaño de la línea a completar.
        int[] parametros = {0, 0, 0};
        
        switch(dificultad) {
            case SENCILLA:
                parametros[0] = 6;
                parametros[1] = 6;
                parametros[2] = 3;
                break;
            case NORMAL:
                parametros[0] = 7;
                parametros[1] = 6;
                parametros[2] = 4;
                break;
            case DIFICIL:
                parametros[0] = 8;
                parametros[1] = 7;
                parametros[2] = 5;
                break;
            }
        return parametros;
    }
    
    public static void leftButtonPressed() {
        JOptionPane.showMessageDialog(null, "Control de izquierda clickeado");
    }    
    
    public static void rightButtonPressed() {
        JOptionPane.showMessageDialog(null, "Control de derecha clickeado");
    }  
    
    public static void playButtonPressed() {
        JOptionPane.showMessageDialog(null, "Control de jugada clickeado");
    }      
}
