// BlueJ project: lesson7/friends1

// This is part of the Person class from lesson 3.
// A String is not the right way to store the friends of a Person
// We need to refactor this code.
// Change the friends variable to store an ArrayList<String>
// that contains the names of the friends.
// Re-implement the addFriend and getFriends methods.
import java.util.ArrayList;

public class Person
{
    private String firstName, lastName;
    //private String friends;
    private static final String SEPARATOR = ", ";
    private ArrayList<String> friends = new ArrayList<String>();

    public Person(String name)
    {
        this.firstName = name;
        this.friends.clear();
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend.getName());
    }

    /**
     * Gets the name of the person as a string.
     * @return the name of the person..
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getName()
    {
        return this.firstName;
    }
    
    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        // FRZ: My solution to the problem of returning a list of friends using this format:
        // Friend list: Cheng-Han, Cay
        String result = "";
        
        for (int i = 0; i < (friends.size()); i++)
            result += friends.get(i).toString() + ", ";
        if (friends.size() > 0)
            result = result.substring(0, (result.length() - 2));
        return result;
        
        /* FRZ: Solution from Udacity's team:
         * String allFriends = friends.toString();
         * return allFriends.substring(1, allFriends.length() - 1);
         * 
         * .toString return the array list this way: [Cheng-Han, Cay]
         * The .substring used leaves out the 2 brackets.
         */
    }

    /**
     * Gets a friend at a given index.
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex, or "" if the friend is not present
     */
    public String getFriend(int friendIndex)
    {
        if (friendIndex >= 0 && friendIndex < friends.size())
            return friends.get(friendIndex).toString();
        else
            return "";
    }
    
        public int getNumFriends()
    {
        // YOUR CODE HERE
        // How would you do this without adding more than one line?
        // Think about ArrayList methods we talked about that might help you.
        return friends.size();
    }
}
