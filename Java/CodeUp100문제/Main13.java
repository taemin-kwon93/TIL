package codeUpExample;

/*정수(int) 2개를 입력받아 그대로 출력해보자.

참고
int a, b;
scanf("%d%d", &a, &b);  //엔터/공백으로 입력 데이터가 구분되어 입력
printf("%d %d", a, b);
와 같은 방법으로 가능하다.*/

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {

		int x;
		int y;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		System.out.printf("%d ", x);
		System.out.printf("%d", y);

	}
}
