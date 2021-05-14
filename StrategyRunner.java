/**
 * @author Jonathan Kirtland, Brandon Moore
 * @version 1.0
 */
public class StrategyRunner
{
    public static void main(String[] args)
    {
        ShoppingCart shopper = new ShoppingCart();
        PaypalStrategy payment = new PaypalStrategy("jonathan.kirtland@student.csulb.edu", "1234");

        Item item1 = new Item("Apple",.5);
        Item item2 = new Item("Orange",3);
        Item item3 = new Item("Chips",1.25);
        Item item4 = new Item("Bread",4);

        shopper.addItem(item1);
        shopper.addItem(item2);
        shopper.addItem(item3);
        shopper.addItem(item4);

        shopper.pay(payment);


    }
}
