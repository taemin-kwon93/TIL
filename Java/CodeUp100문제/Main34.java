package codeUpExample;
/*8������ �Էµ� ���� 1���� 10������ �ٲپ� ����غ���.

����
%o�� �Է¹����� 8������ �νĽ��� �����ų �� �ִ�.
%d�� ����ϸ� 10������ ��µȴ�.

����
int n;
scanf("%o", &n);
printf("%d", n);
(C���� �ҽ� �ڵ� �ۼ� �� 0���� �����ϴ� ���� 8������ �νĵȴ�. int a = 013; // 10���� 11�� ���� ��)*/
import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		sc.close();
		
		int x = Integer.valueOf(i, 8);
		System.out.println(x);
	}
}
