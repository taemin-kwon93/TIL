package codeUpExample;

/*���� 2��(a, b)�� �Է¹޾� ��, ��, ��, ��, ������, ���� ���� �ڵ����� ����غ���.
�� 0 <= a, b <= 2147483647, b�� 0�� �ƴϴ�.*/

import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x, y;
		x = sc.nextLong();
		y = sc.nextLong();
		sc.close();

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.printf("%.2f", (double)((double)x)/((double)y));
	}
}
