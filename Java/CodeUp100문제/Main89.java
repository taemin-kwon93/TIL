package codeUpExample;
/*
� ��Ģ�� ���� ���� ������� ������ ���� ����(series)�̶�� �Ѵ�.

���� ���
1 4 7 10 13 16 19 22 25 ... ��
1���� ������ ������ ���� ���� 3�� ���� ���� ���� ���� �����̴�.
�̷��� ���� ���п����� �յ� ������ ���̰� ���ٰ� �Ͽ�

����(���̰� ������ �ѹ� ��) �����̶�� �Ѵ�.
������ �˰� �� �����̴� ���ڱ� �ñ�������.

"�׷�.... 123��° ������ ���� ����?"

�����̴� ���α׷��� ����� �� ū ���� �ڵ����� ����ϰ� �;�����.

���� ��(a), ����(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��
n��° ���� ����ϴ� ���α׷��� ������.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main89 {
	
	private static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, d, n, sum;
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		sum = a;
		sc.close();
		
		for(int i=1; i <= n-1; i++) {
			list.add(String.valueOf(sum+d));
			
		}
		System.out.println(sum);
		
	}
}

