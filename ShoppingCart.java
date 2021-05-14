import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    /** The list of items currently in the cart */
    List<Item> items;

    /** Construct a new ShoppingCart */
    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    /**
     * Put a new item into the cart
     * @param	item	The item to add.
     */
    public void addItem(Item item){
        this.items.add(item);
    }

    /**
     * Take an item OUT of the cart.
     * @param item	The item to remove.
     */
    public void removeItem(Item item){
        this.items.remove(item);
    }

    /**
     * Calculate the total for all of the items in the cart.
     * @return	The total for the cart.
     */
    public double calculateTotal(){
        double sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    /**
     * Pay for the cart.
     * @param	paymentMethod	How the customer will pay for the item.  I don't really care
     * 							What this is, as long as it implements the pay method.
     */
    public void pay(PaymentStrategy paymentMethod){
        double amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
