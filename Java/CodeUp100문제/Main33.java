package codeUpExample;

/*10������ �Է¹޾� 16����(hexadecimal)�� ����غ���.

����
%d(10���� ����)�� �Է¹ް�
%X�� ����ϸ� 16����(hexadecimal) �빮�ڷ� ��µȴ�.

10������ �� �ڸ��� 10��(0 1 2 3 4 5 6 7 8 9)�� ���ڸ� ����ϰ�,
16������ �� �ڸ��� 16��(0 1 2 3 4 5 6 7 8 9 A B C D E F)�� ���ڸ� ����Ѵ�.
(���ĺ� ��ҹ��ڴ� ǥ���� �ٸ��� ���� ���� �ǹ��Ѵ�.)
16������ A�� 10������ 10, B�� 11, C�� 12 ... �� ����.

*/

import java.util.Scanner;

public class Main33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		
		System.out.printf("%X", i);
	}

}
