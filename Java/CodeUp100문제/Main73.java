package codeUpExample;

/*
������ ������� �Էµȴ�.
-2147483648 ~ +2147483647, �� ������ �� �� ����.
0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���.
 */

import java.util.Scanner;

public class Main73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x != 0) {
			System.out.println(x);
			x = sc.nextInt();
		}
	}

}
