package codeUpExample;
/*
�� ���� ��(1) �Ǵ� ����(0)�� �Էµ� ��,
��� ������ ������ ���� ���Ǵ� ���α׷��� �ۼ��غ���.
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
