package codeUpExample;

/*int�� ���� 1���� �Է¹޾� ������ ���̿� �ΰ� 3�� ����غ���.

����
printf("%d %d %d", a, a, a);
�� ���� ������� ����� �� �ִ�.

*/
import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		System.out.printf("%d %d %d", x, x, x);
		
	}

}
