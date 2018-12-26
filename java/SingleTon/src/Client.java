
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SingleTon Client.");
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is SingleTon object: "+SingleTonHolder.getInstance());
			}
			
		}).start();
		
		System.out.println("this is: "+SingleTonHolder.getInstance());
	}

}
