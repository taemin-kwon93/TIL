package codeUpExample;

/*
�Էµ� ���� �� ���� ��Ʈ������ or ������ �� �� ����� ������ ����غ���.
��Ʈ����(bitwise) ������ |(or, vertical bar, ��Ƽ�ù�)�� ����ϸ� �ȴ�.
*/

import java.util.Scanner;

public class Main61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		System.out.println(x|y);
	}

}
