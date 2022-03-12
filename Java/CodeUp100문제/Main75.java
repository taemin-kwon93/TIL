package codeUpExample;
/*
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 */

import java.util.Scanner;

public class Main75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x != 0) {
			for(int i=x; i>=0; i--) {
				x = i;
				if(x == 0) {
					return;
				}
				System.out.println(x);
			}
		}
	}

}
