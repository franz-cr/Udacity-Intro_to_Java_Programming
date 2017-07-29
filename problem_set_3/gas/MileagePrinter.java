import java.util.Scanner;
import java.util.Locale;

/*  Write a program called MilagePrinter that asks the user to input the following values:
        - The number of gallons currently in the tank
        - The fuel efficiency in miles per gallon
    
    and then prints how far the car can go on the gas in the tank and the cost of driving 100 miles. 
    Print the distance with 1 decimal point and the cost with 2 decimals.
    
    Use System.out.print and not System.out.println. Otherwise your output will not be
    formatted correctly
    
    Assume the cost per gallon is $3.95. Define it as a constant:
        final double COST_PER_GALLON = 3.95;
    
    If value entered for efficiency is less than or equal to 0, print "No can go".
    Otherwise continue with the calculations. You output should be in the exact
    format shown below. The text will be identical - only the numbers will change.
    
    Sample runs for the final version:
    Enter the number of gallons of gas in the tank 5.1
    Enter the fuel efficiency 35.0
    Distance:   178.5
    Cost:       11.29
    
    Enter the number of gallons of gas in the tank 25
    Enter the fuel efficiency -5
    No can go 
    
    Need help starting this question? In the lesson titled 
    "Starting points: Problem Set Questions", go to the
    problem titled "Problem Set 3 - Question 2" for some tips on 
    how to begin. 
    
    Important: Be sure to print the string exactly as shown 
 */

public class MileagePrinter
{
    //Instance variables:
    protected final double COST_PER_GALLON = 3.95;
    private double currentGallons = 0;
    private double efficiency = 0;
    
    public static void main(String[] args) {
        
        // Creates instance of its own class
        MileagePrinter myMileage = new MileagePrinter();
        
        // Gets the data from the user
        myMileage.getData();
        
        // Checks that efficiency is a valid value
        if (myMileage.validEfficiency()) {
            // Prints out the information entered
            System.out.printf("Distance: %5.2f\n", myMileage.Distance());
            System.out.printf("Cost: %10.2f", myMileage.CostOfHundredMiles());
        }
        else 
            System.out.print("No can go");
    }
    
   public boolean validEfficiency () {
        return efficiency > 0 ? true : false;
    }
    
    public MileagePrinter() {
    }
    
    /**
     * Gets and populates the currentGallons and efficiency variables
     * @params none
     * @return none
     */
    
    public void getData() {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        //Prompt the user with instructions
        System.out.print("Enter the number of gallons of gas in the tank ");
        currentGallons = in.nextDouble();
        
        // Gets the efficiency from the user
        System.out.print("Enter the fuel efficiency ");
        efficiency = in.nextDouble();
    }
    
    /**
     * Calculates the distance in miles the car can go with the provided gallons 
     * in the tank.
     * @parameter none
     * @return the distance in miles
     */
       
    public double Distance() {
        // Local variables
        double distance = 0;
        
        // Process to calculate the distance
        distance = this.currentGallons * this.efficiency;
        return distance;
    }
    
        /**
     * Calculates the cost of driving 100 miles with the given efficiency 
     * in the tank.
     * @parameter none
     * @return the cost of 100 miles
     */
       
    public double CostOfHundredMiles() {
        // Local variables
        double cost = 0;
        
        // Process to calculate the distance
        cost = (100 / this.efficiency) * COST_PER_GALLON;
        return cost;
    }
}
