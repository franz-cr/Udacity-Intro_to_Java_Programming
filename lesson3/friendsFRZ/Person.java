
/**
 * Write a description of class Person here.
 *
 * @author Franz J. Ulrich
 * @version 20170417
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private String friends;

    //Constructor for objects of class Person
    public Person(String aName)
    {
        // initialise instance variables
        name = aName;
        friends = "";
    }
    
    /*
    // TODO #1: Fill in the rest of the arguments to the Person constructor
    // The Person constructor should take in 3 additional arguments:
    // 1) String pictureName
    // 2) int xCoord
    // 3) int yCoord
    public Person (String aName, String picName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        
        // TODO #2: Fill in the rest of this constructor
        //
        // You need to create a local variable called picture and assign to
        // picture the picture that we want to use.
        //
        // You need to move the picture to xCoord and yCoord.
        // You can move the picture object by calling the translate method.
        //
        // The last step is to draw the picture.
        
        Picture personPicture = new Picture(picName);
        personPicture.translate(xCoord, yCoord);
        personPicture.draw();
    }
     */
    
    public String getFriends()
    {
        // Returns all friends in String format
        return friends;
    }

    public void addFriend(Person friend)
    {
        // Adds a friend to the friends list
        friends = friends + friend.name + " ";
    }
    
    public void unFriend(Person nonFriend)
    {
        // Removes a frind from the friends list
        friends = friends.replace(nonFriend.name + " ", "");
    }
}
