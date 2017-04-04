package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;

public class TurtleObserverMain {
  public static void main(String[] args) {
    BabyTurtle baby=new BabyTurtle();
    MomTurtle mom=new MomTurtle();
    baby.addObserver(mom);//맘터틀 옵저버고 베비터틀에 있는 함수 쓸수있다
    mom.moveTo(100,100);
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObservers();
  }
}