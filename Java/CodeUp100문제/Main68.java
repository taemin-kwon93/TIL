package codeUpExample;
/*
����(����, 0 ~ 100)�� �Է¹޾� �򰡸� ����غ���.

�� ����
���� ���� : ��
 90 ~ 100 : A
 70 ~   89 : B
 40 ~   69 : C
   0 ~   39 : D
�� �򰡵Ǿ�� �Ѵ�.

*/

import java.util.Scanner;

public class Main68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		if(x >= 90) {
			System.out.println("A");
		}
		if(x < 90 && x >= 70) {
			System.out.println("B");					
				}
		if(x < 70 && x >= 40) {
			System.out.println("C");			
		}
		if(x < 40 && x >= 0) {
			System.out.println("D");			
		}
		
	}

}
