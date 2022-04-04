package codingExample;
/*
 * 정답 제출을 위한 파일입니다. Main에 내용을 복사 후 제출합니다.
 * */
import java.util.Scanner;

public class OverAverage2 {

	private static Scanner sc = new Scanner(System.in);
	private static double[] t = new double[100000];
	private static int s;
	private static int s2;
	
	public static void main(String[] args) {

		double c, n, stat;
		c = 0;
		n = 0;
		stat = 0;
		double average = 0;

		c = sc.nextInt();
		System.out.println();
		for (int i = 0; i < c; i++) {
			n = sc.nextInt();
			average = enterScore(n);
			stat = overAve(average, n);
			System.out.printf("%.3f%%\n", stat);
		}
		sc.close();
	}

	private static double enterScore(double n) {
		
		double returnAverage = 0;
		double sum = 0;
		
		for (int i=0; i < n; i++) {
			t[s] = sc.nextDouble();
			sum += t[s];
			returnAverage = calAve(sum, n);
			s++;//학생번호 시퀀스
		}
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
			if(t[s2] > average) {
				oa ++;
			}
			s2++;
		}
		
		stat = (oa*100)/n;
		return stat;
	}
}
