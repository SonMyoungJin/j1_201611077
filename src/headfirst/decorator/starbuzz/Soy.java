package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator {
  Beverage beverage;
  public Soy(Beverage b) {
    this.beverage=b;            //black diamonds
  }
  public String getDescription() {
    return beverage.getDescription()+" adding Soy";
  }
  public double cost() {
    return beverage.cost()+0.15;
  }
}