//Inheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son. Inheritance in Java is a process of acquiring all the behaviours of a parent object

public class App {
	public static void main(String[] args) {
		Factory factory1 = new Factory();
		
		factory1.design();
		factory1.build();
		
		Car car1 = new Car();
		
		car1.design();
		car1.build();
	}
}
