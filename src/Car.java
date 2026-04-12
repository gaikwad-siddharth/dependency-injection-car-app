
public class Car {
	
	private IEngine engine ;
	
	public Car() {
		
	}
	
	public Car (IEngine engine) {
		this.engine = engine;
	}
	
	public void setterEngine (IEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		
		int status = engine.start();
		if(status >= 1) {
			System.out.println("Engine is Started !!!");
		}else {
			System.out.println("Engine Trouble !!!");
		}
	}
	

}
