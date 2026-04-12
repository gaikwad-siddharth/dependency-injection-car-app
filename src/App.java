
public class App {

	public static void main(String[] args) {
		
		Car c = new Car(new PetrolEngine());  //Using Constructor Injection
		
		c.setterEngine(new DiselEngine());    //Using Setters Injection

		c.drive();

	}

}
