package codeUpExample;
/*
 * 태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.
 * 사주를 보는 방법)
 * 세 수(년,월,일)가 주어지면,  (년 + 월 + 일)에 100의 자리 숫자가 짝수이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
 * 입력예시 : 1502 2 10, 1402 2 10
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
			System.out.println("대박");
		}else {
			System.out.println("그럭저럭");
			
		}
	}

}
