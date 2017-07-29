// BlueJ project: lesson6/counting_matches

import java.util.Scanner;
public class CountingMatches
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double value;
        int counter = 0;
        String prompt = "Enter a value, Q to quit: ";

        // TODO: Prompt the user for a value until they enter Q
        // count how many times the user enters a negative number
        // using the variable counter
        System.out.print(prompt);
        while (in.hasNextDouble())
        {
            value = in.nextDouble();
            if (value < 0)
                counter++;
            System.out.print(prompt);
        } 

        System.out.println("The water line fell on " + counter + " years.");
        
        /*
        Scanner in = new Scanner(System.in);
        double value;
        int count = 0;
        double sum = 0;
        String prompt = "Enter a value, Q to quit: ";

        System.out.print(prompt);
        while (in.hasNextDouble())
        {
            value = in.nextDouble();
            sum = sum + value;
            count++;
            System.out.print(prompt);
        } 
        
        double average = sum / count;
        System.out.printf("Average: %.2f\nCount: %6d", average, count);
         */
    }
}
