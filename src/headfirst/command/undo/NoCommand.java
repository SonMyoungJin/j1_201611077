package headfirst.command.undo;
//���ù��� ���� Ŀ��� object���� �����ִ� ����
//�ƹ��͵� ���ϴ� �ɷ� ����
public class NoCommand implements Command { //null Object pattern
  public void execute() {
    System.out.println("do nothing...");
  }
  public void undo() {}
}