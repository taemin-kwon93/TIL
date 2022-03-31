package codeUpExample;
/*
16진수(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)를 배운
영일(01)이는 16진수끼리 곱하는 16진수 구구단?에 대해서 궁금해졌다.

A, B, C, D, E, F 중 하나가 입력될 때,
1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
(단, A ~ F 까지만 입력된다.)
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
