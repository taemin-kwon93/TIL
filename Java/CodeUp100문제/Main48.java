package codeUpExample;
/*
���� 2��(a, b)�� �Է¹޾� a�� 2b�� ���� ������ ����غ���.
0 <= a <= 10, 0 <= b <= 10

����
���� ��� 1 3 �� �ԷµǸ� 1�� 23(8)�� �Ͽ� ����Ѵ�.

����
int a=1, b=10;
printf("%d", a << b); //210 = 1024 �� ��µȴ�.
*/
import java.util.Scanner;

public class Main48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.printf("%d", a<<b);
	}
}
