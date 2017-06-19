package headfirst.command.undo;

public class DVDOnCommand implements Command{
  DVD dvd;
  int volume;
  public DVDOnCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    volume = dvd.getVolume();
    dvd.on();
  }
  public void undo(){
    dvd.undoState(volume);
  }
}