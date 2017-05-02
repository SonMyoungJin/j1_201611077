package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive {
  public static void main(String args[]) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    Pizza p=nyStore.orderPizza("cheese");
    p=chicagoStore.orderPizza("cheese");
    //System.out.println("");
    
  }
}