import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {
    List<Observer> observers = new ArrayList<Observer>();
    private int temp = 0;
    private int dampness = 0;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(this);
        }
    }

    public int getTemperature(){
        return temp;
    }

    public int getDampness(){
        return dampness;
    }

    public void setDampness(int dampness){
        this.dampness = dampness;
        notifyObserver();
    }

//    private void notifyWeather() {
//        Weather weather = new Weather();
//        weather.dampness = dampness;
//        weather.temp = temp;
//
//        notifyObserver();
//    }

    public void setTemp(int temp){
        this.temp = temp;
        notifyObserver();
    }

}
