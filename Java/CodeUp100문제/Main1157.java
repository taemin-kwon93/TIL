package codeUpExample;

import java.util.Scanner;

/*Ư���� �� ������ 1
 * ����� ü�� �����԰� ��������� ���̽�ũ�� ���⸦ �ϰ� �ƴ�.
 * ���� ������ 50m ~ 60m ���̿� ���� ���� ���Ⱑ �̱�� �ǰ�, �� �ܿ� ���� �������� ü���������� �̱�� ���� ���ߴ�.
 * ���Ⱑ ���� ���� ��ġ�� �Է����� �־����� 50�̻� 60�����̸� "win"�� ����ϰ�, �� �ܿ��� "lose"�� ����Ͻÿ�.
 */
public class Main1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		
		if(x >= 50 && x <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
	}

}
