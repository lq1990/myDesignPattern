public interface IStore {
    // IStore is the AbstractFactory, it can produces many productions.

    // factory interface
    IChips getChips();
    // return type: IChips, so it has a eat method.

    IChicken getChicken();
}
