//HIDE
//OUT canvas.png
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;

public class Canvas {
    private static Canvas canvas = new Canvas();

    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    private BufferedImage background;
    private JFrame frame;
    
    private CanvasComponent component;

    //FRZ Code:
    private Component[] lowerFrameComponents;
    // private JPanel upperPanel;
    // private JButton bttBlue;
    // private JButton bttRed;
    // private JLabel label;
    // private GridBagConstraints gridLayout = new GridBagConstraints();
    
    private static final int MIN_SIZE = 300;
    private static final int MARGIN = 10;
    private static final int LOCATION_OFFSET = 120;

    class CanvasComponent extends JComponent {
        public void paintComponent(Graphics g) {
            g.setColor(java.awt.Color.WHITE);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(java.awt.Color.BLACK);
            if (background != null) {
                g.drawImage(background, 0, 0, null);
            }
            for (Shape s : new ArrayList<Shape>(shapes)) {
                Graphics2D g2 = (Graphics2D) g.create();
                s.paintShape(g2);
                g2.dispose();
            }
        }

        public Dimension getPreferredSize() {
            int maxx = MIN_SIZE;
            int maxy = MIN_SIZE;
            if (background != null) {
                maxx = Math.max(maxx, background.getWidth());
                maxy = Math.max(maxx, background.getHeight());
            }
            for (Shape s : shapes) {
                maxx = (int) Math.max(maxx, s.getX() + s.getWidth());
                maxy = (int) Math.max(maxy, s.getY() + s.getHeight());
            }
            return new Dimension(maxx + MARGIN, maxy + MARGIN);
        }
    }

    private Canvas() {
        component = new CanvasComponent();

        if (System.getProperty("com.horstmann.codecheck") == null) {
            frame = new JFrame("Línea 4");
            if (!System.getProperty("java.class.path").contains("bluej"))
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(component);
            frame.pack();
            frame.setLocation(LOCATION_OFFSET, LOCATION_OFFSET);
            frame.setVisible(true);
            //FRZ - Code:
            // Declare the panel having a layout component, which will allow to layout
            // the controls added into the panel.
            // upperPanel = new JPanel(new GridBagLayout());
            // upperPanel.setBackground(java.awt.Color.GRAY);
            // Setting up the layout in the panel
            // gridLayout.insets = new Insets(10,10,10,10); //10px border all around
            
            // Declare the buttons and panel controls
            // bttBlue = new JButton("Blue");
            // bttBlue.setAlignmentX(Component.CENTER_ALIGNMENT);
            // bttBlue.setSize(75, 15);
            // bttBlue.addActionListener(new ActionListener() {
                // public void actionPerformed(ActionEvent e) {
                    // blueTokenButtonPressed();
                // }
            // });
            
            // bttRed = new JButton("Red");
            // bttRed.setAlignmentX(Component.CENTER_ALIGNMENT);
            

            // label = new JLabel("Game controls:");
            // label.setAlignmentX(Component.CENTER_ALIGNMENT);
            // Add the control to the panel
            // upperPanel.add(label, gridLayout);
            // upperPanel.add(bttBlue, gridLayout); 
            // upperPanel.add(bttRed, gridLayout);
            // Add the panel to the frame
            //frame.add(upperPanel,BorderLayout.NORTH);
            //System.out.println("* Constructor > Canvas > Get Property == null");
        } else {
            final String SAVEFILE ="canvas.png";
            final Thread currentThread = Thread.currentThread();
            Thread watcherThread = new Thread() 
            {
                public void run() {
                    try {
                        final int DELAY = 10;

                        while (currentThread.getState() != Thread.State.TERMINATED) {
                            Thread.sleep(DELAY);
                        }
                        saveToDisk(SAVEFILE);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            };
            watcherThread.start();
            System.out.println("* Constructor > Canvas > Get Property != null");
        }
    }

    public static Canvas getInstance() {
        return canvas;
    }

    public void show(Shape s) {
        if (!shapes.contains(s)) {
            shapes.add(s);
        }
        repaint();
    }

    public void repaint() {
        if (frame == null) return;
        Dimension dim = component.getPreferredSize();
        if (dim.getWidth() > component.getWidth()
                || dim.getHeight() > component.getHeight())
        {
            frame.pack();
        }
        else
        {
            frame.repaint();
        }
    }

    /**
     * Pauses so that the user can see the picture before it is transformed.
     */
    public static void pause()
    {
        JFrame frame = getInstance().frame;
        if (frame == null) return;
        JOptionPane.showMessageDialog(frame, "Click Ok to continue");
    }

    /**
     * Takes a snapshot of the screen, fades it, and sets it as the background.
     */
    public static void snapshot()
    {
        Dimension dim = getInstance().component.getPreferredSize();
        java.awt.Rectangle rect = new java.awt.Rectangle(0, 0, dim.width, dim.height);
        BufferedImage image = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(java.awt.Color.WHITE);
        g.fillRect(0, 0, rect.width, rect.height);
        g.setColor(java.awt.Color.BLACK);
        getInstance().component.paintComponent(g);
        float factor = 0.8f;
        float base = 255f * (1f - factor);
        RescaleOp op = new RescaleOp(factor, base, null);
        BufferedImage filteredImage
            = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        op.filter(image, filteredImage);
        getInstance().background = filteredImage;
        getInstance().component.repaint();
    }

    public void saveToDisk(String fileName)
    {
        Dimension dim = component.getPreferredSize();
        java.awt.Rectangle rect = new java.awt.Rectangle(0, 0, dim.width, dim.height);
        BufferedImage image = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(java.awt.Color.WHITE);
        g.fill(rect);
        g.setColor(java.awt.Color.BLACK);
        component.paintComponent(g);
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
        try
        {
            ImageIO.write(image, extension, new File(fileName));
        }
        catch(IOException e)
        {
            System.err.println("Was unable to save the image to " + fileName);
        }
        g.dispose();
    }
    
    /**
     * addPanelToFrame - Agrega un ejempler de un JPanel al JFrame que aloja
     * el tablero del juego en una posición indicada por el caracter, a saber,
     * 'N' es arriba, 'S' es abajo, 'E' es a la derecha, y 'W' a la derecha.
     * Tutorial: https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html
     * 
     * @param   El ejemplar del JPanel a agregar.
     * @param   La posición en que debe agregarse el panel.
     * 
     * @return  Ninguno.
     */
    public void addPanelToFrame(JPanel panel, char position) {
        
        switch (position) {
            case 'N':
                frame.add(panel, BorderLayout.NORTH);
                break;
            case 'S':
                frame.add(panel, BorderLayout.SOUTH);
                lowerFrameComponents = panel.getComponents();
                break; 
            }
    }
    
    /**
     * addTextToJLabel - Agrega el texto provisto al control JLabel indicado
     * por el nombre del control en el panel inferior.
     *
     * @param   Enumerado del nivel de dificultad.
     * @return  Un arreglo de enteros con los parámetros del juego.
     */
    public void addTextToJLabel(String labelText, String labelName) {
        
        for (int i = 0; i < lowerFrameComponents.length; i++) {
            if (lowerFrameComponents[i].getName().equalsIgnoreCase(labelName)) {
                JLabel label = (JLabel)(lowerFrameComponents[i]);
                label.setText(labelText);
                if (!label.isVisible())
                    label.setVisible(true);
            }
        }
        // System.out.println("Lower frame Components Count: " + lowerFrameComponents.length);
        // JLabel label = (JLabel)(lowerFrameComponents[0]);
        // label.setText(labelText);
        // System.out.println("Component[0]:" + label.toString());
    }
    // public void blueTokenButtonPressed() {
        // //System.out.println("Botón de ficha azul apretado"); //columna1.toString() + "\n");
        // JOptionPane.showMessageDialog(null, "Click Ok to continue");
    // }
    
    // public void addButtonToPanel(JButton button) {
        // upperPanel.add(button, gridLayout);
    // }
}
