package codeUpExample;
/*
세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
 */
import java.util.Scanner;

public class Main66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		
		if((x % 2) == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if((y % 2) == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if((z % 2) == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
