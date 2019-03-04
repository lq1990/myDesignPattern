public class Mcdonald implements IStore{
    @Override
    public IChips getChips(){
        System.out.println("McDonald produces chips.");
        return new MCchips();
    }
}
