package codeUpExample;

/*10진수를 입력받아 8진수(octal)로 출력해보자.

참고
%d(10진수 형태)로 입력받고,
%o를 사용해 출력하면 8진수(octal)로 출력된다.*/

import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		sc.close();
		System.out.printf("%o", i);

	}
}
