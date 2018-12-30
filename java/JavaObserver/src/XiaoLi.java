import java.util.Observable;
import java.util.Observer;

public class XiaoLi implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        WeatherStation weatherStation = (WeatherStation)o;
        if(weatherStation.getTemperatur()>30){
            System.out.println("so hot. XiaoLi turns on air condition.");
        }
    }
}
