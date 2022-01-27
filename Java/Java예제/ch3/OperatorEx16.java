package ch3;

public class OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float pi2;
		//아래 두개의 출력은 다른 결과가 나온다.
		System.out.printf("%.3f \n", pi);//반올림
		
		pi2 = (int)(pi*1000) / 1000f;//버림
		System.out.println(pi2);
	}
}
