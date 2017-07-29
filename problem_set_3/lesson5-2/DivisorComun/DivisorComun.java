
/**
 * Write a description of class DivisorComun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisorComun
{
    // instance variables - replace the example below with your own
    private int div1;
    private int div2;

    /**
     * Constructor for objects of class DivisorComun
     * @param   divisor1 and dividor2 are the actual values to check
     * @return  Nothing
     */
    public DivisorComun(int divisor1, int divisor2)
    {
        // initialise instance variables
        this.div1 = divisor1;
        this.div2 = divisor2;
    }

    /**
     * Gets the common divisor
     *
     * @param   None
     * @return  None
     */
    public void getComunDivisor()
    {
        // VARIABLES LOCALES:
        int mayor = 0, residuo1 = 0, residuo2 = 0;
        
        // PROCESO:
        if (this.div1 > this.div2) {
            mayor = this.div1;
        }
        else {
            mayor = this.div2;
        }
        
        System.out.printf("==== Divisor común de %d y %d ====\n", div1, div2);
        
        for (int x = 2; x <= mayor; x++) {
            residuo1 = div1 % x;
            residuo2 = div2 % x;
            if ((residuo1 + residuo2) == 0) {
                System.out.print(x + ", ");
            }
        }
    }
}
