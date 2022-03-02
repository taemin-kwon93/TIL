package codeUpExample;

/*
입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
 */

import java.util.Scanner;

public class Main63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		System.out.println(whichOne(x, y));
	}

	private static int whichOne(int x, int y) {
		int result;
		result = (x > y)? x : y;
		
		return result;
	}
}
