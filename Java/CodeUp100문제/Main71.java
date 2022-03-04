package codeUpExample;

/*
정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 개수는 알 수 없다.

0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.

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
