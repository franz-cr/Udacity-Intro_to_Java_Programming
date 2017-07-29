/**
   A simulated car that consumes gas as it drives.
*/
public class CarClassExample
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
   

    /**
       Constructs a car with a given fuel efficiency.
    */
    public CarClassExample(double mpg)
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
    }

  
    /**
      TODO: Add your documentation for the addGas class
      Don't forget to explain what the input paramater
      amount means or does
      Adds the provided amount in gas into the gas tank.
      @param amount the quantity in gallons of gas to add into the tank
    */
   
    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    /**
      Gets the current amount of gas in the tank of this car.
      @return the current gas level
    */
    public double getGasInTank()
    {
        return gasInTank;
    }

    /**
      Drives this car by a given distance.
      @param distance the distance in miles to drive
    */
    public void drive(double distance)
    {
        this.milesDriven = this.milesDriven + distance;
        double gasConsumed = distance / this.milesPerGallon;
        this.gasInTank = this.gasInTank - gasConsumed;
    }  

    /**
      Gets the current mileage of this car.
      @return the total number of miles driven
    */
    public double getMilesDriven()
    {
        return milesDriven;
    }
}
