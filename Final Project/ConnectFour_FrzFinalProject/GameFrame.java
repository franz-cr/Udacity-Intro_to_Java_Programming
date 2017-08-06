import javax.swing.*; 
import java.awt.*;
// Librerías necesarias para crear una interfaz gráfica

/**
 * Write a description of class GameFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GameFrame { 
    //extends JFrame {
    // instance variables - replace the example below with your own
    private JFrame frame;
    // A frame is the window that holds the panels
    private JPanel panel;
    //A panel holds all the controls
    private JButton button;
    private JLabel label;

    /**
     * Constructor for objects of class GameFrame
     */
    public GameFrame() {
        // initialise instance variables
        //x = 0;
        gui();
    }

    /**
     * GUI - Is the method to create the button, the label 
     *
     */
    public void gui() {
        // Declare the frame or window
        frame = new JFrame("Frame Title");
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This statement closes the window when clicking on the (X) button
        
        // Declare the panel to host the controls
        panel = new JPanel();
        panel.setBackground(java.awt.Color.GRAY);
        
        // Declare the controls
        button = new JButton("Test Button");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("This is the test button label");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Add the control to the panel
        panel.add(label);
        panel.add(button);
        
        // Add the panel to the frame
        frame.add(panel,BorderLayout.NORTH);
        // Frame will be justified to the top
        // .SOUTH, bottom
        // .EAST, right
        // .WEST, left
/*        
When you add components to a panel, you use the add method. Exactly which arguments 
you specify to the add method depend on which layout manager the panel uses. When the 
layout manager is FlowLayout, BoxLayout, GridLayout, or SpringLayout, you will typically 
use the one-argument add method, like this:
    aFlowPanel.add(aComponent);
    aFlowPanel.add(anotherComponent);
*/

//Source: https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html
    }
}
