package codeUpExample;
/*
 ����(red), �ʷ�(green), �Ķ�(blue) ���� ����
���� ���� ���� ���� ����� ������ �Ѵ�.

����(r), �ʷ�(g), �Ķ�(b) ������ ���� ������ �־��� ��,
(���� ���࿡ ���� 0 ~ n-1 ���� n������ �� ������ ���� �� �ִ�.)

�־��� rgb ������ �ٸ��� ���� ���� �� �ִ� ��� ����� ����(r g b)��
�� ���� ���� ����غ���.
 */

import java.util.Scanner;

public class Main84 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int x, y, z;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		
		for(int i=0; i < x; i++) {
			for(int k=0; k < y; k++) {
				for(int l=0; l < z; l++) {
					System.out.println(i + " " + k + " " + l);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

/* Java�� ���� Ǯ�̽� �ð��ʰ��� �ż� C�� Ǯ�����ϴ�.
 * #include<stdio.h>
 * 
 * int main() { 
 * int i, j, k, r, g, b, c; 
 * c = 0; 
 * scanf("%d %d %d\n", &r, &g, &b);
 * for(i=0; i<r; i++) { 
 * for(j=0; j<g; j++) { 
 * for(k=0; k<b; k++) {
 * printf("%d %d %d\n", i, j, k); c++; 
 * } 
 * } 
 * } 
 * printf("%d", c); 
 * return 0; 
 * }
 */

