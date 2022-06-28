package codeUpExample;

/*
세 개의 숫자가 주어질 때 작은 순서로 나열 했을 때, 두번째 수를 출력해보자.
예를 들어, 5 9 2 가 있다면, 작은 순서로 나열하면 2 5 9이고 두번째 수는 5이다.
세 개의 정수가 공백으로 구분되어 입력된다. 
세 개의 정수를 작은 순서로 나열 했을 때, 두번째 수를 출력한다.
입력예시 : 201 20 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main1167 {
	
	static int[] x = new int[3];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(x);
		
		System.out.println(x[1]);
		
	}

}