package codeUpExample;
/*
'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Main79_2 {
	public static void main(String[] args) {

		char b = 'a';
		char b1;
		
		do {
			b1 = checkChar(b);
		} while(b1 != 'q'); 
	}	
	
	private static char checkChar(char b) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char b1 = a.charAt(0);
		System.out.println(b1);
		
		return b1;
	}
}
