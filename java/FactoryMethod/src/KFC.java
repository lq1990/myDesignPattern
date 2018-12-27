public class KFC implements IStore{
    @Override
    public IChips getChips(){
        System.out.println("KFC produces chips.");
        return new KFCchips();
    }

}
