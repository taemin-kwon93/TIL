package codeUpExample;
/*
정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
*/

import java.util.Scanner;

public class Main67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		if(x >= 0) {
			System.out.println("plus");
		}
		if(x <0) {
			System.out.println("minus");					
				}
		if(x % 2 == 0) {
			System.out.println("even");			
		}
		if(x % 2 != 0) {
			System.out.println("odd");			
		}
		
	}

}
