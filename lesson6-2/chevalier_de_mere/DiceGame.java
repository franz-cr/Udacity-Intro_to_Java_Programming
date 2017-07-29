// Simulates 24 random dice rolls.
// Each roll has two dice. 
// Prints "He won" if any roll contained double sixes.
// Prints "He lost" otherwise.

import java.util.Random;

public class DiceGame
{
    //Instance Variables:
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
            
    public static void main(String[] args)
    {
        boolean heWins = false;
        DiceGame chevGame = new DiceGame();
        
        // YOUR CODE HERE
        // Write a loop to simulate 24 dice rolls. 
        // Track whether the Chevalier de Meré wins or not
        if(chevGame.game1())
            System.out.println("I win! (Game 1)");
        else if (chevGame.game2())
            System.out.println("He wins! (Game 2)");
        else
            System.out.println("Nobody wins!");
    }
    
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1() {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
        
        //Variables:
        int rolls = 4;
        boolean win = false;
        
        //Process:
        for (int i = 0; i < rolls; i++) {
            if (generator.nextInt(6) == 5)
                win = true;
        }            
        
        return win;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2() {
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s. 
        
        //Variables:
        int rolls = 24;
        boolean win = false;
        
        //Process:
        for (int i = 0; i < rolls; i++) {
            if ((generator.nextInt(6) == 5) && (generator.nextInt(6) == 5))
                win = true;
        }            
        
        return win;
    }
    
    public int integerRandom() {
        return generator.nextInt(11);
    }
    
    public double doubleRandom() {
        return generator.nextDouble();
    }
}
