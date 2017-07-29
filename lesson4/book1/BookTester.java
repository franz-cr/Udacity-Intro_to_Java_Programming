// BlueJ Project: lesson4/book1
// Video: Working with the Book Text

import java.util.Scanner;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");
        Book mary = new Book("mary.txt");
        Book code = new Book("BookTester.java");

        System.out.println(alice.getNumCharacters());
        System.out.println("Expected: 144331");


        System.out.println(mary.getNumCharacters());
        System.out.println("Expected: 475");
        
        System.out.println(alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1");

        System.out.println(code.firstOccurrenceOfMadHatter());
        System.out.println("Expected: 3");
        
        //alice = new Book("chapter1.txt");

        // The sentence is pretty long, but it is in a single line
        System.out.println(alice.getFirstSentence());
        System.out.println("Expected: Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'.");

        // Here, the end-of-line markers are replaced with spaces so that the actual and expected results fit on a line.
        System.out.println(mary.getFirstSentence().replace("\n", " "));
        System.out.println("Expected: Mary had a little lamb, little lamb, little lamb, Mary had a little lamb, its fleece was white as snow.");

        // The sentence is pretty long, but it is in a single line
        System.out.println(alice.getSecondSentence());
        System.out.println("Expected: So she was considering in her own mind (as well as she could, for the hot day made her feel very sleepy and stupid), whether the pleasure of making a daisy-chain would be worth the trouble of getting up and picking the daisies, when suddenly a White Rabbit with pink eyes ran close by her.");

        // Here, the end-of-line markers are replaced with a space so that the actual and expected results fit on a line.
        System.out.println(mary.getSecondSentence().replace("\n", " "));
        System.out.println("Expected: And everywhere that Mary went, Mary went, Mary went, and everywhere that Mary went, the lamb was sure to go.");

        System.out.println(alice.occurrencesOfAlice());
        System.out.println("Expected: 395");
        
        System.out.println(mary.occurrencesOfAlice());
        System.out.println("Expected: 0");
        
        System.out.println(alice.occurrencesOf("Alice"));
        System.out.println("Expected: 395");

        System.out.println(alice.occurrencesOf("Mad Hatter"));
        System.out.println("Expected: 0");
        
        // Gets users input of the word to search
        // Declare the Scanner
        Scanner sc = new Scanner(System.in);
        
        // Shows the instructions to the user.
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        String word = sc.nextLine();
        //String word = sc.next();
        /*
         * scanner.next() captures user's input delimited by a space, so captures just words.
         * scanner.nextLine() captures user's input delimited by an 'Enter' or new line.
         */
        
        // Calls the method to count the word occurrences
        int occurrences = alice.occurrencesOf(word);
        
        // Displays the occurrences resutls to the user
        System.out.println("The word '" + word + "' occurs " + occurrences + " times!");
    }
}
