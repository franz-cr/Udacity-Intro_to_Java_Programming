//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
//For the draft, finish the constructor.
//Have the perimeter method return 0 and have the draw mwthod draw a
//line from point 0, 0 to point 30, 40
//

import java.util.ArrayList;
import java.awt.Point;
public class Polygon {
    // TODO: provide the required constructor, instance variable, and methods
    
    // Class instance variables
    private Point myPoint = new Point();
    private ArrayList<Point> points;
    
    /**
     * Class empty constructor
     * @parameter none.
     */
    public Polygon() {
        points = new ArrayList<Point>();
    }
    
    /**
     * Adds the x-y coordinates as a point to the polygon.
     * @param xCoord is the value of the point on the x-axis.
     * @param yCoord is the value of the point on the y-axis.
     */
    public void add(int xCoord, int yCoord) {
        //TODO: The add method adds a Point to the polygon
        Point newPoint = new Point(xCoord, yCoord);
        points.add(newPoint);
    }
    
    /**
     * Adds a point to the polygon.
     * @param point.
     */    
    public void add(Point thisPoint) {
        //TODO: The add method adds a Point to the polygon
        points.add(thisPoint);
    }    
    /*
     * /tmp/codecheck.rouJRRTSe9/PolygonTest.java:10: error: method add in class Polygon cannot 
     * be applied to given types;
       shape.add(new Point(10, 10));^
       required: int,int
       found: Point
       reason: actual and formal argument lists differ in length
     */
    
    /**
     * Clears the points of the polygon class.
     * @param none.
     * @return none.
     */
    public void clear() {
        points.clear();
    }

    /**
     * Gets the current perimeter of the polygon.
     * @return perimeter
     */
    public double perimeter() {
        //TODO: The perimeter method returns the perimeter of the polygon
        double perimeter = 0;
        if (points.size() > 2) {
            // Validate ArrayList has enough point to draw a line.
            Point firstPoint = new Point();
            Point secondPoint = new Point();
            
            for (int i = 0; i < points.size(); i++) {
                
                firstPoint = points.get(i);
                if ((i + 1) < points.size())
                    secondPoint = points.get(i + 1);
                else
                    secondPoint = points.get(0);
                
                Line myLine = new Line(firstPoint.getX(), firstPoint.getY(),
                    secondPoint.getX(), secondPoint.getY());
                    
                // Line lenght calculated using Pithagoras.
                perimeter += Math.sqrt((Math.pow(myLine.getWidth(), 2) + 
                    (Math.pow(myLine.getHeight(), 2))));
                System.out.printf("%7.2f", perimeter);
            }
            System.out.println();
        } else {
            System.out.println("Err: Not enough points in array to draw a line");
        }
        
        return perimeter;
    }
    
    /**
     * Returns the current array list as a string.
     * @return array list as a string
     */
    public String toString() {
        //TODO: The perimeter method returns the perimeter of the polygon
        return points.toString();
    }
    
    /**
     * Draws the current polygon on the canvas.
     * @return perimeter
     */
    public void draw() {
        //TODO: Draw the current polugon on the canvas
        if (points.size() > 2) {
            // Validate ArrayList has enough point to draw a line.
            Point firstPoint = new Point();
            Point secondPoint = new Point();
            
            for (int i = 0; i < points.size(); i++) {
                
                firstPoint = points.get(i);
                if ((i + 1) < points.size())
                    secondPoint = points.get(i + 1);
                else
                    secondPoint = points.get(0);
                
                Line myLine = new Line(firstPoint.getX(), firstPoint.getY(),
                    secondPoint.getX(), secondPoint.getY());
                    
                myLine.draw();
                //System.out.println(myLine.toString());
            }
        } else {
            System.out.println("Err: Not enough points in array to draw a polygon");
        }
    }
}
