package codeUpExample;
/*
�Էµ� ���� �� ���� ��Ʈ������ xor ������ �� �� ����� ������ ����غ���.
��Ʈ����(bitwise) ������ ^(xor, circumflex/caret, �����÷���/ī��)�� ����ϸ� �ȴ�.

���� ��� 3�� 5�� �ԷµǾ��� ���� ���캸��
3       : 00000000 00000000 00000000 00000011
5       : 00000000 00000000 00000000 00000101
3 ^ 5 : 00000000 00000000 00000000 00000110
 */
import java.util.Scanner;

public class Main62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		System.out.println(x^y);
	}

}
