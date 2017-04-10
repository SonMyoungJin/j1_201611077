package headfirst.decorator.starbuzz;

public class StarBuzzCoffee {
  
  public static void main(String args[]) {
    
    Beverage beverage1=new Espresso();
    System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
    
    Beverage beverage2=new DarkRoast();
    beverage2=new Mocha(beverage2);
    beverage2=new Mocha(beverage2);
    beverage2=new Whip(beverage2);
    System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
    

    Beverage beverage3=new HouseBlend();
    beverage3=new Soy(beverage3);
    beverage3=new Mocha(beverage3);
    beverage3=new Whip(beverage3);
    System.out.println(beverage3.getDescription()+"$"+beverage3.cost());
    
    
    Beverage beverage4=new CaramelMacchiato();
    beverage4=new MilkForCoffee(beverage4);
    beverage4=new CaramelSyrup(beverage4);
    beverage4=new Whip(beverage4);
    System.out.println(beverage4.getDescription()+"$"+beverage4.cost());
   
  }
}