// BlueJ Project: lesson4/book1
// Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;

public class Book
{
    private String bookText;

    public Book(String fileName)
    {
        readBook(fileName);
    }

    /**
     * Calculates the number of characters (as in letters and
     * symbols, not people) in the book.
     * @return the number of letters and symbols in the book.
     */
    public int getNumCharacters()
    {
        // TODO: Complete this method
        // You will want to use the fact sheet linked in the instructor comments.
        // Which string method do you want to use?
        return bookText.length();
    }

    /**
       Finds where the string "Mad Hatter" occurs for the first time in the book.
       @return the location of the first occurrence of the string
    */
    public int firstOccurrenceOfMadHatter()
    {
        // TODO: Complete this method
        //
        // Check the fact sheet. There is a String function
        // that can do this for you.
        return bookText.indexOf("Mad Hatter");
    }
    
    /**
     * Gets the first sentence of the book. Using the '.' as the flag for the text to be returned.
     * @ return the first sentence of the book.
     */
    
    public String getFirstSentence()
    {
        //Gets the index of first sentence
        int endOfSentence = bookText.indexOf(".");
        // Substring length is the index value for this specific case
        return bookText.substring(0, (endOfSentence + 1));
    }
    
    /**
       Gets the second sentence of this book.
       @return the second sentence (including the period) of this book.
    */
    public String getSecondSentence()
    {
        // TODO: Get the second sentence
        // Locate the period of the first sentence
        // Return the substring consisting of everything after that period up to
        // the second period
        
        //Gets the index of first sentence
        int startOfSentence = bookText.indexOf(".");
        
        //When an index position is supplied as the second argument (2 in this case), 
        //search will begin AT that index.
        int endOfSentence = bookText.indexOf(".", (startOfSentence + 1));
        
        return bookText.substring((startOfSentence + 2), (endOfSentence + 1));
    }
    
    /**
     *  Counts how many times "Alice" occurs in this book.
     *  @return the number of occurrences
     */
    public int occurrencesOfAlice()
    {
        // TODO: Find the number of times the word "Alice" occurs in this book
        //Get the original book text length.
        int originalLength = bookText.length();
        
        //Replace the ocurrence of "Alice" in the original text.
        String shortenedText = bookText.replace("Alice", "");
        
        //Get shortened text length
        int shortenedLength = shortenedText.length();
        
        return ((originalLength - shortenedLength) / 5);
    }
    
    /**
     * Counts how many times a given word occurs in this book.
     * @param word a word of length >= 1
     * @return the number of occurrences
     */
    public int occurrencesOf(String word)
    {
        //Get the original book text length.
        int originalLength = bookText.length();
        
        //Replace the ocurrence of "Alice" in the original text.
        String shortenedText = bookText.replace(word, "");
        
        //Get shortened text length
        int shortenedLength = shortenedText.length();
        
        return ((originalLength - shortenedLength) / word.length());
    }

    /**
     * A method to help read the book out of the file.
     * You don't have to read this unless you want to.
     * the "try" and "catch" are java's way of dealing with
     * runtime errors or "exceptions".
     */
    public void readBook(String fileName)
    {
        bookText = "";
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
