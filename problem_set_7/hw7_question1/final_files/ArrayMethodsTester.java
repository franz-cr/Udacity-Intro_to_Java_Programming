import java.util.ArrayList;
public class ArrayMethodsTester
{
    public static void main(String[] args)
    {
        //set up
        String[] animals = {"cat", "ape", "dog", "horse", "zebra"};
        ArrayMethods zoo = new ArrayMethods(animals);
        
        //test replaceWithLargerNeighbor
        System.out.println("Curent: " + zoo.toString());
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("Expected: [cat, dog, horse, zebra, zebra]");
        
        //test count duplicates;
        String[] animals2 = {"cat", "cat", "dog", "horse", "zebra", "zebra"};
        zoo = new ArrayMethods(animals2);
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected duplicates: 2");
       
        String[] animals3 = {"dog", "cat", "cat", "dog", "horse", "zebra", "zebra"};
        zoo = new ArrayMethods(animals3);
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected duplicates: 3");        
        
        String[] animals4 = {"ape", "dog", "xantus",  "zebra", "cat", "yak"};
        zoo = new ArrayMethods(animals4);
        System.out.println("xyzToFront: " + zoo.toString());
        zoo.xyzToFront();
        System.out.println(zoo.toString());
        System.out.println("Expected xyz2front: [xantus, zebra, yak, ape, dog, cat]");
        
        System.out.println("Decimal to binary:");
        System.out.println("4 => " + zoo.toBinary(4));
        System.out.println("5 => " + zoo.toBinary(5));
        System.out.println("6 => " + zoo.toBinary(6));
    }
}
