package codeUpExample;
/*
�� ���� a, b, c�� �ԷµǾ��� ��, ¦(even)/Ȧ(odd)�� ����غ���.
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
