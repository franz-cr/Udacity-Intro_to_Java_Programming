package ps8.hw8c.final_files;

/*
Implement a class Robot that simulates a robot wandering randomly on an infinite plane.
The robot is located at a point with integer coordinates. It initially faces "North" - 
the top of the window.

Supply a constructor that specifies the initial x, y coordinates of the robot as ints.

Supply methods:
public void makeRandomMove()
public Point getLocation()
public double getDistanceFromStart()

The makeRandomMove method moves the robot by one unit in a random direction.
To choose the random direction, generate an int from 0 to 3. 
 0 is toward the top of the window (north)
 1 is towards the bottom of the window (south)
 2 is towards the right side of the window (east)
 3 is towards the left side of the window (west)

getLocation() returns a java.awt.Point containing the current x and y location of the Robot

getDistanceFromStart() returns the distance the robot is from the starting point.

This problem is an example of describing the design pattern, position of an object.

You would expect that if the robot is moving randomly that he would wind up very close to
where he started, but that is not true. It would take more of a mathematician than I am to
explain why. But it is interesting. You can comment out the generator.setSeed(...) statement
and see lots of different outcomes. But do not forget to put the statement back in. When you
"seed" a random number generator with a starting value, it will give the same sequence of 
values every time. That is what makes it possible to test your programs. If we both start
with the same seed in the random number generator, we should get the same answers.
import java.awt.Point;
import java.util.Random;
*/

import java.awt.Point;
import java.util.Random;

/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot {
    // INSTANCE VARIABLES
    private final int x_origin;
    private final int y_origin;
    private Random generator;
    private Point currentPosition;
    private final Point originPosition;

    /**
     * Constructor for objects of class Robot
     * @params x-Origin is the x-coordinate of the robot's origin location in the x-axis.
     * @params y-Origin is the y-coordinate of the robot's origin location in the x-axis.
     */
    public Robot(int x_Origin, int y_Origin) {
        // initialise instance variables
        this.x_origin = x_Origin;
        this.y_origin = y_Origin;
        
        generator = new Random(12345);
        currentPosition = new Point(x_Origin, y_Origin);
        originPosition = new Point(x_Origin, y_Origin);
    }

    /**
     * Gets the distance traveled by the robot from the start point
     *
     * @param  none
     * @return the distance units as a double.
     */
    public double getDistanceFromStart() {
        // put your code here getLocation
        
        return currentPosition.distance(originPosition);
    }
    
    /**
     * Gets the distance traveled by the robot from the start point
     *
     * @param  none
     * @return the robot's current location point.
     */
    // TODO Supply getLocation
    public Point getLocation() {
        return currentPosition;
    }
    
    /**
     * Moves the robot 1 unit towards a random polar direction.
     * The makeRandomMove method moves the robot by one unit in a random direction.
     * To choose the random direction, generate an int from 0 to 3. 
     * 0 is toward the top of the window (north)
     * 1 is towards the bottom of the window (south)
     * 2 is towards the right side of the window (east)
     * 3 is towards the left side of the window (west)
     * 
     * NOTE: The y-coordinates work different in Java as in ortogonal systems since moving to the south
     * mean a positive (addition) movement and north mean negative movement.
     *
     * @param  none
     * @return the robot's current location point.
     */
    public void makeRandomMove() {
        int direction = generator.nextInt(4);
        switch(direction) {
            case 0: 
                currentPosition.translate(0, -1);
                break;
            case 1:
                currentPosition.translate(0, 1);
                break;
            case 2:
                currentPosition.translate(1, 0);
                break;
            case 3:
                currentPosition.translate(-1, 0);
        }
    }
    
    public void gaussianRandom () {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 12; x++)
                System.out.printf("%7.2f,", generator.nextGaussian());
            System.out.println();
        }
    }
}
