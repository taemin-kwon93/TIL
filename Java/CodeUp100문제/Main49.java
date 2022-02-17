package codeUpExample;

/*
두 정수(a, b)를 입력받아
a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
*/

import java.util.Scanner;

public class Main49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(1);
		}
		if(b>=a) {
			System.out.println(0);
		}
	}
}
