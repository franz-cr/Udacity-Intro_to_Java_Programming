// Bluej project: lesson6/counting_matches_digits

import java.util.Scanner;

/**
 * A class that represents a number and can report
 * properties of the number.
 */
public class Number
{
    private long number;

    public Number(long number)
    {
        this.number = number;
    }

    /**
     * Returns the number of times digitToMatch appears
     * in this number.
     * @param digitToMatch the digit to search for.
     *   must be at least 0 and at most 9.
     * @return number of occurrences of digitToMatch
     */
    public int countMatchingDigits(int digitToMatch)
    {
        //Scanner in = new Scanner(System.in);
        int digit = 0, counter = 0;
        long copy = this.number;
        // TODO: count and return the number of times the given digit appears in the number
        
        while (copy > 0) {
            digit = (int)(copy % 10);
            if (digitToMatch == digit)
                counter++;
            copy = copy / 10;
        } 
        /*
        long n = cardNumber;
        int sum = 0;
        int count = 0;
        int digit = 0;

        // TODO this is the code from the last question. you can use it
        // as a starting point, but you will need to change most of it.
        while (n > 0)
        {
            count++;
            digit = (int)(n % 10); 
            if ((count % 2) != 0)
                sum = sum + digit;
            else if (digit < 5)
                sum += 2 * digit;
            else
                sum += (2 * digit - 9);
            n = n/10;
        }
        
        if ((sum % 10) == 0)
            return true;
        else
            return false;
         */

        // Hint: The last digit is (int)(numbers % 10).
        return counter;
    }
}
