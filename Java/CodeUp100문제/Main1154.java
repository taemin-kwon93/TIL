package codeUpExample;

/*
 * ���� �ΰ��� �Է����� ������ ū�� - �������� ���� ����Ͻÿ�.
 */

import java.util.Scanner;

public class Main1154 {

	static int[] x = new int[2]; 
	static int max, min, subResult;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			x[i] = sc.nextInt();
		}
		

		if(x[0] < x[1]) {
			min = x[0];
			max = x[1];
		}else {
			max = x[0];
			min = x[1];
		}

		
		System.out.println(max-min);
	}
}
