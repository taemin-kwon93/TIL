package codeUpExample;


/*�ԷµǴ� ��:��:�� ���� �и� ����غ���.

����
int h, m, s;
scanf("%d:%d:%d", &h, &m, &s);

�� �����ϸ� �ݷ��� ���̿� �� �������� �ԷµǾ�, h, m, s�� ���� �������� ����ȴ�.
*/

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		sc.close();
		String[] cut = time.split(":");
		System.out.println(Integer.parseInt(cut[1]));
	}
}
