package codeUpExample;

import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] id = new int[24];
		int x;
		
		x = sc.nextInt();
		
		for(int y = 1; y <= x; y++) {
			int call = sc.nextInt();
			id[call] = ++id[call];
			System.out.println("call: " + call + " = " + (id[call]));
		}
		sc.close();
		
		for(int k = 1; k <= 23; k++) {
			System.out.print(id[k] + " ");
		}
		
	}

}
