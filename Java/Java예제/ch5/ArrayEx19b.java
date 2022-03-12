package ch5;

import java.util.Scanner;

public class ArrayEx19b {

	public static void main(String[] args) {
		int[][] Arr2D = new int[4][4];
		Scanner sc = new Scanner(System.in);
		int Arr2DPoint = sc.nextInt();
		sc.close();
		
		//0 1 2 3
		for(int i=0; i<4; i++) {
			for(int y=0; y<4; y++) {
				Arr2D[i][y] = 0;
				System.out.print("["+Arr2D[i][y]+"]");
			}
			System.out.println();
		}
		System.out.println(Arr2DPoint);
		System.out.println("\n");
		
		for(int i=0; i<4; i++) {
			for(int y=0; y<4; y++) {
				Arr2D[i][y] = 0;
				Arr2D[Arr2DPoint][Arr2DPoint]=1;
				System.out.print("["+Arr2D[i][y]+"]");
			}
			System.out.println();
		}
	}

}
