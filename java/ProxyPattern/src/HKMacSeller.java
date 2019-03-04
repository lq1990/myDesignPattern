public class HKMacSeller implements IMacSeller{
    IMacSeller seller = new USAMacSeller();

    @Override
    public void buy() {
        seller.buy();
        System.out.println("buy a  mac from HongKong.");
    }
}
