package codeUpExample;

/*
� ���� ���̰� 170cm �̴�.
�� ���� 3���� �ͳ��� ���ʴ�� ������ �� ���̴�.
�ͳ��� ���̰� ���� ���̺��� ���ų� ���ٸ� ���� �ͳΰ� �浹�Ͽ� ��� �� ���̴�.
�ͳ��� ���̰� ���ʴ�� 3�� �־����� �ͳ��� ������ �� ����ϸ� PASS �� ����ϰ�, ��� ���ٸ� CRASH �� ����Ͻÿ�.
 */
import java.util.Scanner;

public class Main1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		int limit = 170;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i] <= limit) {
				System.out.print("CRASH");
				return;
			}
		}
		
		System.out.print("PASS");
		
		
	}
}
