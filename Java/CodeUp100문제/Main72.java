package codeUpExample;

/*
n���� ������ ������� �Էµȴ�.
-2147483648 ~ +2147483647, �� n�� �ִ� ������ �� �� ����.

n���� �Էµ� ������ ������� ����غ���.
*/

import java.util.Scanner;

public class Main72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for(int i = 1; i <= x; i++) {
			int y = sc.nextInt();
			System.out.println(y);
		}
		
		sc.close();
	}

}
