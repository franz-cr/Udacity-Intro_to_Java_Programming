import java.util.ArrayList;
public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        //set up
        ArrayList<String> animals = new ArrayList<String>();
        ArrayListMethods zoo = new ArrayListMethods(animals); 
        animals.add("ape");
        animals.add("dog");
        animals.add("zebra");
        
        //test isSorted
        System.out.println("< IS SORTED >");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: true");
        
        zoo.list.add("cat");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
        
        zoo.list.remove("cat");
        zoo.list.add(0,"cat");
        System.out.println(zoo.isSorted());
        System.out.println("Expected: false");
               
        zoo.list.add(3,"horse");
        
        //test replaceWithLargerNeighbor
        System.out.println("< LARGER NEIGHBOR >");
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("Expected: [cat, dog, horse, zebra, zebra]");
        
        zoo.list.add(0,"cat");
        
        //test count duplicates;
        System.out.println("< DUPLICATES >");
        System.out.println(zoo.toString());
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 2");
        System.out.println(zoo.toString());
        zoo.list.add(4,"dog");
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 3");
        
        
        //start with fresh array list
        animals = new ArrayList<String>();
        zoo = new ArrayListMethods(animals); 
        
        //does empty array list work?
        System.out.println("< EMPTY LIST TESTS >");
        System.out.println(zoo.toString());
        System.out.println(zoo.isSorted());
        System.out.println("Expected: true");
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("Expected: []");
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 0");
        
        //test xyzToFront
        System.out.println("< XYZ TO FRONT >");
        zoo.list.add("ape");
        zoo.list.add("dog");
        zoo.list.add("xantus");
        zoo.list.add("zebra");
        zoo.list.add("cat");
        zoo.list.add("yak");
        
        System.out.println(zoo.toString());
        zoo.xyzToFront();
        System.out.println(zoo.toString());
        System.out.println("Expected: [xantus, zebra, yak, ape, dog, cat]");
    }
}
