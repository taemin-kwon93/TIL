package codeUpExample;

/*
������ ������� �Էµȴ�.
-2147483648 ~ +2147483647, �� ������ �� �� ����.

0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���.
while( ), for( ), do~while( ) ���� �ݺ����� ����� �� ����.

*/

import java.util.Scanner;

public class Main71 {
	static Scanner sc = new Scanner(System.in);
	static int x;

	public static void main(String[] args) {
		x = sc.nextInt();
		if(x != 0) {
			System.out.println(x);
		}else {
			
		}
			while (x != 0) {
					repeat(x);
					break;
			}
	}
	
	private static int repeat(int x) {
		while(x != 0) {
			x = sc.nextInt();
			if( x != 0) {
				System.out.println(x);
			}
		}
		return x;
	}
}
