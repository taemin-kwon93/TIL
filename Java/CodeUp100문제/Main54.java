package codeUpExample;
/*
�� ���� ��(1) �Ǵ� ����(0)�� �Էµ� ��,
��� ���� ������ ���� ����ϴ� ���α׷��� �ۼ��غ���.
 */
import java.util.Scanner;

public class Main54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if((a == 1) && (b == 1)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}
	
}