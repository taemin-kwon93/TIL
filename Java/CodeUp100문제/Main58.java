package codeUpExample;
/*
두 개의 참(1) 또는 거짓(0)이 입력될 때,
모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Main58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();		
		b = sc.nextInt();
		sc.close();
		System.out.println(tOrF(a, b));
	}
	
	
	private static int tOrF(int a, int b) {
		int x;
		
		if((a == 0) && (b == 0)) {
			x = 1;
		}
		else {
			x = 0;
		}
		
		return x;
	}

}
