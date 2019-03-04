
public class SingleTonHolder {
	// better than DoubleCheck
	// use class, advantanges of hungry and lazy
	private static class SingleTonInnerHolder {
		private static SingleTonHolder instance = new SingleTonHolder();
	}
	
	private SingleTonHolder() {
		 System.out.println("SingleTonHolder create.");
	}
	
	public static SingleTonHolder getInstance() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SingleTonInnerHolder.instance;
	}
}
