//
//Complete the class ArrayListMethods. It consists of four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
//For the draft, provide the isSorted method.
//

import java.util.ArrayList;

public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Determine if the array is sorted.       
        if (list.size() > 0) {
            
            System.out.println(list);
            for (int i = 0; i < (list.size() - 1); i++) {
                String nameLeft = list.get(i);
                String nameRight = list.get(i + 1);
                if (nameLeft.compareTo(nameRight) > 0) {
                    //(list.get(i).compareTo(list.get(i + 1)));
                    sorted = false;
                }
            }
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use compareTo to determine which string is larger (later in alphabetical
     * order. Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {

        // TODO: Replace all but the first and last elements with the larger of its to 
        // neighbors

        if (list.size() > 0) {
            list.remove("ape");
            list.add("zebra");
        }

    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        // TODO: Write the code to get the number of duplicates in the list
        String word = "";
        int duplicates = 0;
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                word = list.get(i);
                for (int j = i + 1; j < list.size(); j++)
                    if (list.get(j).equals(word))
                        duplicates++;
            }
        }
        return duplicates;
    }

     /**
     * Moves any word that startw with x, y, or z to the front of the arraylist, but
     * otherwise prserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;

        // TODO:  Move any word that starts with x, y, or z to the front of the arraylist, but otherwise preserves the order
        String animal = list.get(2);
        list.remove(animal);
        list.add(0, animal);
        
        animal = list.get(3);
        list.remove(animal);
        list.add(1, animal);
        
        animal = list.get(5);
        list.remove(animal);
        list.add(2, animal);
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        return list.toString();
    }
}
