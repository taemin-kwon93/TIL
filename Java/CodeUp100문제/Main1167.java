package codeUpExample;

/*
�� ���� ���ڰ� �־��� �� ���� ������ ���� ���� ��, �ι�° ���� ����غ���.
���� ���, 5 9 2 �� �ִٸ�, ���� ������ �����ϸ� 2 5 9�̰� �ι�° ���� 5�̴�.
�� ���� ������ �������� ���еǾ� �Էµȴ�. 
�� ���� ������ ���� ������ ���� ���� ��, �ι�° ���� ����Ѵ�.
�Է¿��� : 201 20 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main1167 {
	
	static int[] x = new int[3];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(x);
		
		System.out.println(x[1]);
		
	}

}