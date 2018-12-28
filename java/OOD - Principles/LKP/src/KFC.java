
public class KFC {
	public Hamburger sell() {
		Beef beef = new Beef();
		Vegetable veg = new Vegetable();
		Bread bread = new Bread();
		System.out.println("KFC sells hamburgers.");
		return new Hamburger(beef, veg, bread);
		
	}
}
