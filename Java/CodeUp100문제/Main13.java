package codeUpExample;

/*����(int) 2���� �Է¹޾� �״�� ����غ���.

����
int a, b;
scanf("%d%d", &a, &b);  //����/�������� �Է� �����Ͱ� ���еǾ� �Է�
printf("%d %d", a, b);
�� ���� ������� �����ϴ�.*/

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {

		int x;
		int y;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		System.out.printf("%d ", x);
		System.out.printf("%d", y);

	}
}
