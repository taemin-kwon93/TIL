package codeUpExample;
/*
����(1 ~ 100) 1���� �Է¹޾� 1���� �� ������ ¦���� ���� ���غ���.
 */

import java.util.Scanner;

public class Main78 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i=0; i<=x; i++) { 
			if(i%2 == 0) {
				//System.out.println(sum + " + " + i + " = " + (sum+i));
				sum += i;
			}
		}// for
		System.out.println(sum);
	}

}
