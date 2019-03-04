public class Client {
    public static void main(String[] args) {
        System.out.println("Observer main.");

        WeatherStation weatherStation = new WeatherStation();
        LaoWang laoWang = new LaoWang();
        XiaoLi xiaoli = new XiaoLi();

        weatherStation.registerObserver(laoWang);
        weatherStation.registerObserver(xiaoli);

        weatherStation.setTemp(20);
        weatherStation.setTemp(-20);

        weatherStation.setDampness(60);
    }
}
