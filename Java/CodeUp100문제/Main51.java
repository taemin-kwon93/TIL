package codeUpExample;
/*
�� ����(a, b)�� �Է¹޾�
b�� a���� ũ�ų� ������ 1��, �׷��� ������ 0�� ����ϴ� ���α׷��� �ۼ��غ���.
*/
import java.util.Scanner;

public class Main51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		if(b >= a) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
