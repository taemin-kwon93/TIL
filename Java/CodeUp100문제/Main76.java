package codeUpExample;
/*
������(a ~ z) 1���� �ԷµǾ��� �� �� ���ڱ����� ���ĺ��� ������� ����غ���.
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
