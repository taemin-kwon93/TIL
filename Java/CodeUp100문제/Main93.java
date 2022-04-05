package codeUpExample;

import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] id = new int[24];
		int x;
		
		for(int i = 0; i < 24; i++) {
			id[i] = 0;
		} 
		
		x = sc.nextInt();
		
		for(int y = 1; y <= x; y++) {
			int call = sc.nextInt();
			id[call] = ++id[call];
			System.out.println("call: " + call + " = " + (id[call]));
		}
		
		for(int z = 1; z < 24; z++) {
			System.out.print(id[z] + " ");
		}
		
		sc.close();
	}

}
