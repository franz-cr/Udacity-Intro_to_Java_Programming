// Bluej project: lesson6/average_q
import java.util.Scanner;

// TODO: Update your method average() so that it can accept
// altitudes (which can be positive, negative or zero).
// Use Q as a sentinel value instead of 0.
// Use the scanner method hasNextDouble to control your loop.
// Remember to change the prompt.
public class Average
{
    public static void main(String[] args)
    {
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
    }
}
