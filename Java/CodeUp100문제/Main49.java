package codeUpExample;

/*
�� ����(a, b)�� �Է¹޾�
a�� b���� ũ�� 1��, a�� b���� �۰ų� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
*/

import java.util.Scanner;

public class Main49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(1);
		}
		if(b>=a) {
			System.out.println(0);
		}
	}
}
