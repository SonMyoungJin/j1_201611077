package headfirst.observer.weather;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver(); //interface�� �Լ��� ��Ŀ������
} //javalib:observable ��ü����