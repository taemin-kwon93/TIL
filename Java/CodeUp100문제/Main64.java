package codeUpExample;
/*
�Էµ� �� ���� a, b, c �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��غ���.
��, ���ǹ��� ������� �ʰ� 3�� ������ ? �� ����Ѵ�.
*/

import java.util.Scanner;

public class Main64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		
		System.out.println(whichOne(x, y, z));
	}

	private static int whichOne(int x, int y, int z) {
		int result;
		result = (x > y? y : x) > z? z : (x > y? y : x) ;
		
		return result;
	}
}
