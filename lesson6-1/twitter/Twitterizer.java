// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        String shortPost = longPost;
        String letter = "";
        
        for (int i = 0; i < shortPost.length(); i++) {
            letter = shortPost.substring(i, i + 1);
            if ("AEIOUaeiou".contains(letter)) 
                shortPost = shortPost.replace(letter, "");
        }

        return shortPost;
    }
}
