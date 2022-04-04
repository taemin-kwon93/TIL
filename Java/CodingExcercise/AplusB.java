package codingExample;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		z = x + y;
		
		System.out.println(z);
	}

}
