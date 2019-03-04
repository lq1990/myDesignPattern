public class Client {
    public static void main(String[] args) {
        System.out.println("this is ObjectAdapter main.");
        NoteBook nb = new NoteBook();
        PowerAdapter powerAdapter = new PowerAdapter(new Power220V());
        nb.TurnOn(powerAdapter);
    }
}
