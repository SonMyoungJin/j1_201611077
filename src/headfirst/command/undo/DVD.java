package headfirst.command.undo;

public class DVD{
  //int level; //package private
  int volume;
  public DVD(){
  }
  
  public void on(){
    volume = 12;
    System.out.println("DVD is on");
  }
  public void off(){
    volume = 0;
    System.out.println("DVD is off");
  }
  public int getVolume(){
    return volume;
  }
  public void undoState(int volume){
    this.volume=volume;
    System.out.println("UndoState DVD volume set to "+volume);
  }
}