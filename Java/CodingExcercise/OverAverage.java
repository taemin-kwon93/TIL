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

		c = sc.nextInt();// Test Case: ����� ����ϰ� ���� ��պ��� �� ���� ������ ���� �л��� �߷��� �� Ƚ��.
		System.out.println();
		for (int i = 0; i < c; i++) {
			n = sc.nextInt();// Students: �л��� = ä�� �����
			average = enterScore(n);
			stat = overAve(average, n);
			//System.out.println(String.format("��� : %.3f", average));
			System.out.print(String.format("%.3f", stat));
			//System.out.println();
		}
		//System.out.println("��");
		sc.close();
	}

	private static double enterScore(double n) {
		
		double returnAverage = 0;
		double sum = 0;
		
		for (int i=0; i < n; i++) {
			t[s] = sc.nextDouble();
			//System.out.print("�л�: " + s + " | �Էµ� ����: " + t[s] + "\n");
			sum += t[s];
			returnAverage = calAve(sum, n);
			s++;//�л���ȣ ������
		}
		//System.out.println("�л� " + n + "���� ��հ�: " + returnAverage);
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
			//System.out.println("s2�� �ִ� ��ȣ: " + s2);
			//System.out.println("overAve ����ϱ� ���� �л��� ���� �ҷ����� : " + t[s2]);
			if(t[s2] > average) {
				oa ++;
				//System.out.println("��հ� ���� ���� ���� �л��� : " + oa);
			}
			s2++;
		}
		
		stat = (oa*100)/n;
		//System.out.println("Method:overAve_member : stat : " + stat);
		
		return stat;
	}
}
/*
���� �Է� ���� ���� 
 5���� ���̽�
 5���� �л� 50�� 50�� 70�� 80�� 100��
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */