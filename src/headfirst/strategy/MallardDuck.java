package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
   fb= new FlyWithWings();
   //setFlyBehavior(ew FlyWihtWIngs());
  }
  
  
  public void display() {
    System.out.println("Mallard...");
  } 
}