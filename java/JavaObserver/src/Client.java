public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        LaoWang laoWang = new LaoWang();
        XiaoLi xiaoLi = new XiaoLi();

        weatherStation.addObserver(laoWang);
        weatherStation.addObserver(xiaoLi);

        weatherStation.setTemperature(40);
        weatherStation.notifyObservers();
    }
}
