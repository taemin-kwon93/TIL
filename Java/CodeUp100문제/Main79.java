package codeUpExample;
/*
'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���.
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
