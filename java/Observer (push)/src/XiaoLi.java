public class XiaoLi implements Observer{

    /*
    WeatherStation weatherStation;

    public XiaoLi(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if(weatherStation.getDampness()>50){
            System.out.println("XiaoLi turns on air condition to reduce the dampness.");
        }

    }
    */

    @Override
    public void update(Weather weather) {
        if(weather.dampness>50){
            System.out.println("XiaoLi turns on air condition to reduce the dampness.");
        }

    }
}
