package codeUpExample;

/*���� 1���� �Է¹޾� �״�� ����غ���.
(��, �ԷµǴ� ������ ������ 0 ~ 4,294,967,295 �̴�.)

����
-2147483648 ~ +2147483647 ������ ������ �����ϰ� ó���ϱ� ���ؼ���
int ������ ������ �����ϸ� �ȴ�.(int �� �����ϰ� %d�� �ް� ���)

������ �� ������ �Ѿ�� ������ �����ϱ� ���ؼ���
���� ū ������ ������ �� �ִ� �ٸ� ���������� ����ؾ� ���������� �����ų �� �ִ�.

unsigned int ���������� ����ϸ� 0 ~ 4294967295 ������ ������ ������ �� �ִ�.


����
unsigned int n;
scanf("%u", &n);
printf("%u", n);
*/

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		sc.close();
		System.out.println(i);
	}

}
