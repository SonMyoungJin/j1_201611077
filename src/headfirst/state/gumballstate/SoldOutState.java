package headfirst.state.gumballstate;

public class SoldOutState implements State{
  GumballMachine gm;
  public SoldOutState(GumballMachine gm) {
    this.gm=gm;
  }
  public void insertQuarter() {
    System.out.println("SOLD OUT You can not insert a quarter");
    gm.setState(gm.getHasQuarterState());
  }
  public void ejectQuarter() {
    System.out.println("SOLD OUT can not eject");
  }
  public void turnCrank() {
    System.out.println("SOLD OUT can not turn");
  }
  public void dispense() {
    System.out.println("SOLD OUT can not dispense");
  }
}