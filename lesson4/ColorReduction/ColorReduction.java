
/**
 * Write a description of class ColorReduction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorReduction
{
    // instance variables - replace the example below with your own
    private double value;

    /**
     * Constructor for objects of class ColorReduction
     */
    public ColorReduction()
    {
        // initialise instance variables
        System.out.println("INICIO");
        System.out.println("----------");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod(int value)
    {
        // initialise instance variables
        //this.value = (value * 6.0) / 256;
        System.out.println("1) Value(" + value + "): " + ((value * 6.0) / 256));
        //this.value = (value * 6.0) / 255;
        System.out.println("2) Value(" + value + "): " + ((value * 6.0) / 255));
        //this.value = (value * 6) / 256;
        System.out.println("3) Value(" + value + "): " + ((value * 6) / 256) * 51);
        //this.value = (value * 6) / 255;
        System.out.println("4) Value(" + value + "): " + ((value * 6) / 255));
    }
}
