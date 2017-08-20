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
    private Ellipse marcador;
    private boolean esTurnoAzul = false;
    private String nombreJugador1, nombreJugador2;
    private final Color COLOR_JUGADOR1 = Color.RED;
    private final Color COLOR_JUGADOR2 = Color.BLUE;
    private final java.awt.Color COLOR_PANELES = java.awt.Color.LIGHT_GRAY;
    private Canvas gameCanvas;
    private int linea;
    private int columnaActiva = 0;
    private final int ANCHO, MARGEN_IZQ, MARGEN_SUP;
    // Cambiar también en Columna.java en caso de requerir ser cambiado en un futuro
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
        // Recuperar constantes de la diagramación del tablero
        ANCHO = tablero.getBoardColumnWidth();
        MARGEN_IZQ = tablero.getBoardLeftMargin();
        MARGEN_SUP = tablero.getBoardUpperMargin();
        int diametroMarcador = (int)(ANCHO / 3);
        
        // Declara el marcador de la columna activa
        marcador = new Ellipse(
            (double)(ANCHO/2 - diametroMarcador/2 + MARGEN_IZQ), 
            (double)(MARGEN_SUP/2 - diametroMarcador/2), 
            diametroMarcador, 
            diametroMarcador);
        marcador.setColor(Color.RED);
        marcador.fill();
        
        // Agregar paneles a la ventana de juego
        gameCanvas = Canvas.getInstance();
        gameCanvas.addPanelToFrame(crearPanelSuperior(), 'N');
        gameCanvas.addPanelToFrame(crearPanelInferior(parametros[0]), 'S');
        // Despliega el tablero en pantalla
        tablero.draw();
    }

    /**
     * crearPanelSuperior - Crea el panel superior con sus diferentes componentes
     * que se han diagramado según lo requerido.
     * Tutorial: https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html
     * 
     * @return  Un panel con sus respectivos componentes.
     */    
    private JPanel crearPanelSuperior() {
        JPanel upperPanel = new JPanel();
        JButton leftMove = new JButton("<");
        JButton rightMove = new JButton(">");
        JButton playToken = new JButton("Jugar Ficha");
        JButton restartGame = new JButton("Reiniciar");
        JLabel label = new JLabel("Línea " + linea + ":");
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
        rightMove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rightButtonPressed();
            }
        });
        playToken.setAlignmentX(Component.CENTER_ALIGNMENT);
        playToken.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playButtonPressed();
            }
        });
        restartGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        restartGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restartButtonPressed();
            }
        });        
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        // Formatear el panel superior
        upperPanel.setBackground(COLOR_PANELES);
        upperPanel.setName("pnlUpperPanel");
        upperPanel.add(label, gridLayout, 0);
        upperPanel.add(leftMove, gridLayout, 1);
        upperPanel.add(playToken, gridLayout, 2);
        upperPanel.add(rightMove, gridLayout, 3);
        upperPanel.add(restartGame, gridLayout, 4);
        
        return upperPanel;
    }

    /**
     * crearPanelInferior - Crea un panel, al cual se le agregan los controles 
     * necesarios. El objetivo de este panel es mostrar información útil del 
     * juego a los jugadores.
     *
     * @return  El panel cargado con los controles
     */
    private JPanel crearPanelInferior(int columnas) {
        JPanel lowerPanel = new JPanel();
        JLabel positionLabel;
        Dimension dimension = new Dimension(ANCHO - 3, 25);
        
        // Diagramación del panel
        //GridBagConstraints gridLayout = new GridBagConstraints();
        //gridLayout.insets = new Insets(30,10,30,10); 
        
        for (int i = 0; i < columnas; i++) {
            positionLabel = new JLabel("< " + i + " >");
            positionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            //positionLabel.setLocation(ANCHO * i, 10);
            positionLabel.setName("lbl" + i);
            positionLabel.setPreferredSize(dimension);
            lowerPanel.add(positionLabel, i);
        }
        lowerPanel.setBackground(COLOR_PANELES);
        lowerPanel.setName("pnlLowerPanel");
        return lowerPanel;
    }

    /**
     * ejecutarTurno - Ejecuta el turno de un jugador
     *
     * @return  El resultado, exitoso (1) o no (0), del turno
     */
    public int ejecutarTurno() {

        // ejecutar turno.
        if (esTurnoAzul) {
            tablero.recibirFicha(Color.BLUE, columnaActiva);
            marcador.setColor(Color.RED);
            esTurnoAzul = false;
        } else {
            tablero.recibirFicha(Color.RED, columnaActiva);
            marcador.setColor(Color.BLUE);
            esTurnoAzul = true;
        }
        System.out.println("* Fichas: " + tablero.getQtyTokens());
        
        // TODO: Informar al usuario si la jugada no se pudo ejecutar mediante el 
        // panel inferior y/o un cuadro de diálogo.
        
        tablero.draw();
        
        return 1;
    }

    /**
     * reiniciarPartida - Reinicia la partida, es decir, descarga las fichas del
     * tablero, reinicia las variables de la partida y actualiza las variables del
     * juego.
     * 
     * Tutorial sobre cuadros de diálogo:
     * https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
     *
     * @return  El resultado, exitoso (1) o no (0), del reinicio
     */
    public int reiniciarPartida() {

        tablero.unloadBoard();
        marcador.setColor(Color.RED);
        if (columnaActiva > 0) {
            marcador.translate(-ANCHO * columnaActiva, 0);
            columnaActiva = 0;
        }
        esTurnoAzul = false;
        tablero.draw();
        
        return 1;
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

    /**
     * leftButtonPressed - Ejecuta las acciones de juego definidas para este
     * botón.
     * 
     * @return  Ninguno
     */
    public void leftButtonPressed() {

        if (columnaActiva > 0) {
            columnaActiva--;
            marcador.translate(-ANCHO, 0);
        }
        System.out.printf("* Columna: %3d                                                                *\n", 
            columnaActiva);
        //JOptionPane.showMessageDialog(null, "Columna: " + columnaActiva);        
    }    

    /**
     * rightButtonPressed - Ejecuta las acciones de juego definidas para este
     * botón.
     * 
     */
    public void rightButtonPressed() {

        if (columnaActiva < (tablero.getColumnsNumber()) - 1) {
            columnaActiva++;
            marcador.translate(ANCHO, 0);
        }
        System.out.printf("* Columna: %3d                                                                *\n", 
            columnaActiva);
        //JOptionPane.showMessageDialog(null, "Columna: " + columnaActiva);
    }  

    /**
     * playButtonPressed - Ejecuta las acciones de juego definidas para este
     * botón.
     * 
     */
    public void playButtonPressed() {
        //JOptionPane.showMessageDialog(null, "Control de jugada clickeado");
        ejecutarTurno();
    }
    /**
     * playButtonPressed - Ejecuta las acciones de juego definidas para este
     * botón.
     * 
     */
    public void restartButtonPressed() {

        int dlgOpc = JOptionPane.showConfirmDialog(null, 
            "¿Desea reiniciar la partida?",
            "Confirmar reinicio",
            JOptionPane.YES_NO_OPTION);
        if (dlgOpc == 0) 
            reiniciarPartida();
    }    
}
