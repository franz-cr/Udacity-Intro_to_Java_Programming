// BlueJ project: lesson6/largest1

// Read in the values that the user supplies, stopping
// when the user enters Q (or any other input that is
// not a number). Print out the largest value that
// the user entered.
// Inputs can be done this way too: 2,3 4,3 5,1 3,3 4,5 2,0 q

import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String prompt = "Enter values, Q to quit: ";
        
        System.out.println(prompt);
        double largest = in.nextDouble();
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (largest < input)
            {
                largest = input;
            }
            //System.out.print(prompt);
        }
        System.out.println("Largest value: " + largest);
    }
}
