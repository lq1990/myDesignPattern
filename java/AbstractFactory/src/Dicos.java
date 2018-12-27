public class Dicos implements IStore{
    @Override
    public IChips getChips() {
        System.out.println("Dicos produces chips.");
        return new Dicoschips();
    }


    @Override
    public IChicken getChicken() {
        System.out.println("Dicos produces HandGunChicken.");
        return new HandGunChicken();
    }

}
