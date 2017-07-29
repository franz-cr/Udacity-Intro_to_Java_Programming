// BlueJ project: lesson8/carshare3

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation
{
    private ArrayList<Car> cars;
    private ArrayList<Person> people;

    public Simulation() {
        cars = new ArrayList<Car>();
        people = new ArrayList<Person>();
    }

    /**
       Reads the car and person data. Each row has the format
       n    Driver or Passenger Name   Destination
       where n is the number of seats for a car,
       0 for a passenger, -1 to signify the end of input.
       @param in the scanner to read from
       
4 Drv01 3
4 Drv02 4
0 Psg01 4
0 Psg02 3
0 Psg03 3
0 Psg04 4
0 Psg05 2
0 Psg06 3
-1
    */
    public void read(Scanner in) {
        boolean done = false;
        System.out.println("Enter input of the form n Name Destination");
        System.out.println("n > 0: Car with n seats, n = 0: Passenger, n = -1: End of input");
        while (!done) {
            int capacity = in.nextInt();
            if (capacity == -1) {
                done = true;
            } else {
                String name = in.next();
                int destination = in.nextInt();
                if (capacity == 0)
                    people.add(new Person(name, destination));
                else
                    cars.add(new Car(name, capacity, destination));
            }
        }
    }

    /**
       Load all passengers into cars.
    */
    public void loadPassengers()
    {
        // L?GICA:
        // Toma al primer pasajero y recorre los carros para buscarle espacio.
        // Evaluar si el carro pasa por el destino de la persona.
        // Evaluar si hay espacio.
        // Agregar persona a lista de pasajeros.
        // Toma al siguiente pasajero y recorre los carros para encontrarle espacio.
        boolean isAssigned = false;
        int carIndex = 0;
        
        for (Person passenger : people) {
            while (!isAssigned && carIndex < cars.size()) {
                Car car = cars.get(carIndex);
                if (car.tryToAdd(passenger)) 
                    isAssigned = true;
                else
                    carIndex++;
            }
            isAssigned = false;
            carIndex = 0;
        }
    }

    /**
       Drive all cars until they have arrived.
    */
    public void driveCars()
    {
        // Leave blank for now
        // TODO: Implement this method
        // Eval?a si el carro ya est? en su destino final
        // Mueve el carro al siguiente lugar.
        // Descarga a la(s) persona(s) que llegaron a su destina
        // if (location < destination) {
            // location++;
            // for (int i = 0; i < passengers.size(); i++) {
                // if (passengers.get(i).getDestination() == location) {
                    // passengers.remove(i);
                    // i--;
                // }
            // }
        // }        
    }

    public String toString()
    {
        return cars.toString();
    }
}
