package codeUpExample;
/*�Ǽ���(float)�� ������ �����ϰ� �� ������ �Ǽ����� ������ ��
����Ǿ� �ִ� �Ǽ����� ����غ���.

����
float x;
scanf("%f", &x);
printf("%f", x);
�� ���� ������� �����ϴ�.*/

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		
		float x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextFloat();
		sc.close();
		System.out.printf("%f", x);
		
	}
}
