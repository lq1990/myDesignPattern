public class Client {
    public static void main(String[] args) {
        System.out.println("AbstractFactory main.");

        IStore store = new Mcdonald();
        // it's easy to change the  McD or KFC.
        // we don't need to edit other files.

        store.getChips().eat();

        store.getChicken().eat();

        IStore store2 = new Dicos();
        store2.getChips().eat();
        store2.getChicken().eat();

    }
}
