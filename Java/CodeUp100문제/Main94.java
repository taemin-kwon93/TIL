package codeUpExample;

import java.util.Scanner;

public class Main94 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();
		int[] list = new int[x];
		
		for (int i = 0; i < x; i++) {
			int call = sc.nextInt();
			list[i] = call;
		}

		for (int y = (x-1); y >= 0; y--) {
			System.out.print(list[y] + " ");
		}
 
		sc.close();
		
	}

}
