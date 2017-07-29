
/*  Translate the following pseudocode for randomly permuting the characters in
    a string into a method in the given Java class.
    
    Read a word.
    Repeat word.length() times
      Pick a random position i in the word, but not the last position.
      Pick a random position j > i in the word. (this is tricky)
      Swap the letters at positions j and i.
    Print the word.
    
    To swap the letters, construct substrings as follows:
    
    http://i.imgur.com/re4bGPu.png
    
    Create and return the string:
      first + word.substring(j, j + 1) + middle
            + word.substring(i, i + 1) + last
    
    For the draft, pick the random i and j as describe above. then return last. Only do this one time
    
    Need help starting this question? In the lesson titled 
    "Starting points: Problem Set Questions", go to the
    problem titled "Problem Set 5 - Question 2" for some tips on 
    how to begin.

     Actual output   Expected output
      -------------------------------
    - Udacity         yciUadt
    - Udacity         dyitaUc
    - Udacity         tiUdacy
    - Udacity         Udytiac
    - Udacity         Udactiy
    - Udacity         diyctaU
    - Udacity         Utyciad
    - Udacity         tidUayc
    - Udacity         dUacity
    - Udacity         ctaydUi

    I recommend that you implement and test the swapping before implementing
    the loop. If something is wrong in the swap, it will be much more difficult
    to find it you have executed the swap many times. That is an example of
    step-wise refinement. Code a little, test, code a little more.
    */

import java.util.Random;
/**

 */
public class Word
{
   private Random generator = new Random();

   public Word()  //leave the constructor alone
   {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
   }
   /**
    * Gets a version of this word with the leters scrambled
    * @param word the string to scramble
    * @return the scrabled string
    */
   public String scramble(String word)
   {
        //TODO scramble the letters following the pseudocode
        // Read a word.
        // Repeat word.length() times
              // Pick a random position i in the word, but not the last position.
              // Pick a random position j > i in the word. (this is tricky)
              // Swap the letters at positions j and i.
        // Print the word.
        //TODO pick a random i and j and return last as described in
        //http://i.imgur.com/re4bGPu.png
        
        String result = word;
        int length = result.length();
        
        for (int n = 0; n < length; n++) {
            int i = generator.nextInt(length - 1);
            int rest = (length - 1) - i;
            int post = generator.nextInt(rest);
            int j = i + post + 1;
            char iChr = result.charAt(i);
            char jChr = result.charAt(j);
            result = result.substring(0, i) + 
                jChr + 
                result.substring(i + 1,j) + 
                iChr + 
                result.substring(j + 1);
        }
        return result;
   }


}
