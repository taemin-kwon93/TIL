package ch4;

import java.util.Scanner;

public class FlowEx25b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x;
		int sum = 0;
		sc.close();
		
		while (y != 0) {
			y = (x%10);
			sum += y;
			System.out.println("Sum�� ��: " + sum);
			System.out.println("X�� ��: " + y);
			System.out.println();
			x = x/10;
		}
		
	}

}
