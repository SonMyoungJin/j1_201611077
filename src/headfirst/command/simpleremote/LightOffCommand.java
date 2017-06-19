package headfirst.command.simpleremote;

public class LightOffCommand implements Command {
  Light light;
  public LightOffCommand (Light light) {
    this.light=light;
  }
  public void execute() {
    light.off();           //밖에서 호출시 execute만 호출  실제사용ligh.on
  }                        //off 쓰려면 따로클래스 만들어야됨
 
}