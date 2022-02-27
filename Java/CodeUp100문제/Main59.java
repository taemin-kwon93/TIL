package codeUpExample;

/*
�Է� �� ������ ��Ʈ������ ��/������ �ٲ� �� ������ ����غ���.
��Ʈ����(bitwise)������ ~ �� ���̸� �ȴ�.(~ : tilde, ƿ���� �д´�.)


** ��Ʈ����(bitwise) �����ڴ�,
~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)
�� �ִ�.

���� ��� 1�� �ԷµǾ��� �� ����Ǵ� 1�� 32��Ʈ 2������ ǥ���ϸ�
        00000000 00000000 00000000 00000001 �̰�,
~1�� 11111111 11111111 11111111 11111110 �� �Ǵµ� �̴� -2�� �ǹ��Ѵ�.
 */

import java.util.Scanner;

public class Main59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		System.out.printf("%d", ~x);
	}

}
