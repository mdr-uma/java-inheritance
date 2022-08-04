
//extends keyword will make a Car class a sub-class of Factory below. extends will inherit all the methods from a super class(Factory) to sub-class(Car)

public class Car extends Factory {
	public void brand() {
		System.out.println("Tesla");
	}
}
