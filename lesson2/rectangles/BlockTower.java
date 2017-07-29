
/**
 * Write a description of class BlockTower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The bottom left rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function

public class BlockTower
{
    public static void main(String[] args) {
        //Variables de los rectángulos
        int width = 40, height = 30;
        int originX = 20, originY = 70;
        
        //Crear los rectángulos de la línea inferior
        Rectangle box11 = new Rectangle(originX, originY, width, height);
        Rectangle box12 = new Rectangle((originX + width), originY, width, height);
        Rectangle box13 = new Rectangle((originX + (2 * width)), originY, width, height);
        
        //Crear los rectángulos de la línea inferior
        Rectangle box21 = new Rectangle(originX + (width / 2), (originY - height), width, height);
        Rectangle box22 = new Rectangle((originX + width + (width / 2)), (originY - height), 
            width, height);
            
        //Crear los rectángulos de la línea inferior
        Rectangle box31 = new Rectangle(originX + width, (originY - (2 * height)), width, height);
        
        //Crear colores
        //Color blue = new Color(0,0,255);
        box11.setColor(Color.BLUE);
        box12.setColor(Color.MAGENTA);
        box13.setColor(Color.CYAN);
        box21.setColor(Color.RED);
        box22.setColor(Color.PINK);
        box31.setColor(new Color(125, 125, 255));
        
        //Dibujar los rectángulos
        box11.fill();
        box12.fill();
        box13.fill();
        box21.fill();
        box22.fill();
        box31.fill();
    }
}
