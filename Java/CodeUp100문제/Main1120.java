package codeUpExample;

import java.util.Scanner;

public class Main1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z, answer;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		sc.close();
		
		answer = (x + y + z)/3;
		System.out.printf("%.2f", answer);
	}

}
