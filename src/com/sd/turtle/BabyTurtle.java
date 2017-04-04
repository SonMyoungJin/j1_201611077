package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;


public class BabyTurtle extends Observable {
  Turtle baby;
  Double myCurpos;
  ArrayList<Observer> obs;//다른함수에서도 쓰기위해 두번째칸 속성에 써줌
  public BabyTurtle() {
    baby= new Turtle();
    obs=new ArrayList<Observer>();
  }
  public void addObserver(Observer o) {
    obs.add(o);
  }
  public void notifyObservers() {
    for(Observer o:obs)
      o.update(this, 1); //1은 아무뜻없다.그냥 objectd아무거나넘겨준것
  }
  protected void setChanged() {
    myCurpos=baby.getPos();
  }
  public void move(int x,int y) {
    baby.moveTo(x,y);
  }
}