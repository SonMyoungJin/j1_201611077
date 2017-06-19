package headfirst.singleton.stat;
 
public class Singleton {
 //private static Singleton uniqueInstance;
 private static Singleton uniqueInstance=new Singleton();
 private static int numCalled=0;  
  
 private Singleton() {
 }
  
 public static Singleton getInstance() {
  //if (uniqueInstance == null) {
   System.out.println("Creating...");
   uniqueInstance = new Singleton();
  //}
  //else {
  System.out.println("Returning...");
  System.out.println("numCalled... "+numCalled++);
  return uniqueInstance;
 //}
 }
}

 //memory 