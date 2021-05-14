/**
 * A class to use the paypal payment strategy
 */
public class PaypalStrategy implements PaymentStrategy
{
    private String emailID, Password;

    /**
     * creates a new paypal payment object
     * @param emailID
     * @param password
     */
    public PaypalStrategy (String emailID, String password)
    {
        this.emailID = emailID;
        this.Password = password;
    }

    public void pay(double amount)
    {
        return "Name " + this
    }
}
