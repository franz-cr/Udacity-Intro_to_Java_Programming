// BlueJ project: lesson8/carshare1
// To-do:
// implement tryToAdd()
import java.util.ArrayList;

public class Car
{
    private ArrayList<Person> passengers;
    private int numberOfSeats;
    private String driverName;
    private int location;
    private int destination;

    public Car(String driverName, int numberOfSeats, int destination)
    {
        passengers = new ArrayList<Person>();
        this.driverName = driverName;
        this.numberOfSeats = numberOfSeats;
        location = 0;
        this.destination = destination;
    }

    /**
       Gets the name of this car's driver.
       @return the driver name
    */
    public String getDriverName()
    {
        return driverName;
    }

    /**
       Checks whether this car has arrived at its destination.
       @return true if the car has arrived
    */
    public boolean hasArrived()
    {
        return location == destination;
    }

    /**
       Tries to add a passenger.
       @param p the new passenger
       @return true if there is room in the car and the passenger's
       destination on the way to this car's destination
    */
    public boolean tryToAdd(Person p)
    {
        // TODO: Complete this method
        // Evaluar si el carro pasa por el destino de la persona.
        // Evaluar si hay espacio.
        // Agregar persona a lista de pasajeros.
        int personDestination = p.getDestination();
        int availableSeats = numberOfSeats - passengers.size() - 1;
        
        if ((personDestination <= this.destination) && (availableSeats > 0)) {
            passengers.add(p);
            return true;
        } else 
            return false;
    }

    /**
       Drives this car to the next location and drops off
       any passengers whose destination is that location
    */
    public void drive()
    {
        // Leave blank for now
    }
}
