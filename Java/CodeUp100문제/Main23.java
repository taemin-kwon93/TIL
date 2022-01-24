package codeUpExample;

/*실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
** 여러 가지 방법들로 해결할 수 있다.
만약 실수 부분이 0으로 시작하지 않는다면(예를 들어 1.000009)
scanf("%d.%d", &a, &b)도 하나의 방법이 될 수 있다.*/

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		String[] A = a.split("\\.");
		System.out.printf("%s\n%s", A[0], A[1]);
	}
}
