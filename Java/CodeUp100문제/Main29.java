package codeUpExample;
/*�Ǽ� 1���� �Է¹޾� �״�� ����غ���.
(��, �ԷµǴ� �Ǽ��� ������ +- 1.7*10-308 ~ +- 1.7*10308 �̴�.)

����
float ���������� ����ϸ� +- 3.4*10-38 ~ +- 3.4*1038 ������ �Ǽ��� ������ �� �ִ�.
(float �� �����ϰ� %f�� �Է� �޾� ����ϸ� �ȴ�.)

�� ������ �Ѿ��(�� �۰ų� �� ū) �Ǽ��� �����ϱ� ���ؼ���
���� ū ������ ������ �� �ִ� �ٸ� ���������� ����ؾ� ���������� �����ų �� �ִ�.
double�� �� ��Ȯ�ϰ� ������ �� ������, float���� 2���� ���� ������ �ʿ��ϴ�.

double ���������� ����ϸ�
+- 1.7*10-308 ~ +- 1.7*10308 ������ �Ǽ��� ������ �� �ִ�.


����
double d;
scanf("%lf", &d); // double(long float) �������� �Է�
printf("%lf", d);*/
import java.util.Scanner;

public class Main29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		sc.close();
		System.out.printf("%.11f", i);
	}

}
