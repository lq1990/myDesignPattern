
public class Client {

	public static void main(String[] args) {
		System.out.println("this is Interface-Segregation-Principle Client");
		SearcherB searcher = new SearcherB();
		searcher.searchSuperModel(new Anna());
	}

}
