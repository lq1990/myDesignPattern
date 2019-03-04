public class PowerAdapter implements Power12V{
    private Power220V power220V;

    public PowerAdapter(Power220V pow){
        power220V = pow;
    }
    @Override
    public void getPower12V() {
        power220V.getPower220V();
        transform();
        System.out.println("output 12V.");
    }

    public void transform(){
        System.out.println("transformation 220V to 12V.");
    }
}
