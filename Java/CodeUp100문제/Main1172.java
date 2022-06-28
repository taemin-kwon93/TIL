package codeUpExample;
/*세 수 정렬하기*/
import java.util.Arrays;
import java.util.Scanner;

public class Main1172 {
	
	static int[] x = new int[3];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(x);
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
	}

}