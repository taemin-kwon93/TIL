package codeUpExample;

/*�Ǽ� 1���� �Է¹޾� ���� �κа� �Ǽ� �κ����� ������ ����Ѵ�.
** ���� ���� ������ �ذ��� �� �ִ�.
���� �Ǽ� �κ��� 0���� �������� �ʴ´ٸ�(���� ��� 1.000009)
scanf("%d.%d", &a, &b)�� �ϳ��� ����� �� �� �ִ�.*/

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		String[] A = a.split("\\.");
		System.out.printf("%s\n%s", A[0], A[1]);
	}
}
