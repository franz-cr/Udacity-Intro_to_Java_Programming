/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
    public int largestPowerOf2(int n)
    {
        //TODO: implement this method.
        int parcial = 0;
        int result = 0;

        for (int i = 0; n > parcial; i++) {
            result = parcial;
            parcial = (int)(Math.pow(2, i));
        }
        
        return result;
    }
}
