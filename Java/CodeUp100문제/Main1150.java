package codeUpExample;

/*
 * �� ������ �־����� �� �� ���� ���� ���� ����Ѵ�.
 */

import java.util.Scanner;

public class Main1150 {

	static int[] x = new int[3]; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minimum;
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}
		
		sc.close();
		
		minimum = x[0];
		for(int i = 0; i < 3; i++) {
			minimum = (minimum < x[i])? minimum : x[i];
		}
		System.out.println(minimum);
	}
}
