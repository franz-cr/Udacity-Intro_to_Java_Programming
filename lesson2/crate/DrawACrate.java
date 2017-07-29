// BlueJ project: lesson2/crate

// Draw a crate by combining a rectangle with five lines.
//
// The front face is a rectangle with top left corner (20, 30), 
// width 100, and height 40. 
//
// A diagonal line goes from the face's top left corner  to (50, 10). 
// Another diagonal line goes from the face's bottom right corner 
// to (150, 50).
// A third diagonal starts at the face's top right corner and is
// parallel to the others.
// The fourth and fifth line join the end points of the diagonals.
//
// Before programming, get out a pen and draw the crate on a
// sheet of paper! Label each of the points with their coordinates.
//
// Also, don't forget to call draw() on your rectangle and line objects.

public class DrawACrate
{
    public static void main(String[] args)
    {
        //Variables del paralelep?pedo
        int X = 20, Y = 30, Ancho = 100, Alto = 40, FdoX = 30, FdoY = -20;
        //Crea y dibuja la cara frontal del paralelep?pedo
        Rectangle face = new Rectangle(X, Y, Ancho, Alto);
        face.draw();
        
        //Crea y dibuja la cara superior
        Line AristaA = new Line(X, Y, (X + FdoX), (Y + FdoY));
        AristaA.draw();
        
        Line AristaB = new Line((X + Ancho), Y, (X + Ancho + FdoX), (Y + FdoY));
        AristaB.draw();
        
        Line AristaC = new Line((X + Ancho), (Y + Alto), (X + Ancho + FdoX), (Y + Alto + FdoY));
        AristaC.draw();
        
        Line AristaD = new Line((X + FdoX), (Y + FdoY), (X + Ancho + FdoX), (Y + FdoY));
        AristaD.draw();
        
        Line AristaE = new Line((X + Ancho + FdoX), (Y + FdoY), (X + Ancho + FdoX), (Y + Alto + FdoY));
        AristaE.draw();
        
        //Line line1 = ...;
        //line1.draw();
        
    }
}
