package codeUpExample;
/*
 * �¾ ��, ��, ���� �Է¹޾� �������ڸ� ���� ���α׷��� �ۼ��Ͻÿ�.
 * ���ָ� ���� ���)
 * �� ��(��,��,��)�� �־�����,  (�� + �� + ��)�� 100�� �ڸ� ���ڰ� ¦���̸� "���"�� ���, �׷��� ������ "�׷�����"�� ����ϼ���.
 * �Է¿��� : 1502 2 10, 1402 2 10
 */

import java.util.Scanner;

public class Main1163 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputTime = new int[3];
		int sajuCalAdd = 0;
		int sajuCalDevide = 0;
		
		for(int i = 0; i < 3; i++) {
			inputTime[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			sajuCalAdd += inputTime[i];
		}
		
		//System.out.println(sajuCalAdd);
		
		sajuCalDevide = sajuCalAdd/100;
		//System.out.println(sajuCalDevide);
		//System.out.println(sajuCalDevide%2);
		
		if(sajuCalDevide%2 == 0) {
			System.out.println("���");
		}else {
			System.out.println("�׷�����");
			
		}
	}

}
