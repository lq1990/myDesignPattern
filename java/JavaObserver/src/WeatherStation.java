import java.util.Observable;

public class WeatherStation extends Observable {
        int temp = 0;

        public void setTemperature(int temp){
            this.temp = temp;

            setChanged(); // before notifyObservers, we have to use setChanged()
            notifyObservers();
        }

        public int getTemperatur(){
            return temp;
        }
}
