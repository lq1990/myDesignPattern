public class Client {
    public static void main(String[] args) {
        System.out.println("Strategy main.");
        Travel travel = new AirplainTravel();
        Person anna = new Person(travel);
        anna.takeHoliday();
    }
}
