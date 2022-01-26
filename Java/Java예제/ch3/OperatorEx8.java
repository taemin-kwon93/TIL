package ch3;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = (long)a*b;
		/*long c = a*b;  값이 손실된다.
		 * (a*b)값이 int형으로 계산된 후 c에 저장됨.*/
		System.out.println(c);
	}

}
