import java.awt.Point;

public class PolygonTest
{
 
    public static void main(String[] args)
    {
       
       Polygon shape = new Polygon();
       // Creating the initial polygon.
       shape.add(0, 0);
       shape.draw();
       
       shape.add(10, 0);
       shape.add(10, 10);
       shape.add(0, 10);
       
       System.out.println(shape.toString());
       //System.out.println(shape.perimeter());
       System.out.println("Expected: [java.awt.Point[x=0,y=0], java.awt.Point[x=1,y=0], java.awt.Point[x=1,y=1], java.awt.Point[x=0,y=1]]");
       
       shape.draw();
       
       System.out.println(shape.perimeter());
       System.out.println("  10.00  20.00  30.00  40.00");
       System.out.println("Expected: 40.0");
       
       shape.clear();
       // Fill polygon with points
       shape.add(50, 50);
       shape.add(75, 75);
       shape.add(50, 100);
       shape.add(25, 75);
       
       shape.draw();
       
       System.out.println(shape.perimeter());
       System.out.println("Expected: 141.4213562373095");
    }
}
