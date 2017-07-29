//hw04_20
/**
 * Complete the class. Using a Scanner, ask the user to enter a series of integers
 * and count the number of even numbers
 * Use a loop. Do not let bad input (a non-integer) terminate your program with an error.
 * When the user enters any non-integer, print the number of even integers entered and quit.
 * Hint: remember hasNextInt()
 * Hint: use the % operator to determine if a number is even
 */
import java.util.Scanner;

public class CountEvenTester
{
   public static void main(String[] args)
   {
        int number = 0, counter = 0;
        //boolean isValid = false;
       
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        
        while (in.hasNextInt()) {
            
            number = in.nextInt();
            if ((number % 2) == 0) {
                counter++;
                //System.out.println("Even: " + ++counter);
            }
            System.out.print("Enter an integer: ");
            //System.out.printf("Valid Input: %6d\n\n", number);
            //System.out.print("Enter another number: ");
        }
        
        System.out.println("Even numbers: " + counter);

        /*
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) { 
            int floor = in.nextInt(); } 
        else {
            System.out.println("Enter a value number"); }
        */
   }
}