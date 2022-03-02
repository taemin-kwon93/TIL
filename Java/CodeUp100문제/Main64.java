package codeUpExample;
/*
입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
*/

import java.util.Scanner;

public class Main64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		
		System.out.println(whichOne(x, y, z));
	}

	private static int whichOne(int x, int y, int z) {
		int result;
		result = (x > y? y : x) > z? z : (x > y? y : x) ;
		
		return result;
	}
}
