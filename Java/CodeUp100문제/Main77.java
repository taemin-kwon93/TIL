package codeUpExample;

/*
정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
 */

import java.util.Scanner;

public class Main77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0; i<=x; i++) {
			System.out.println(i);
		}
	}

}
