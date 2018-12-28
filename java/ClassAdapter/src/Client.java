public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter main.");
        Notebook nb = new Notebook();
        nb.PowerOn(new PowerAdapter());
    }
}
