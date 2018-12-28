public class PowerAdapter extends Power220V implements Power5V{

    @Override
    public void getPower5V() {
        super.getPower220V();
        transform();
        System.out.println("output 5V.");
    }

    void transform(){
        System.out.println("we do transformation.");
    }
}
