package codeUpExample;
/*
'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���.
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
