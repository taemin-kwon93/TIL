package codeUpExample;
/*
1, 2, 3 ... �� ������� ��� ���س��� ��,
�� ���� �Է��� �������� ���� ���ȸ� ��� ���ϴ� ���α׷��� �ۼ��غ���.

��, 1���� n���� ������ ��� ���Ѵٰ� �� ��,
������ ���ؾ� �Է��� ������ ���ų� Ŀ������ �˾ƺ����� �ϴ� �����̴�.

������, �̹����� �� ���� ���� ����ؾ� �Ѵ�.

���� ��� 57�� �Է��ϸ�
1+2+3+...+8+9+10=55�� �ٽ� 11�� ���� 66�� �� ��,
�� �� 66�� ��µǾ�� �Ѵ�.
 */

import java.util.Scanner;

public class Main87 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i=0; sum <= x; i++) {
			sum += i;
			//System.out.println(i + "<- i & sum ->" + sum);
			if(sum == x) {
				break;
			}
		}
		System.out.println(sum);
	}
}

