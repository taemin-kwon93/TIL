package codeUpExample;
/*���� 2���� �Է¹޾� ���� ����ϴ� ���α׷��� �ۼ��غ���.
(��, �ԷµǴ� ������ -1073741824 ~ 1073741824 �̴�.)*/

import java.util.Scanner;

public class Main38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x, y, z;
		x = sc.nextLong();
		y = sc.nextLong();
		sc.close();
		z = x + y;
		System.out.println(z);
	}
}
