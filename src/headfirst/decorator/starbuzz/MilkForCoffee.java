package headfirst.decorator.starbuzz;

public class MilkForCoffee extends CondimentDecorator {
  Beverage beverage;
  public MilkForCoffee(Beverage b) {
    this.beverage=b;            //black diamonds
  }
  public String getDescription() {
    return beverage.getDescription()+" adding MilkForCoffee";
  }
  public double cost() {
    return beverage.cost()+0.2;
  }
}