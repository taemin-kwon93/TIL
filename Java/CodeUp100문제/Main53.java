package codeUpExample;
/*
1(true, ��) �Ǵ� 0(false, ����) �� �ԷµǾ��� ��
�ݴ�� ����ϴ� ���α׷��� �ۼ��غ���.
 */
import java.util.Scanner;

public class Main53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		sc.close();
		if(a == 1) {
			System.out.println(0);
		}
		if(a == 0) {
			System.out.println(1);
		}
		else {
			System.out.println();
		}
	}
	
}