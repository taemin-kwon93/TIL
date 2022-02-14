package codeUpExample;
/*정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)*/

import java.util.Scanner;

public class Main38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x, y, z;
		x = sc.nextLong();
		y = sc.nextLong();
		sc.close();
		z = x + y;
		System.out.println(z);
	}
}
