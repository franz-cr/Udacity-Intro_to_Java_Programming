//hw05_11
//
// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters zero or  a negative number
// keep a running total and keep track of the number of entries
// then find and return the average
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;

public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0, value = 0;

        do {
            System.out.print("Enter a score. -1 to quit: "); 
            //use this for the prompt
            
            value = in.nextDouble();
            // TODO: Collect values from the user until they enter a 0.
            // Track the sum of all the inputs so you can calculate the
            // average at the end
            sum += value;
            count++;
        } while (value >= 0);
        count--;
        
        return sum / count;
    }
}