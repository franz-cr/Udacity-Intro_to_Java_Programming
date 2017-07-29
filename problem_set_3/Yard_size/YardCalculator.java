public class YardCalculator
{
    // Instance Varaibles
    public double width = 0;
    public double length = 0;
    final protected double FEET_IN_METERS = 0.3048;
   
    public YardCalculator(int lengthFeet, int widthFeet) {
       this.length = lengthFeet * FEET_IN_METERS;
       this.width = widthFeet * FEET_IN_METERS;
    }
   
    /**
     * Constructs a YardCalculator with the given parameters
     * @param theLength the length of the yard
     * @param theWidth the width of the yard
     */
    public YardCalculator(double lengthFeet, double widthFeet) {
       this.length = lengthFeet * FEET_IN_METERS;
       this.width = widthFeet * FEET_IN_METERS;
    } 
    
    /**
     * Gets the perimeter of the yard
     * @return the perimeter
     */
    public double perimeter() {
       return ((2 * width) + (2 * length));
    }
    
    /**
     * Gets the area of the yard
     * @return the area
     */ 
    public double area() {
       return (width * length);
    }
   
     /**
     * Gets the diagonal of the yard
     * @return the diagonal
     */
    public double diagonal() {
       return (Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2)));
    }

}