import java.util.Scanner; 
// https://app.codingrooms.com/c-join/code?joinCode=v4nWMzjbtjvt 
/**
 ITSC 1212 - 005 - von Briesen 
 @author Ramdial, Samuel "Sam"
 @version 1.0
 @since 12/15/2021 1:15 AM
 Project Driver 
 This code is meant to serve as my kiosk for my shop. 
 **/
public class RamdialSamuelShopDriver 
{
    public static void main (String [] args)
    {
        Banner aBanner = new Banner(); 
        System.out.println(aBanner);

        Scanner console = new Scanner(System.in);
        String adjective = "Sly";
        String animal = "Robin";
        String companyType = "Inc.";

        System.out.println("\n" + "Welcome to " + adjective + " " + animal + " " + companyType + " Clothing Store!" ); // prints store name
        System.out.println("Introducing the owner: ");
        Owner aOwner = new Owner();  // greets the customer by introducing the owner
        System.out.println("\n" + aOwner.toString() + "\n");

        System.out.print("Please enter your first name: ");
        String firstName = console.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = console.nextLine();
        System.out.print("Please enter your shirt size (this will be used for your order): ");
        String shirtSize = console.nextLine();
        System.out.print("Please enter your shoe size (this will be used for your order): ");
        double shoeSize = Double.parseDouble(console.nextLine());
        Customer aCustomer = new Customer(firstName, lastName, shirtSize,shoeSize);

        System.out.println(aCustomer.getFirstName() + ", here's what we have to offer!");
        System.out.println("\n" + adjective + " " + animal + " " + companyType + " Clothing Store Menu" + "\n");
        System.out.println("******************");
        Menu aMenu = new Menu(); 
        System.out.println(aMenu); // creates menu, prints it out with items listed
        System.out.println("******************");
        
        System.out.print("\n" + "How many items would you like to order? ");
        int numberOfItems = Integer.parseInt(console.nextLine());
        Item[] orderedItemsList = new Item[numberOfItems]; //sets the new array size based on the number inputted by the user
        
        boolean goodInput = false; 
        for (int index = 0; index < orderedItemsList.length; index ++)
        {
            goodInput = false;
            System.out.print("What would you like for Item " + (index + 1) + ")? (input ID number from menu): ");
            while (goodInput != true) // verifies that the user input is within range
            {
                String input = console.nextLine(); 
                input = input.trim(); 
                if (input.equalsIgnoreCase("A1") ||
                    input.equalsIgnoreCase("A2") ||
                    input.equalsIgnoreCase("A3") ||
                    input.equalsIgnoreCase("A4") ||
                    input.equalsIgnoreCase("A5") ||
                    input.equalsIgnoreCase("A6") ||
                    input.equalsIgnoreCase("A7") ||
                    input.equalsIgnoreCase("A8") ||
                    input.equalsIgnoreCase("A9") ||
                    input.equalsIgnoreCase("A10")
                    )
                {
                    for (int innerCounter = 0; innerCounter < aMenu.getMenuItems().length; innerCounter ++)
                    {
                        
                        String thisItemId = aMenu.getMenuItems()[innerCounter].getID();
                        if (input.equalsIgnoreCase(thisItemId))
                        orderedItemsList[index] = aMenu.getMenuItems()[innerCounter];
                        goodInput = true; 
                    }
                }
                else
                {
                    System.out.print("Your input is incorrect. It must be in the range from A1 - A10. Please try again: ");
                }
            }
        }
        System.out.println("\n" + "Here is your receipt: " + "\n");
        System.out.println(adjective + " " + animal + " " + companyType + " Clothing Store" + "\n");
        // for(Item i: orderedItemsList) // prints out each ordered item
        // {
        //     System.out.println(i);
        // }
        Order anOrder = new Order(orderedItemsList, aCustomer);
        System.out.println(anOrder); // passes parameters of the customer object and orderedItemsList array to print out receipt
        console.close();
    } // end main
} // end class
