package codeUpExample;

import java.util.Scanner;

public class Main92 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		int day = 1;
		
		while(day % x != 0 || day % y != 0 || day % z != 0) {
			day++;
		}
		System.out.println(day);
	}

}
