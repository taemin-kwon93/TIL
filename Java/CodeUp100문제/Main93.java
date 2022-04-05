package codeUpExample;

import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] id = new int[24];
		int x;
		
		for(int i = 0; i < 23; i++) {
			id[i] = 0;
		} 
		
		x = sc.nextInt();
		
		for(int j = 0; j < x; j++) {
			int call = sc.nextInt();
			id[call-1] = ++id[call-1];
			System.out.println("call: " + call + " = " + (id[call-1]));
		}
		
		for(int k = 0; k < 23; k++) {
			System.out.print(id[k] + " ");
		}
		
		sc.close();
	}

}
