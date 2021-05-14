public class Item {
    /** The Universal Product Code */
    private String upcCode;
    /** The current retail price for the item. */
    private double price;

    /**
     * Constructor for our item.
     * @param upcCode	The Universal Product Code.
     * @param price		The price.
     */
    public Item(String upcCode, double price) {
        super();
        this.upcCode = upcCode;
        this.price = price;
    }

    /**
     * Get the UPC.
     * @return	The UPC.
     */
    public String getUpcCode() {
        return upcCode;
    }

    /**
     * Retrieve the price of the item.
     * @return	The price of the item.
     */
    public double getPrice() {
        return price;
    }
}
