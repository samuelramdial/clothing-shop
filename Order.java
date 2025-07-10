
public class Order 
{
    private Item[] orderedItems;
    private Customer aCustomer;
    private String firstName; 
    private String lastName; 
    private String shirtSize; 
    private double shoeSize; 

    public Order(Item[] _orderedItems, Customer _aCustomer)
    {
        orderedItems = _orderedItems;
        aCustomer = _aCustomer;
        firstName = _aCustomer.getFirstName();
        lastName = _aCustomer.getLastName(); 
        shirtSize = _aCustomer.getShirtSize(); 
        shoeSize = _aCustomer.getShoeSize();
    }

    public String toString()
    {
        String receipt = "";
        java.util.Date date = new java.util.Date();
        double subtotal = 0.0;
        double tax = 0.0;
        double total = 0.0;
        for (int i = 0; i < orderedItems.length; i++)
        {
            subtotal = subtotal + orderedItems[i].getPrice();
        }
        tax = total + (subtotal * .075);
        total = subtotal + tax;
        for(Item i: orderedItems) // prints out each ordered item
        {
            receipt += (i) + "\n";
        }
        receipt = receipt 
    +                    "________________________"
    + "\n" +             ""
    + "\n" +             "CASHIER: Sam"
    + "\n" +             "Date & Time: " + date
    + "\n" +             ""
    + "\n" +             "Customer Shirt Size: " + shirtSize 
    + "\n" +             "Customer Shoe Size: "  + shoeSize
    + "\n" +             "SUBTOTAL: " + "\t" + "$" + String.format("%.2f",subtotal)
    + "\n" +             "TAX: " + "\t\t" + "$" + String.format("%.2f", tax)
    + "\n" +             "************************"
    + "\n" +             "TOTAL: " + "\t\t" + "$" + String.format("%.2f",total)
    + "\n" +             ""
    + "\n" +             "Thank you for shopping with us " + firstName + " " + lastName + "! Please come again.";
        return receipt; 
    }
    
}
