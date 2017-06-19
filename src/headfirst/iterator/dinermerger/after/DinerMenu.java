package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenu implements Menu{
  MenuItem[] menuItems;  
  static final int MAX_ITEMS = 3;
    int numberOfItems = 0;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("BLT1","Bacon, lettuce, tomato", true, 2.99);
        addItem("BLT2","Bacon2, lettuce2, tomato2", true, 2.99);
        addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
    }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n,d,v,p);
        //if (numberOfItems >= MAX_ITEMS) {
        //    System.err.println("Sorry, menu is full!  Can't add item to menu");
        //} else {
        //    menuItems[numberOfItems] = menuItem;
        //    numberOfItems = numberOfItems + 1;
        //}
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
      return new DinerMenuIterator(menuItems);
    }
}