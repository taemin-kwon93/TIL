package codeUpExample;
/*
�򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���.

�� ����
�� : ����
A : best!!!
B : good!!
C : run!
D : slowly~
������ ���ڵ� : what?
*/

import java.util.Scanner;

public class Main69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		sc.close();
		
		switch (x) {
		case "A":
			System.out.println("best!!!");
			break;
		
		case "B":
			System.out.println("good!!");
			break;
		
		case "C":
			System.out.println("run!");			
			break;
		
		case "D":
			System.out.println("slowly~");			
			break;

		default:
			System.out.println("what?");
			break;
		}
		
	}

}
