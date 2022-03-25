package ch7.castingProject;

public class CastingTest {
	public static void main(String args[]) {
		
		Car car = new Car();
		FirstCar fCar1 = new FirstCar();
		//FirstCar fCar2 = new SecondCar(); 서로 관계 없음.
		
		Car car2 = null;
		FirstCar fCar3 = null;
		Car car3 = new FirstCar();
		
		car2 = fCar1;//해당 코드는 Car car2 = new FirstCar(); 와 같다.
		
		car2.drive();
		car.drive();
		fCar1.drive();
		fCar1.jump();
		
		fCar3 = (FirstCar)car2;
		fCar3.jump();
		
		//car3.jump(); 안됨.
		car3.drive();
	}
}

