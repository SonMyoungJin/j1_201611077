package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;
public abstract class Pizza { //abstract함수호출안될걸
  String name;
  Dough dough;
  String sauce;
  Cheese cheese; //
  Potato potato;
  
  ArrayList<String> toppings=new ArrayList<String>();//안쓰면 지워라
  //public void prepare() {
  //  System.out.println("preparing "+name);
  //}
  protected abstract void prepare();
  
  public void bake() {
    System.out.println("backing "+name);
  }
  public void cut() {
    System.out.println("cutting "+name);
  }
  public void box() {
    System.out.println("boxing "+name);
  }
  public void setName(String name) {
    this.name=name;
  }
  public String getName() {
    return name;
  }
  public String toString() {
  // code to display pizza name and ingredients
  StringBuffer display = new StringBuffer();
  display.append("---- " + name + " ----\n");
  display.append(dough + "\n");
  display.append(sauce + "\n");
  display.append(potato + "\n");
  for (int i = 0; i < toppings.size(); i++) {
   display.append((String )toppings.get(i) + "\n");
  }
  return display.toString();
 }
}