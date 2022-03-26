package codeUpExample;
/*
'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
 */
import java.util.Scanner;

public class Main79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		char a;
		
		for(int i=0; i<b.length(); i++) {
			if(i%2 == 0) {
				a = b.charAt(i);
				System.out.println(a);
				if(a == 'q') {
					break;
				}
			}
		}
	}
}
