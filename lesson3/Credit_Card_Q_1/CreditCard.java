/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
    Create a class CreditCard that represents a credit card account.
    You need to construct a new credit card with a 0.0 balance. 
    
    The constructor will have this header:
    public CreditCard()
    
    CreditCard will have these methods:
    public void purchase(double amount)
    public void payment(double amount)
    public double getBalance()
    
    Need help starting this question? In the lesson titled 
    "Starting points: Problem Set Questions", go to the
    problem titled "Problem Set 2 - Question 1" for some tips on 
    how to begin. 
*/

public class CreditCard
{
    // Instance variables
    private double balance;

    /**
     * Constructor for objects of class CreditCard, has no parameters
     */
    public CreditCard()
    {
        // Initialise instance variables
        this.balance = 0;
    }

    /**
     * This method debits the amount provided to the current card balance.
     *
     * @param  amount  a sample parameter for a method
     */
    public void purchase(double amount)
    {
        this.balance = this.balance + amount;
    }

    /**
     * This method credits the amount provided to the current card balance.
     *
     * @param  amount  a sample parameter for a method
     */
    public void payment(double amount)
    {
        this.balance = this.balance - amount;
    }
    
    /**
     * This method gets the current card balance.
     *
     * @return the current credit card balance
     */
    public double getBalance()
    {
        return this.balance;
    }
}
