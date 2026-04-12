public class App {

    public static void main(String[] args) {

        // Constructor Injection
        Car car = new Car(new PetrolEngine());
        car.drive();

        /* Setter Injection (alternative approach)
           Car car = new Car();
           car.setEngine(new DieselEngine());
           car.drive();
		*/
    }
}
