package codeUpExample;

import java.util.Scanner;

public class Main100 {
	private static int[][] frame = new int[11][11];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, i, j;
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 10; j++) {
				x = sc.nextInt();
				frame[i][j] = x;
				//System.out.print(frame[i][j] + " ");
			}
			//System.out.println();
		}
		
		loop:
		for(i = 1; i < 11; i++) {
			for(j = 1; j < 11; j++) {
				if (frame[i][j] == 0) {
					frame[i][j] = 9;
					
				} else if (frame[i][j] == 1) {
					frame[i][j] = 1;
					i = i + 1;
					j--;
					if (frame[i][j] == 2) {
						frame[i][j] = 9;
						break loop;
					}
					
					if(i == 9) {
						
					}else {
						frame[i][j] = 9;
					}
					
				} else if (frame[i][j] == 2){
					frame[i][j] = 9;
					break loop;
				}
			}
		}
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 10; j++) {
				System.out.print(frame[i][j] + " ");
			}
			System.out.println();
		}
	}
}
/*
 * 입력예시 
1 1 1 1 1 1 1 1 1 1
1 0 0 1 0 0 0 0 0 1
1 0 0 1 1 1 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 1 0 1 0 1
1 0 0 0 0 1 2 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1


출력예시 
1 1 1 1 1 1 1 1 1 1
1 9 9 1 0 0 0 0 0 1
1 0 9 1 1 1 0 0 0 1
1 0 9 9 9 9 9 1 0 1
1 0 0 0 0 0 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 9 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1

*/

/*
1 1 1 1 1 1 1 1 1 1
1 0 0 1 0 0 0 0 0 1
1 0 0 1 1 1 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 1 2 0 0 1
1 0 0 0 0 1 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1


 * */
