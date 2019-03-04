
public class Client {

	public static void main(String[] args) {
		System.out.println("simple factory main.");
		Mcdonlad mcdonlad = new Mcdonlad();

		IFood food = mcdonlad.getFood("chips");
		if(food != null){
			food.eat();
		}

        food = mcdonlad.getFood("chicken");
        if(food != null){
            food.eat();
        }

        food = mcdonlad.getFood("veg");
        if(food != null){
            food.eat();
        }
	}

}
