
/**
 * Write a description of class InchWorm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/*
    Write a class InchWorm that models an inch worm moving along a 
    horizontal line. The inch worm  moves either to the right or left.
    Initially, the inch worm moves to the right, but it can turn to
    change its direction. In each move, its position changes by one
    unit in the current direction. 
    
    Provide two constructors. 
    One that takes the initial position as an argument,
    and one with no arguments that sets the initial position to 0. 
    
    You will need two instance variables. 
    One to keep track of the position and one to keep track of the direction. 
    You can use 1 to represent moving right and -1 to represent moving left. 
    
    Constructors:
    public InchWorm()
    public InchWorm (int initialPosition)
    
    Provide these methods:
    public void turn()
    public void move()
    public int getPosition()
    
    Sample usage:
    InchWorm worm = new InchWorm (10);
    worm.move(); // Now the position is 11
    worm.turn();
    worm.move(); // Now the position is 10
    
    
    Need help starting this question? In the lesson titled 
    "Starting points: Problem Set Questions", go to the
    problem titled "Problem Set 2 - Question 2" for some tips on 
    how to begin. 
*/

public class InchWorm
{
    // Class instance variables:
    private int position;
    private int direction;
    private double size = 7;
    private int jump = 20;
    private Rectangle head;

    /**
     * Default constructor for objects of class InchWorm. Position is initialized at 0,0.
     */
    public InchWorm()
    {
        // initialise instance variables
        this.position = 0;
        this.direction = 1;
        head = new Rectangle(position * 10, 10, size, size);
        head.fill();
    }

    /**
     * Constructor for objects of class InchWorm. Position provided to the constructor.
     */
    public InchWorm(int initialPosition)
    {
        // initialise instance variables
        this.position = initialPosition;
        this.direction = 1;
        head = new Rectangle(position * 10, 10, size, size);
        head.fill();
    }
    
    /**
     * Changes the direction of the worm's head to the opposite direction.
     *
     */
    public void turn()
    {
        // Changes the direction of the worm to the opposite direction.
        if (this.direction > 0)
            this.direction = -1;
        else
            this.direction = 1;
    }
    
    /**
     * Adds a turn to the game, moving the worm's head 1 position in the current direction.
     *
     */
    public void move()
    {
        // Move worm's head one position
        this.position += this.direction;
        head.translate(position + jump * direction, 0);
        try{
            Thread.sleep(1500);
            }
        catch (InterruptedException e){
            System.out.println(e.toString());
            }
    }
    
    /**
     * Adds a turn to the game, moving the worm's head 1 position in the current direction.
     *
     */
    public int getPosition()
    {
        // Move worm's head one position
        return this.position;
    }
}
