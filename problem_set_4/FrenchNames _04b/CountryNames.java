//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe


//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

//For the draft: handle the case where the French name starts with a vowel .
//(If the name starts with a vowel, add l'). Leave all other names unchanged.

public class CountryNames
{
    // INstance variables
    private String article = "";
    
    public CountryNames () {
        // Nothing to do
    }
    
    /**
     * Gets the name with the proper article
     * @param name the country name
     * @return the name prepended with the proper article
     */
    public String getCompleteName(String name) {
        // Local Variables
        String fullName = "";
        int length = name.length();

        //Exceptions of no article:
        //  Tahiti
        //  Malte
        //  Cuba
        //  Chypre
        //  Bolivie
        
        // Process
        if (name.equals("Etats-Unis") ||
                 name.equals("Pays-Bas") ||
                 name.equals("Amériques"))
            article = "les ";
        else if (isVowel(name.substring(0, 1)))
            article = "l'";
        else if (name.substring(length - 1, length).equals("e"))
            article = articleCaseE(name);
        else
            article = "le ";
            
        return (article + name);
    }
    
    private String articleCaseE(String countryName) {
        
        //Exceptions to rule:
        //  le Belize
        //  le Cambodge
        //  le Mexique
        //  le Mozambique
        //  le Zaire
        //  le Zimbabwe
        
        if (countryName.equals("Belize") ||
            countryName.equals("Cambodge") ||
            countryName.equals("Mexique") ||
            countryName.equals("Mozambique") ||
            countryName.equals("Venezuela") ||
            countryName.equals("Zaire") ||
            countryName.equals("Zimbabwe"))
            return "le ";
        else
            return "la ";
    }
    
    private boolean isVowel(String letter) {
        // Local variables
        
        // Process
        if ("AEIOUaeiou".contains(letter))
            return true;
        else
            return false;
    }

}
