package ch7.castingProject;

public class CastingTest {
	public static void main(String args[]) {
		
		Car car = new Car();
		FirstCar fCar1 = new FirstCar();
		//FirstCar fCar2 = new SecondCar(); ���� ���� ����.
		
		Car car2 = null;
		FirstCar fCar3 = null;
		Car car3 = new FirstCar();
		
		car2 = fCar1;//�ش� �ڵ�� Car car2 = new FirstCar(); �� ����.
		
		car2.drive();
		car.drive();
		fCar1.drive();
		fCar1.jump();
		
		fCar3 = (FirstCar)car2;
		fCar3.jump();
		
		//car3.jump(); �ȵ�.
		car3.drive();
	}
}

