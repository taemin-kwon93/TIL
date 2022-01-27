package ch3;

public class OperatorEx17 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double pi2 = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(pi2);//반올림된 값
		/*(pi * 1000 + 0.5)의 계산 결과는 double형이다
		 * 이를 int에 맞춰 형변환 할때 3142값이 저장된다.*/
	}

}
