package headfirst.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData=weatherData;
    weatherData.registerObserver(this);//원래는 메인에 들어가는 것
  }

  public void update(float t,float h,float p) {
    this.temperature=t;
    this.humidity=h;
    display();
  }
  public void display() {
    System.out.println("Current conditions: "+temperature
                      +"F degrees and" + humidity+"% humidity");
  }
}