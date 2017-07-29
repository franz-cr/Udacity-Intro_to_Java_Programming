//Complete the  method getLength() which takes a Comparable object as its parameter.
// If parameter references a String object, return the length of the String
//otherwise return -1.
public class DataMethods implements Comparable {
    /**
     * Gets the length of the object if it is a string
     * @param c the object wehose length we want
     * @return the length if the object is a string otherwise -1
     */

    // TODO: implement the method described by this javadoc
    public int getLength(Comparable c) {
        try {
          String string = (String)(c);
          return (string.length());
        } catch (Exception e) {
            return -1;
        }        
    }

    public int compareTo(Object object) {
        try {
          String string = (String)(object);
          return (string.length());
        } catch (Exception e) {
            return -1;
        }
    }
}