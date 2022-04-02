package codingExample;

import java.util.Scanner;

public class OverAverage {

	private static Scanner sc = new Scanner(System.in);
	private static double[] t = new double[100000];
	private static int s;
	private static int s2;
	
	public static void main(String[] args) {

		// Test case C, Students N, Test Score T
		double c, n, stat;
		c = 0;
		n = 0;
		stat = 0;
		double average = 0;

		c = sc.nextInt();// Test Case: 평균을 계산하고 그중 평균보다 더 높은 점수를 받은 학생을 추려야 할 횟수.
		System.out.println();
		for (int i = 0; i < c; i++) {
			n = sc.nextInt();// Students: 학생수 = 채점 결과수
			average = enterScore(n);
			stat = overAve(average, n);
			//System.out.println(String.format("평균 : %.3f", average));
			System.out.print(String.format("%.3f", stat));
			//System.out.println();
		}
		//System.out.println("끝");
		sc.close();
	}

	private static double enterScore(double n) {
		
		double returnAverage = 0;
		double sum = 0;
		
		for (int i=0; i < n; i++) {
			t[s] = sc.nextDouble();
			//System.out.print("학생: " + s + " | 입력된 점수: " + t[s] + "\n");
			sum += t[s];
			returnAverage = calAve(sum, n);
			s++;//학생번호 시퀀스
		}
		//System.out.println("학생 " + n + "명의 평균값: " + returnAverage);
		return returnAverage;

	}
	
	private static double calAve(double sum, double n) {
		double result = 0;
		result = sum/n;
		return result;
	}
	
	private static double overAve(double average,  double n) {
		double oa = 0;
		double stat = 0;

		for (int i=0; i < n; i++) {
			//System.out.println("s2에 있는 번호: " + s2);
			//System.out.println("overAve 계산하기 위해 학생의 점수 불러오기 : " + t[s2]);
			if(t[s2] > average) {
				oa ++;
				//System.out.println("평균값 보다 점수 높은 학생수 : " + oa);
			}
			s2++;
		}
		
		stat = (oa*100)/n;
		//System.out.println("Method:overAve_member : stat : " + stat);
		
		return stat;
	}
}
/*
문제 입력 예시 설명 
 5번의 케이스
 5명의 학생 50점 50점 70점 80점 100점
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */