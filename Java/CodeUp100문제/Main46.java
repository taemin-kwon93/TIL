package codeUpExample;
/*
정수 3개를 입력받아 합과 평균을 출력해보자.
단, -2147483648 ~ +2147483647
*/
import java.util.Scanner;

public class Main46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		sc.close();
		int result1 = (int)(x+y+z);
		double result2 = (x+y+z)/3;
		
		System.out.println(result1);
		System.out.printf("%.1f", result2);
	}
}
