// This is the first of two problems to use these classes

// The manager class is a subclass of Employee. A Manager is different from an employee in that
// a Manager has a bonus. So we add that instance variable
//
// Add the code to complete the constructor
//
public class Manager extends Employee {
    private double bonus;

    /**
     * Constructs a Manager
     * @name the name of the manager
     * @salary the salary of this manager
     * @param theBonus the bonus for this Manager
     */
    public Manager(String name, double salary, double theBonus) {
        // TODO: complete the constructor
        
        // Calls the second employee constructor
        super(name, salary);
        this.bonus = theBonus;
    }

    public double getBonus() {
        return bonus;
    }

     // Gets the total salary for this Manager
     // that is the salary + the bonus

    public double getSalary() {
        // TODO: finish the method implementation
        return (getSalary() + this.bonus);
    }
}
