package ch3;

public class OperatorEx3 {

	public static void main(String[] args) {
		int x, y, z, zz;
		int a, b;
		x = 10;
		y = 10;
		a = 5;
		b = 5;
		
		//z = a / (x - y); // 0���� ������ ������ �ȵ�.
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero*/
		zz = a * (x - y);
		
		System.out.println(zz);
	}

}
