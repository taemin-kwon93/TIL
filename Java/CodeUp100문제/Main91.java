package codeUpExample;
/*
 � ��Ģ�� ���� ���� ������� ������ ���� �����̶�� �Ѵ�.

���� ���
1 -1 3 -5 11 -21 43 ... ��
1���� ������ ������ ���� ���� -2�� ���� ���� 1�� ���� ���� ���� ���� �����̴�.

�̷� �̻��� ������ �˰� �� �����̴� �� �ñ�������.

"�׷�.... 13��° ������ ���� ����?"

�����̴� ���� ������ ���� �������� �̷� ������ �� ���� ���� ������...

�׷��� ���α׷��� ����� �� ū ���� �ڵ����� ����ϰ� �;�����.


���� ��(a), ���� ��(m), ���� ��(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��,
n��° ���� ����ϴ� ���α׷��� ������.
�Է¿��� : 1 -2 1 8
��¿��� : -85 
 */

import java.util.Scanner;

public class Main91 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a, m, d, n, result;
		a = sc.nextLong();
		m = sc.nextLong();
		d = sc.nextLong();
		n = sc.nextLong();
		
		result = a;
		sc.close();
		
		for(int i=1; i <= n-1; i++) {
			result = (result*m) + d;
		}
		System.out.println(result);
		
	}
}
