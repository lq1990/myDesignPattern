// hungry
public class SingleTonA {
	private static SingleTonA singleTonA = new SingleTonA();
	private SingleTonA() {
		System.out.println(this.getClass().getSimpleName()+" create");
	}
	public static SingleTonA getInstance() {
		System.out.println("SingleTonHungry"+"getInstance");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return singleTonA;
	}
}
