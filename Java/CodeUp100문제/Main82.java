package codeUpExample;
/*
16����(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)�� ���
����(01)�̴� 16�������� ���ϴ� 16���� ������?�� ���ؼ� �ñ�������.

A, B, C, D, E, F �� �ϳ��� �Էµ� ��,
1���� F���� ���� 16���� �������� ������ ����غ���.
(��, A ~ F ������ �Էµȴ�.)
 */
import java.util.Scanner;

public class Main82 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine(); 
		sc.close();
		
		switch (key) {
		case "A":
			for (int i = 1; i <= 15; i++) {
				System.out.printf("%S*%X=%X%n", key, i, 10*i);
			}
			break;
		
		case "B":
			for (int i = 1; i <= 15; i++) {
				System.out.printf("%S*%X=%X%n", key, i, 11*i);
			}
			break;
		
		case "C":
			for (int i = 1; i <= 15; i++) {
				System.out.printf("%S*%X=%X%n", key, i, 12*i);
			}
			break;
		
		case "D":
			for (int i = 1; i <= 15; i++) {
				System.out.printf("%S*%X=%X%n", key, i, 13*i);
			}
			break;
		
		case "E":
			for (int i = 1; i <= 15; i++) {
				System.out.printf("%S*%X=%X%n", key, i, 14*i);
			}
			break;
		
		case "F":
			for (int i = 1; i <= 15; i++) {
				System.out.printf("%S*%X=%X%n", key, i, 15*i);
			}
			break;

		default:
			break;
		}
	}
}
