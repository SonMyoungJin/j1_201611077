package headfirst.command.undo;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light();
    DVD dvd = new DVD();
    LightOnCommand lighton = new LightOnCommand(light);
    LightOffCommand lightoff = new LightOffCommand(light);
    DVDOnCommand dvdon = new DVDOnCommand(dvd);
    DVDOffCommand dvdoff = new DVDOffCommand(dvd);
    remote.setCommand(2,lighton,lightoff);
    remote.onButtonWasPushed(2);
    remote.offButtonWasPushed(2);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(2);
    remote.onButtonWasPushed(2);
    remote.undoButtonWasPushed();
    
    remote.setCommand(3,dvdon,dvdoff);
    remote.onButtonWasPushed(3);
    remote.offButtonWasPushed(3);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(3);
    remote.onButtonWasPushed(3);
    remote.undoButtonWasPushed();
  }
}