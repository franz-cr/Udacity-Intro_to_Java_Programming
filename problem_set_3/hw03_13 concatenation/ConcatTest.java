//03_13
/**
 * Complete the code to return a string
 * consisting of the name, a colon(:), a space, and the score.
 */
public class ConcatTest
{
   /**
    * Gets a string in the format name: score
    * @param name the name to concatenate
    * @param score the score to concatenate
    * @return the new string
    */
   public String concatenation(String name, int score)
   {
       //Short Problem #14 solution
       String book = "My favorite book is, \"Warrior's Apprentice\"";
       //your code goes here
       return (name.concat(": " + Integer.toString(score)));
    }
}
