package codeUpExample;

/*
�Էµ� �� ���� a, b �� ū ���� ����ϴ� ���α׷��� �ۼ��غ���.
��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.
 */

import java.util.Scanner;

public class Main63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		System.out.println(whichOne(x, y));
	}

	private static int whichOne(int x, int y) {
		int result;
		result = (x > y)? x : y;
		
		return result;
	}
}
