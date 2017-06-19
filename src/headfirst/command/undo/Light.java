package headfirst.command.undo;

public class Light {
  int level;
  public Light() {
  }
  public void on() {
    level=100;
    System.out.println("Light is on");
  }
  public void off() {
    level=0;
    System.out.println("Light is off");
  }
  public void dim(int level) {
    this.level=level;
    //if(level==0) {
    //  off();
    //} else {
    //  System.out.println("Light is dimmed to "+level+"%");
    //}
    System.out.println("Light is dimmed to "+level+"%");
  }
  public int getLevel() {
    return level;
  }
  
}