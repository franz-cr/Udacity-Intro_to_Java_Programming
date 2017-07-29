
/**
 * Write a description of class CreditCardTester1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCardTester1
{
    public static void main(String[] args)
    {
        CreditCard1 card = new CreditCard1(12345);
        System.out.println("Actual: " + card.sumCertainDigits());
        System.out.println("Expected: 9");

        CreditCard1 anotherCard = new CreditCard1(135792);
        System.out.println("Actual: " + anotherCard.sumCertainDigits());
        System.out.println("Expected: 12");
    }
}
