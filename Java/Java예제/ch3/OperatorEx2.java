package ch3;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0;
		j = i++;
		System.out.println("j = i++; 실행 후의 j 값 : " + j);
		
		j = ++i;
		System.out.println(j);//j의 값은 7이다.
	}

}
