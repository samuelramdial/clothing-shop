public class Item
{
    private String id; 
    private String name;
    private double price;
    public int length; 
    
    public Item(String _id, String _name, double _price)
    {
        id = _id; 
        name = _name;
        price = _price;
    }
    public String getID()
    {
        return id;
    }
    public String getName()
    {
        return name; 
    }
    public double getPrice()
    {
        return price; 
    }
    public String toString()
    {
        return "Item ID: " + id + " >> " + name + " >> " + "$" + String.format("%.2f",price);
    }
}// end class
