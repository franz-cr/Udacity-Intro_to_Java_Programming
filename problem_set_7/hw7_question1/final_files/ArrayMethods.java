
//
// Complete the methods below. These methods manipulate Arrays of Strings
// For the draft, complete the first method
//

import java.util.Arrays;

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted() {
        boolean sorted = true;

        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it

        if (list.length > 0) {
            
            System.out.println(list);
            for (int i = 0; i < (list.length - 1); i++) {
                String nameLeft = list[i];
                String nameRight = list[i + 1];
                if (nameLeft.compareTo(nameRight) > 0) {
                    sorted = false;
                }
            }
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its two neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {
        /*
         * compareTo: The result is a negative integer if this String object
         * lexicographically precedes the argument string. The result is a positive
         * integer if this String object lexicographically follows the argument string.
         * The result is zero if the strings are equal; compareTo returns 0 exactly when
         * the {@link #equals(Object)} method would return true .
         */
        String leftNeighbor, rightNeighbor, largerNeighbor;
        
        for (int i = 1; i < (list.length - 1); i++) {
            leftNeighbor = list[i - 1];
            rightNeighbor = list[i + 1];
            if (leftNeighbor.compareTo(rightNeighbor) > 0)
                 largerNeighbor = leftNeighbor;
            else 
                largerNeighbor = rightNeighbor;
            if (largerNeighbor.compareTo(list[i]) > 0)
                list[i] = largerNeighbor;
        }

    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates() {
        String word = "";
        int duplicates = 0;
        
        if (list.length > 0) {
            for (int i = 0; i < list.length; i++) {
                word = list[i];
                for (int j = i + 1; j < list.length; j++)
                    if (list[j].equals(word))
                        duplicates++;
            }
        }
        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront() {
        int insertAt = 0;
        String word = "";
        
        for (int i = 0; i < list.length; i++)
            if ("xyzXYZ".contains(list[i].substring(0, 1))) {
              moveElementFromTo(i, insertAt);
              insertAt++;
          }
    }
    
    public void moveElementFromTo(int fromIndex, int toIndex) {
        //System.out.printf("From: %3d, to %3d\n", fromIndex, toIndex);
        String temp = list[fromIndex];
        
        for (int i = fromIndex; i > toIndex; i--)
            list[i] = list[i - 1];
        
        list[toIndex] = temp;
    }
    
    public void makeRoomAt(int pos) {
        this.list = Arrays.copyOf(list, list.length + 1);
        
        for (int i = list.length - 1; i > pos; i--) {
            list[i] = list[i - 1];
            }
        //list[pos] = newValue;
        
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString() {
        String result = "[";
        
        for (int i = 0; i < list.length; i++) {
            result += list[i] + ", ";
        }
        return result.substring(0, result.length() - 2) + "]";
    }
    
    /**
     * Converts a decimal number into a binary representation
     * @params the decimal number to be converted
     * @returns the binary representation as a string.
     */
    public String toBinary(int decimal) {
        String result = "";
        int divisor = (int)(decimal / 2);
        Integer module = decimal % 2;
        
        if (divisor == 0) 
            return module.toString();
        else
            return  toBinary(divisor) + module.toString();
    }
}