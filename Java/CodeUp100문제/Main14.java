package codeUpExample;

/*2���� ����(ASCII CODE)�� �Է¹޾Ƽ� ������ �ٲ� ����غ���.

����
char x, y;
scanf("%c %c", &x, &y);
printf("%c %c", y, x); //��µǴ� ������ �ۼ�
�� ���� ������� �ذ��� �� �ִ�.

 */

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) {

		char x;
		char y;

		Scanner sc = new Scanner(System.in);
		x = sc.next().charAt(0);
		y = sc.next().charAt(0);
		sc.close();
		System.out.printf("%c ", y);
		System.out.printf("%c", x);

	}
}
