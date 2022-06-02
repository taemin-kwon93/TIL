package codeUpExample;

import java.util.Scanner;

public class Main1123 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit;
		double celsius;
		
		celsius = sc.nextDouble();
		
		fahrenheit =  (1.8 * celsius) + 32;
		System.out.printf("%.3f", fahrenheit);
	}

}
