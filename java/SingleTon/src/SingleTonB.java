// lazy
public class SingleTonB {
	private static SingleTonB singleTonB = null;
	private SingleTonB() {
		System.out.println(this.getClass().getSimpleName()+" create");
	}
	
	public synchronized static SingleTonB getInstance() {
		System.out.println("SingleTonLazy"+"getInstance");
		if(singleTonB == null) {
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			singleTonB = new SingleTonB();
		}
		return singleTonB;
	}
}
