package codeUpExample;

/*
�� ����(a, b)�� �Է¹޾�
a�� b�� ������ 1��, ���� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
*/

import java.util.Scanner;

public class Main50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(a == b) {
			System.out.println(1);
		}
		if(a != b) {
			System.out.println(0);
		}
	}
}
