package headfirst.command.undo;
//리시버가 없는 커멘드 object만들어서 돌려주는 패턴
//아무것도 안하는 걸로 구현
public class NoCommand implements Command { //null Object pattern
  public void execute() {
    System.out.println("do nothing...");
  }
  public void undo() {}
}