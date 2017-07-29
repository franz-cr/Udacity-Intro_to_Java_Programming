// Bluej project: lesson6/largest_countries

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;

public class LargestCountries
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Using a file chooser to selct the input file
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        Scanner in = new Scanner(chooser.getSelectedFile());

        String country = in.next();
        String name = country;
        double population = in.nextDouble();
        double largest = population;

        // TODO: Print the population and name of the country with largest population

        // HINT: What else do you need to remember?
        // What variable(s) should you add so you can
        // print the population and the country name at the end?
        while (in.hasNext())
        {
            country = in.next();
            population = in.nextDouble();
            if (population > largest)
            {
                largest = population;
                name = country;
            }
        }
        System.out.println("The country with the largest population is: " + name);
        System.out.println("The largest population is: " + largest);
    }
}
