package codeUpExample;

import java.util.Scanner;

public class Main96 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] goBaduk = new int[20][20]; 
		int x, y, i, j, stones;
		stones = sc.nextInt();
		
		for(i = 0; i < stones; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			goBaduk[x][y] = 1;
		}
				
		for(i = 1; i <= 19; i++) {
			for(j = 1; j <=19; j++) {
				System.out.print(goBaduk[i][j] + " ");
			}
			System.out.println();
		}
	}
}
