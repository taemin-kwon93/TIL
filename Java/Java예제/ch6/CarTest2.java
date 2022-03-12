package ch6;

public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println(" color: " + c1.color + "\n gearType: " +
							c1.gearType + "\n door: " + c1.door + "\n");
		
		System.out.println(" color: " + c2.color + "\n gearType: " +
				c2.gearType + "\n door: " + c2.door);
	}
}
