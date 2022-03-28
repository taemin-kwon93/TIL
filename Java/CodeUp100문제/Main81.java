package codeUpExample;
/*
1부터 n까지, 1부터 m까지 숫자가 적힌
서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

참고
중첩의 원리...
반복 실행 구조도 조건 실행 구조와 마찬가지로 중첩의 원리가 적용된다.
반복 실행 구조를 중첩하면 원하는 반복 구조를 다양하게 만들어 낼 수 있다.
 */
import java.util.Scanner;

public class Main81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		/*
		sc.nextInt(7), 와 같이 제한을 두었으나
		입력된 값중 9가 있었고 예외처리로 두는것이 아닌
		해당하는 값의 결과도 아래 for문을 통해 출력해야 했습니다.
		*/
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int y=1; y<=m; y++) {
				System.out.println(i + " " + y);
			}
		}
	}

}
