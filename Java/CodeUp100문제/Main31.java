package codeUpExample;

/*10������ �Է¹޾� 8����(octal)�� ����غ���.

����
%d(10���� ����)�� �Է¹ް�,
%o�� ����� ����ϸ� 8����(octal)�� ��µȴ�.*/

import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		sc.close();
		System.out.printf("%o", i);

	}
}
