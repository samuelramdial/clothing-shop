public class Customer 
{
    private String firstName; 
    private String lastName; 
    private String shirtSize; 
    private double shoeSize; 

    public Customer(String _firstName, String _lastName, String _shirtSize, double _shoeSize)
    {
        firstName = _firstName; 
        lastName = _lastName;
        shirtSize = _shirtSize; 
        shoeSize = _shoeSize; 
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getShirtSize()
    {
        return shirtSize;
    }
    public double getShoeSize()
    {
        return shoeSize;
    }
    
}//end class
