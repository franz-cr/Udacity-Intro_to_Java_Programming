//
//Complete the class TripPlan which describes the cities that are visited by a tour conducted by Java Now Tours.
//Keep an arraylist of cities (just the string name). Have methods to add a city, remove a city,
//to return the names of the cities in a String, and to reverse the order of the elements in the array list.
//
//Notice that the reverse method is void.

//codecheck version 1306212051  started Tue Jun 06 21:43:57 UTC 2017

// Running TripPlanTester
// ======================
// Original: TripPlan[San Jose, Silicon Valley, Denver, Austin]
// - Expected: TripPlan[San Jose,Silicon Valley,Denver,Austin]
// Reversed: TripPlan[San Jose, Silicon Valley, Denver, Austin]
// - Expected: TripPlan[Austin,Denver,Silicon Valley,San Jose]
// Removed: TripPlan[San Jose, Silicon Valley, Austin]
// - Expected: TripPlan[Austin,Silicon Valley,San Jose]
// Score
// 0/3

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    // Instance variables
    ArrayList<String> tripPlan;

    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        // Initialize the instance variable
        tripPlan = new ArrayList<String>();
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        // TODO: Write code to add a city to the array list instance variable
        this.tripPlan.add(cityName);
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String result = new String("TripPlan[");
        
        for (int i = 0; i < tripPlan.size(); i++)
            result += tripPlan.get(i) + ",";
        return (result.substring(0, result.length() - 1) + "]");
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        // TODO: Write code to remove a city to the array list instance variable
        this.tripPlan.remove(cityName);
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        // 1) Crear una copia de la lista por valores.
        // 2) Borrar la lista original.
        // 3) Recorrer la copia de la lista hacia atrás.
        // 4) Agregar al inicio de la lista original cada valor leido en 3).
        
        // VARIABLES LOCALES
        ArrayList<String> tripCopy = new ArrayList<String>(tripPlan);
        tripPlan.clear();
        
        System.out.println(tripCopy);
        System.out.println(tripPlan);
        
        for (int i = tripCopy.size() - 1; i >= 0; i--)
            tripPlan.add(tripCopy.get(i));
        System.out.println(tripCopy);
        System.out.println(tripPlan);
    }
}