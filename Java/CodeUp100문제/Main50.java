package codeUpExample;

/*
두 정수(a, b)를 입력받아
a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
*/

import java.util.Scanner;

public class Main50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(a == b) {
			System.out.println(1);
		}
		if(a != b) {
			System.out.println(0);
		}
	}
}
