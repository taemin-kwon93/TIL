package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = (long)a*b;
		/*long c = a*b;  ���� �սǵȴ�.
		 * (a*b)���� int������ ���� �� c�� �����.*/
		System.out.println(c);
	}

}
