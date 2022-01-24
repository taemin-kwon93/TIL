package codeUpExample;

/*2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

참고
char x, y;
scanf("%c %c", &x, &y);
printf("%c %c", y, x); //출력되는 순서를 작성
와 같은 방법으로 해결할 수 있다.

 */

import java.util.Scanner;

public class Main14 {
	public static void main(String[] args) {

		char x;
		char y;

		Scanner sc = new Scanner(System.in);
		x = sc.next().charAt(0);
		y = sc.next().charAt(0);
		sc.close();
		System.out.printf("%c ", y);
		System.out.printf("%c", x);

	}
}
