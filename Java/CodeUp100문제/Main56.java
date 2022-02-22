package codeUpExample;
/*
두 가지의 참(1) 또는 거짓(0)이 입력될 때,
참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
*/
import java.util.Scanner;

public class Main56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();

		tOrF(x, y);
		System.out.println(tOrF(x, y));
	}

	private static int tOrF(int x, int y) {
		boolean a = true;
		
		if(x != y) {
			a = true;
		}
		if(x == y) {
			a = false;
		}
		
		if(a == true) {
			return 1;
		}
		return 0;
	}

}