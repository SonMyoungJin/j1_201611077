package headfirst.factory.pizzaaf.small;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
    Pizza pizza=null;
    PizzaIngredientFactory inFac=new ChicagoPizzaIngredientFactory();
    if(item.equals("cheese")) {
      //pizza=new ChicagoStyleCheesePizza();
      pizza=new CheesePizza(inFac); //REMEMBER!!!POINT!!
      pizza.setName("Chicago Style Cheese Pizza");
    }
    return pizza;
  } 
}