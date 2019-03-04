public class LaoWang implements Observer{

    /*
    WeatherStation weatherStation;

    public LaoWang(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if(weatherStation.getTemperature()<0){
            System.out.println("LaoWang puts on more clothes.");
        }

    }
    */

    @Override
    public void update(WeatherStation weatherStation) {
        if (weatherStation.getTemperature() < 0) {
            System.out.println("模式LaoWang puts on more clothes.");
        }
    }

}
