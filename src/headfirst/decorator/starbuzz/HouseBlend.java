package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage {
  //description="house blend coffee"; ���⿡ �ᵵ �ȵ�
  public HouseBlend() {
    description="house blend coffee";
  }
  //public String getDescription() {
  //  return description;
  //}
  //public abstract double cost()
  public double cost() {
    return 0.89;
  }
}