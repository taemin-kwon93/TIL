package codeUpExample;
/*
1, 2, 3 ... �� ��� ���� ���� ��,
�� ���� �Է��� ����(0 ~ 1000)���� ���ų� ���� ������
��� ���ϴ� ���α׷��� �ۼ��غ���.

��, 1���� n���� ������ ��� ���Ѵٰ� �� ��,
������ ���ؾ� �Է��� ������ ���ų� Ŀ������ �˾ƺ����� �ϴ� �����̴�.
*/
import java.util.Scanner;

public class Main80 {
	
	static int count;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int sum = 0;

		
		for(int i=1; sum<=x; i++) {
			sum += i;
			count = i;
		}
		
		System.out.println(count);
		
	}
}
