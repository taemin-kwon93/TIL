package codeUpExample;

/*10������ �Է¹޾� 16����(hexadecimal)�� ����غ���.

����
%d(10���� ����)�� �Է¹ް�
%x�� ����ϸ� 16����(hexadecimal) �ҹ��ڷ� ��µȴ�.

10������ �� �ڸ��� 10��(0 1 2 3 4 5 6 7 8 9)�� ���ڸ� ����ϰ�,
16������ �� �ڸ��� 16��(0 1 2 3 4 5 6 7 8 9 a b c d e f)�� ���ڸ� ����Ѵ�.
16������ a�� 10������ 10, b�� 11, c�� 12 ... �� ����.
*/

import java.util.Scanner;

public class Main32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		
		System.out.printf("%x", i);
	}

}
