package codeUpExample;
/*
� ��Ģ�� ���� ���� ������� ������ ���� �����̶�� �Ѵ�.

���� ���
2 6 18 54 162 486 ... ��
2���� ������ ������ ���� ���� 3�� ���� ���� ���� ���� �����̴�.

�̷��� ���� ���п����� �յ� ������ ������ ���ٰ� �Ͽ�
���(������ ������ �ѹ� ��) �����̶�� �Ѵ�.

��� ������ �˰Ե� �����̴� ���ڱ� �ñ�������.
"�׷�.... 13��° ������ ���� ����?"
�����̴� ���α׷��� ����� �� ū ���� �ڵ����� ����ϰ� �;�����.

���� ��(a), ���(r), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��
n��° ���� ����ϴ� ���α׷��� ������.
�Է¿��� : 2 3 7
��¿��� : 1458
 */

import java.util.Scanner;

public class Main90 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a, r, n, sum;
		a = sc.nextLong();
		r = sc.nextLong();
		n = sc.nextLong();
		sum = a;
		sc.close();
		
		for(int i=1; i <= n-1; i++) {
			sum *= r;
		}
		System.out.println(sum);
		
	}
}

