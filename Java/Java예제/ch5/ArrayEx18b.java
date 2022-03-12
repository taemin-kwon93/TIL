package ch5;


public class ArrayEx18b {

	public static void main(String[] args) {
		int[][] Arr2D = {{1, 2, 3},
						 {0, 5, 10, 15, 20}};
		
		System.out.print("["+Arr2D[0][0]+"]");
		System.out.print("["+Arr2D[0][1]+"]");
		System.out.print("["+Arr2D[0][2]+"]");
		System.out.println();
		
		System.out.print("["+Arr2D[1][0]+"]");
		System.out.print("["+Arr2D[1][1]+"]");
		System.out.print("["+Arr2D[1][2]+"]");
		System.out.print("["+Arr2D[1][3]+"]");
		System.out.print("["+Arr2D[1][4]+"]");
		System.out.println("\n\n");

		
		int[][] Arr2D_2 = {{1, 2, 3}, 
						   {4, 5, 6}, 
						   {7, 8, 9}, 
						   {10, 11, 12}};
		//int[][] Arr2D_2 = new int[4][3];
		
		System.out.print("["+Arr2D_2[0][0]+"]");
		System.out.print("["+Arr2D_2[0][1]+"]");
		System.out.println("["+Arr2D_2[0][2]+"]");
		
		System.out.print("["+Arr2D_2[1][0]+"]");
		System.out.print("["+Arr2D_2[1][1]+"]");
		System.out.println("["+Arr2D_2[1][2]+"]");

		System.out.print("["+Arr2D_2[2][0]+"]");
		System.out.print("["+Arr2D_2[2][1]+"]");
		System.out.println("["+Arr2D_2[2][2]+"]");
		
		System.out.print("["+Arr2D_2[3][0]+"]");
		System.out.print("["+Arr2D_2[3][1]+"]");
		System.out.println("["+Arr2D_2[3][2]+"]");
		System.out.println("\n");

		
		for(int i = 0; i < 4; i++) {
			for(int y = 0; y < 3; y++) {
				System.out.print("["+Arr2D_2[i][y]+"]");
			}
			System.out.println();
		}
	}

}
