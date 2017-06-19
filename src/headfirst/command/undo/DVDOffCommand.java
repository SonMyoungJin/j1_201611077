package headfirst.command.undo;

public class DVDOffCommand implements Command{
  DVD dvd;
  int volume;
  public DVDOffCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    volume = dvd.getVolume();
    dvd.off();
  }
  public void undo(){
    dvd.undoState(volume);
  }
}