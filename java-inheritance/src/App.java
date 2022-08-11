//Inheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son. Inheritance in Java is a process of acquiring all the behaviours of a parent object

public class App {
	public static void main(String[] args) {
		/*access modifiers: public, protected, default(lack of access modifier), private
		eg of default method: void design() {
		System.out.println("Design the car");
		}
		public access modifier: can be access to any class anywhere regardless of packages.
		protected access modifier: can be access to the class in the same package.
		private access modifier: can be access only from the same class. can't be access even if its a sub-class. */
		
		Factory factory1 = new Factory();
		
		factory1.design();
		factory1.build();
		
		Car car1 = new Car();
		
		car1.design();
		car1.build();
		car1.brand();
	}
}
