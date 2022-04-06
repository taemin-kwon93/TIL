package codeUpExample;

import java.util.Scanner;

public class Main95 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int smallNum = 100;
		int x;
		x = sc.nextInt();
		int[] list = new int[x];
		
		for (int i = 0; i < x; i++) {
			int call = sc.nextInt();
			list[i] = call;
		}
		sc.close();

		for (int i = 0; i < x; i++) 
			smallNum = (smallNum > list[i])? list[i] : smallNum; 
		
		System.out.println(smallNum);
		 
	}
}
