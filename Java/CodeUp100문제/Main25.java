package codeUpExample;

/*�ټ� �ڸ��� ���� 1���� �Է¹޾� �� �ڸ����� ������ ����Ѵ�.

����
scanf("%1d%1d%1d%1d%1d", &a, &b, &c, &d, &e);
�� ����ϸ� 1���� ���ڷ� ���� ���еǾ� ����ȴ�.

����
�о���� ���� ������ �ٲ� ����ϱ� ���ؼ�

printf("[%d]", a*10000);

�� ���� ����� �����ϴ�.

*/

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("[" + a.charAt(0)+"0000]");
		System.out.println("[" + a.charAt(1)+"000]");
		System.out.println("[" + a.charAt(2)+"00]");
		System.out.println("[" + a.charAt(3)+"0]");
		System.out.println("[" + a.charAt(4)+"]");
	}
}
