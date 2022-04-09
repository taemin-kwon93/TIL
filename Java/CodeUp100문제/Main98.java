package codeUpExample;

import java.util.Scanner;

public class Main98 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j, x, y, d, l, rodN, x2, y2;
		x = sc.nextInt();
		y = sc.nextInt();
	
		int[][] frame = new int[x][y]; 
		
		for(i = 0; i < x; i++) {
			for(j = 0; j < y; j++) {
				frame[i][j] = 0;
				//System.out.print(frame[i][j] + " ");
			}
			//System.out.println();
		}
		
		rodN = sc.nextInt();

		for(i = 0; i < rodN; i++) {
				l = sc.nextInt();
				d = sc.nextInt();
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				x2 = x2 - 1;
				y2 = y2 - 1;
				//sSystem.out.println("l d x2 y2 = " + l + d + x2 + y2);
				for(j = 0; j < l; j++) {
					if(d == 0) {
						frame[x2][y2] = 1;
						//System.out.println("frame에 가로놓기" + frame[x2][y2] + "\n x2: " + x2 + "\n y2: " + y2);
						y2++;
					}
					else {
						frame[x2][y2] = 1;
						//System.out.println("frame에 세로놓기" + frame[x2][y2] + "\n x2: " + x2 + "\n y2: " + y2);
						x2++;
					}
					
				}
			}
		
		
		for(i = 0; i < x; i++) {
			for(j = 0; j < y; j++) {
				System.out.print(frame[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
/*
5 5
3
2 0 1 1
3 1 2 3
4 1 2 5
*/
