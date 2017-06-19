package headfirst.command.undo;

public class LightOnCommand implements Command {
  Light light;
  int level;
  public LightOnCommand (Light light) {
    this.light=light;
  }
  public void execute() {
    level=light.getLevel(); //현 조도레벨 저장
    light.on();
  }
  public void undo() {
    light.dim(level); //전의 조도레벨 저장,  dim으로 돌아가는것 구현
  }
}