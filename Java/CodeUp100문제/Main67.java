package codeUpExample;
/*
���� 1���� �ԷµǾ��� ��, ��(minus)/��(plus)�� ¦(even)/Ȧ(odd)�� ����غ���.
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
