package codeUpExample;

import java.util.Scanner;

public class Main97 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] goBaduk = new int[20][20]; 
		int i, j, coordinates, x, y;
		
		for(i = 1; i <= 19; i++) {
			for(j = 1; j <=19; j++) {
				goBaduk[i][j] = sc.nextInt();
			}
		}
		
		coordinates = sc.nextInt();
		
		for(int k = 0; k < coordinates; k++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			for(i = 1; i <= 19; i++) {
				
				if(goBaduk[x][i] == 1) { 
					goBaduk[x][i] = 0;
				} else { 
					goBaduk[x][i] = 1;
				}
				
				if(goBaduk[i][y] == 1) {
					goBaduk[i][y] = 0;
				} else {
					goBaduk[i][y] = 1;
				}
				
			}
		}
		
		for(i = 1; i <= 19; i++) {
			for(j = 1; j <=19; j++) {
				System.out.print(goBaduk[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
