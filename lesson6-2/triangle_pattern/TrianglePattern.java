// Print the following pattern of brackets: 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]
public class TrianglePattern
{
    public static void main(String[] args)
    {
        // YOUR CODE HERE
        // Local Variables:
        final int ROWS = 6;
        int tCount = 1;
        // Write nested loops so that on the first row
        // you print one pair of brackets and on the 
        // second row you print 2 pairs of brackets, and
        // so on...
        
        for (int r = 0; r < ROWS; r++) {
            for (int t = 1; t < (r + 2); t++)
                System.out.print("[]");
            System.out.println();
            tCount++;
        }
        for (int r = ROWS; r > 0; r--) {
            for (int t = tCount; t > 1; t--)
                System.out.print("[]");
            System.out.println();
            tCount--;
        }
    }
}
