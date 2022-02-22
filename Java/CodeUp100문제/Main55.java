package codeUpExample;
/*
두 개의 참(1) 또는 거짓(0)이 입력될 때,
하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Main55 {

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
		boolean a, b;
		
		
		if(x == 1) {
			a = true;
		}
		else {
			a = false;
		}
		
		if(y == 1) {
			b = true;
		}
		else {
			b = false;
		}

		return oneOrZero(a, b);
	}
	
	private static int oneOrZero(boolean a, boolean b) {
		int oorz;
		
		if(a || b) {
			oorz = 1;
		}
		else {
			oorz = 0;
		}
		
		return oorz;
	}
}
