package codeUpExample;
/*
영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
 */

import java.util.Scanner;

public class Main76 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char a = 'a';
		char b = ' ';
		char c = ' ';
		
		String x; 
		x = sc.nextLine();
		
		b = x.charAt(0);
		c = (char) (b+1);
		
		while(b != c) {
			
				System.out.print(a + " ");
				a++;
				b = a;
		}
	
	}
	
}
