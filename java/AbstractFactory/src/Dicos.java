public class Dicos implements IStore{
    @Override
    public IChips getChips() {
        System.out.println("Dicos produces chips.");
        return new Dicoschips();
    }
}
