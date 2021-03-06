import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*******************************************************************************
 * The main driver of the program. This file will create the game, create the two 
 * agents, and create the window for the game. After that, Connect4Frame runs 
 * everything.
 *
 * @author      Franz Ulrich
 * @address     franz.ulrich.cr@gmail.com
 * @version     Original
 */

public class Main {
    // Class instance variables
    //private Partida.Dificultad dificultad;

    //private static Tablero miTablero;
    //private static Canvas myCanvas;
    
    public static void main(String[] args) {
        // Method Variables:
        Partida partida = new Partida(Dificultad.NORMAL);
        Scanner in = new Scanner(System.in);        
/*        final int LADO = 60;
        int lado = 60, margen = 10;

        JButton bttNext = new JButton("Next");
        
        // Formatear el botón
        bttNext.setAlignmentX(Component.CENTER_ALIGNMENT);
        myCanvas = Canvas.getInstance();
        myCanvas.addButtonToPanel(bttNext);
        bttNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextTokenButtonPressed();
            }
        });
        
        miTablero = new Tablero(7, 6);
        miTablero.draw();
*/
        System.out.println("*******************************************************************************");
        System.out.println("*                              Inicio del juego                               *");
        System.out.println("*******************************************************************************");
        
        boolean continuar = true;
        while(continuar) {
            //System.out.print("* Agregar ficha, [Color Columna] (R: Rojo/A: Azul/S: Salir)?");
            System.out.println("* Teclee 'S' para salir del juego                                             *");
            String respuesta = in.next();
            
            if (respuesta.equalsIgnoreCase("R")) {            
                //miTablero.recibirFicha(Color.RED, in.nextInt());
                //miTablero.draw();
                //myCanvas.blueTokenButtonPressed();
            } else if (respuesta.equalsIgnoreCase("A")) {
                //miTablero.recibirFicha(Color.BLUE, in.nextInt());
                //miTablero.draw();
            } else
                continuar = false;
            System.out.println("*******************************************************************************");
        }
        
        // Ficha ficha1 = new Ficha(margen, margen, LADO, Color.RED);
        // Ficha ficha2 = new Ficha(margen + lado + margen, margen, LADO, Color.BLUE);
        
        // System.out.println("Desplegar ficha:");
        // System.out.println(ficha1.toString());
        // System.out.println(ficha2.toString() + "\n");
        
        // //ficha1.draw();
        // //ficha2.draw();
        
        // Celda celda1 = new Celda(100, margen, LADO, 1);
        // Celda celda2 = new Celda(200, margen, LADO, 2);
        
        // System.out.println("Desplegar celdas:");
        // System.out.println(celda1.toString());
        // System.out.println(celda2.toString() + "\n");
        
        //GameFrame myTestFrame = new GameFrame();
        
        System.out.println("*                          <<< Fin del programa >>>                           *");
        System.out.println("*******************************************************************************");
    }
    
    public static void nextTokenButtonPressed() {
        //System.out.println("Botón de ficha azul apretado"); //columna1.toString() + "\n");
        JOptionPane.showMessageDialog(null, "Procedimiento 'nextTokenButtonPressed' en 'Main' ejecutado");
    }
}

/*
 * public static void main(String[] args) {
 *     Connect4Game game = new Connect4Game(7, 6); // create the game; these sizes can be altered for larger or smaller games
 *     Agent redPlayer = new RandomAgent(game, true); // create the red player, any subclass of Agent
 *     Agent yellowPlayer = new BeginnerAgent(game, false); // create the yellow player, any subclass of Agent
 *     
 *     Connect4Frame mainframe = new Connect4Frame(game, redPlayer, yellowPlayer); // create the game window
 *  }
 */
