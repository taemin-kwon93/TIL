package codeUpExample;
/*
�� ������ ��(1) �Ǵ� ����(0)�� �Էµ� ��,
��/������ ���� �ٸ� ������ ���� ����ϴ� ���α׷��� �ۼ��غ���.
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