package codeUpExample;
/*
1���� �Է��� �������� 1�� �������� ����ϴ� ���α׷��� �ۼ��ϵ�,
3�� ����� ���� ������� �ʵ��� ������.

���� ���,
1 2 4 5 7 8 10 11 13 14 ...
�� ���� ����ϴ� ���̴�.
 */

import java.util.Scanner;

public class Main88 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		for(int i=0; i <= x ; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}

