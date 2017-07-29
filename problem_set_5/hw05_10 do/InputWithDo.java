// Complete the method below. The method asks the user to input an integer 
// between 1 and 10 (inclusive)
// It keeps asking until the number is in the correct range and then returns it.
// use a do loop

// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to create a Scanner object to read input from the user.

import java.util.Scanner;
import java.io.IOException;

public class InputWithDo //throws IOException
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        // TODO Write code to get a number ion the range of 1 to 10
        // HINT: You will need to import the Scanner class and create a Scanner object to use to get input from the user
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt

        Scanner input = new Scanner(System.in);
        boolean validNumber = false;
        int number = 0;
        //String data;
        
        do {
            System.out.print("Enter an integer >=1 and <=10: ");
            number = input.nextInt();
                if (number >= 1 && number <= 10)
                    validNumber = true;
            //System.out.print("Input: " + data); input.hasNextInt()
        } while (!validNumber);
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt

        return number;
    }
}
