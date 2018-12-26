
public class Mcdonlad {
	public IFood getFood(String name) {
		switch (name) {
		case "chips":
			return new Chips();
		case "chicken":
			return new McChicken();
			
		default:
			System.out.println("We don't sell it.");
			return null;
		}
	}
}
