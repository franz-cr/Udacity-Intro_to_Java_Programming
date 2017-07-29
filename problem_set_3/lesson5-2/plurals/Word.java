// Bluej project: plurals
public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        // TODO: Complete this method
        // In all the other case just add an s.
        // you can use the
        //  isVowel
        //  isConsonant
        //  is
        // methods from below.
        int last = this.letters.length() - 1;
        
        // Word ending in 'y' ...
        if (isSuffix(last, "y")) {
            // and preceeded by a consonant
            if (isConsonant(last-1)) {
                return (letters.substring(0, last) + "ies");
            }
            // and preceeded by a consonant
            else 
                return (letters + "s");
        } 
        // Words ending in 'o', 's', 'sh' or 'ch'
        else if (isCase2(last))
            return (letters + "es");
        else
            return (letters + "s");
    }
    
    /**
     * Tests if the last letters are a 'y' and the precedent letter cases.
     * @param   none
     * @return  boolean
     */
    public boolean isCase1 (int _last) {
        
        return (isSuffix(_last, "o") 
                || isSuffix(_last, "s") 
                || isSuffix(_last, "sh") 
                || isSuffix(_last, "ch"));
    }
    
    /**
     * Tests if the last letters are an 'o', 's', 'sh' or 'ch'.
     * @param   none
     * @return  boolean
     */
    public boolean isCase2 (int _last) {
        // You add an es when a word ends in o, or s, or sh, or ch.
        return (isSuffix(_last, "o") 
                || isSuffix(_last, "s") 
                || isSuffix(_last, "sh") 
                || isSuffix(_last, "ch"));
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }

    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
    
    /**
     * Checks what letters are in position i-1 and i
     * @return true when the last 2 letters of letters is the given letters.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean isSuffix(int index, String suffix)
    {
        int qty = suffix.length() - 1;
        return this.letters.substring(index - qty, index + 1).equals(suffix);
    }
}
