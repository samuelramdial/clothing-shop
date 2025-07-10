public class Menu 
{
    private Item[] menuItemList =
    {
        new Item("A1", "5\" Inseam Shorts", 20.00),
        new Item("A2", "7\" Inseam Shorts", 20.00),
        new Item("A3", "Men's Death Row Records T-Shirt", 25.00),
        new Item("A4", "Mac Miller Self Care T-Shirt", 18.00),
        new Item("A5", "Men's Hooded Packable Down Jacket", 225.00),
        new Item("A6", "Nike Blazer Mid '77 Vintage", 100),
        new Item("A7", "Nike Air Force 1 '07", 90),
        new Item("A8", "Women's Long Sleeve Turtleneck", 49.50),
        new Item("A9", "Women's Twisted Satin Top", 89.90),
        new Item("A10", "Women's Clarissa Belted Cardigan Sweater", 128.00)
    };
    public Item[] getMenuItems()
    {
        return menuItemList;
    }
    public String toString()
    {
        String menuText = "";
        for (int counter = 0; counter < menuItemList.length; counter ++)
        {
            menuText = menuText + menuItemList[counter] + "\n";
        }
        return menuText;
    }
}
