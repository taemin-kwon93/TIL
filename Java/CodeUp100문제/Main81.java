package codeUpExample;
/*
1���� n����, 1���� m���� ���ڰ� ����
���� �ٸ� �ֻ��� 2���� ������ �� ���� �� �ִ� ��� ��츦 ����غ���.

����
��ø�� ����...
�ݺ� ���� ������ ���� ���� ������ ���������� ��ø�� ������ ����ȴ�.
�ݺ� ���� ������ ��ø�ϸ� ���ϴ� �ݺ� ������ �پ��ϰ� ����� �� �� �ִ�.
 */
import java.util.Scanner;

public class Main81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		
		/*
		sc.nextInt(7), �� ���� ������ �ξ�����
		�Էµ� ���� 9�� �־��� ����ó���� �δ°��� �ƴ�
		�ش��ϴ� ���� ����� �Ʒ� for���� ���� ����ؾ� �߽��ϴ�.
		*/
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int y=1; y<=m; y++) {
				System.out.println(i + " " + y);
			}
		}
	}

}
