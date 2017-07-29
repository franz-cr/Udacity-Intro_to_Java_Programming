//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substring of word, sorted by length.
//
//For example, if the user provides the input "rum", the method returns a
//string that will print like this

//r
//u
//m
//ru
//um
//rum


//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

//For the draft provide the constructor, the instance method ,
//and a stub for the getSubstring method that returns null.

public class Word
{

    //TODO write the constructor and define the instance variable
    String word;
    
    /**
     * Constructor of Word class.
     * @parameter   takes any string of characters and saves it in the instance variable
     */
    public Word(String word) {
        this.word = word;
    }

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */

    public String getSubstrings()
    {

        //TODO complete the stub to return null
        String resultado;
        String subStr01 ="", subStr02 ="", subStr03 ="", subStr04 ="", subStr05 ="",
            subStr06 ="", subStr07 ="";
       
        for (int ini = 0; ini < this.word.length(); ini++) {
           for (int fin = 1; fin <= this.word.length(); fin++) {
               if ((fin - ini) == 1)
                   subStr01 += this.word.substring(ini, fin) + "\n";
               if ((fin - ini) == 2)
                   subStr02 += this.word.substring(ini, fin) + "\n";
               if ((fin - ini) == 3)
                   subStr03 += this.word.substring(ini, fin) + "\n";
               if ((fin - ini) == 4)
                   subStr04 += this.word.substring(ini, fin) + "\n";
               if ((fin - ini) == 5)
                   subStr05 += this.word.substring(ini, fin) + "\n";
               if ((fin - ini) == 6)
                   subStr06 += this.word.substring(ini, fin) + "\n";
               if ((fin - ini) >= 7)
                   subStr07 += this.word.substring(ini, fin) + "\n";
            }
        }
        
        return (subStr01 + subStr02 + subStr03 + subStr04 + subStr05 + subStr06 + subStr07);
    }
}
