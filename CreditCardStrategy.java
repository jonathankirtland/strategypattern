/**
 * a class designed to accept the paymentStrategy credit card
 */
public class CreditCardStrategy implements PaymentStrategy
{
    private String name, cardNumber, cvv, dateOfExpiry;

    /**
     * creates a credit card payment object
     * @param name
     * @param cardNumber
     * @param cvv
     * @param dateOfExpiry
     */
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry)
    {
        this.name = name; this.cardNumber = cardNumber; this.cvv = cvv; this.dateOfExpiry = dateOfExpiry;
    }

    public void pay(double amount)
    {

    }

}
