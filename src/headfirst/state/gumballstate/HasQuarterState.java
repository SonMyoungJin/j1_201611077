package headfirst.state.gumballstate;

public class HasQuarterState implements State { //coin 넣은 상태
  GumballMachine gm; //Context /machine statement
  
  public HasQuarterState(GumballMachine gm) {
    this.gm=gm;
  }
  public void insertQuarter() { //coin 있는데 또넣을려고함
    System.out.println("You can not insert another quarter");
  }
  public void ejectQuarter() { //동전 돌려주세요
    System.out.println("Quarter returned");
    gm.setState(gm.getNoQuarterState());
  }
  public void turnCrank() {
    System.out.println("You turned the crank!");
    if(gm.getCount() < 1) {
      gm.setState(gm.getSoldState());
    }
  }
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}