import java.util.Observable;
import java.util.Observer;

public class LaoWang implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        // both push and pull are implemented in Java.util.Observable
        // o: subject

        WeatherStation weatherStation = (WeatherStation)o;
        if( weatherStation.getTemperatur() < 0){
            System.out.println("so cold. LaoWang puts on more clothes.");
        }
    }
}
