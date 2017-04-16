package headfirst.observer.weather;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver(); //interface는 함수의 마커같은것
} //javalib:observable 대체가능