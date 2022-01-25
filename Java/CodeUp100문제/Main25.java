package codeUpExample;

/*다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.

참고
scanf("%1d%1d%1d%1d%1d", &a, &b, &c, &d, &e);
를 사용하면 1개의 숫자로 각각 구분되어 저장된다.

예시
읽어들인 값을 적당히 바꿔 출력하기 위해서

printf("[%d]", a*10000);

과 같은 방법도 가능하다.

*/

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("[" + a.charAt(0)+"0000]");
		System.out.println("[" + a.charAt(1)+"000]");
		System.out.println("[" + a.charAt(2)+"00]");
		System.out.println("[" + a.charAt(3)+"0]");
		System.out.println("[" + a.charAt(4)+"]");
	}
}
