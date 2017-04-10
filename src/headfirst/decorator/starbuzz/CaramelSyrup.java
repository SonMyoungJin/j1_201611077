package headfirst.decorator.starbuzz;

public class CaramelSyrup extends CondimentDecorator {
  Beverage beverage;
  public CaramelSyrup(Beverage b) {
    this.beverage=b;            //black diamonds
  }
  public String getDescription() {
    return beverage.getDescription()+" adding CaramelSyrup";
  }
  public double cost() {
    return beverage.cost()+0.2;
  }
}

