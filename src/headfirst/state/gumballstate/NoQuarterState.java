package headfirst.state.gumballstate;

public class NoQuarterState implements State{
  GumballMachine gm;
  public NoQuarterState(GumballMachine gm) {
    this.gm=gm;
  }
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gm.setState(gm.getHasQuarterState());
  }
  public void ejectQuarter() {
    System.out.println("no quarter");
  }
  public void turnCrank() {
    System.out.println("WHY TURN.. no quarter");
  }
  public void dispense() {
    System.out.println("WHY NO PAY first. WHY TURN.. no quarter");
  }
}