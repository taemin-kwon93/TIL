package codeUpExample;
/*
3 6 9 ������ �ϴ� �����̴� 3 6 9 ���ӿ��� ���� �Ǽ��� ����ؼ� ��Ģ�� �ް� �Ǿ���.
3 6 9 ������ ���� �Ǳ� ���� ������ ���α׷��� �ۼ��� ����.

����
��ø�� ����
�ݺ� ���� ���� �ȿ� ���� ���� ������ �����Ӱ� ��ø�� �� �ִ�.

����
int i;
for(i=1; i<=100; i++) //1���� 100���� �ݺ�
{
  if(i%3==0 || i%5==0) printf("%d ", i); //3�Ǵ� 5�� ����� ��� �� �� ���
}

** 3 6 9 ������?
���� ����� ������ ���� ������� ���� �θ��� �����̴�.
���� 3, 6, 9 �� �� ���� �ڽ��� �ҷ��� �ϴ� ��Ȳ�̸�, ��� "�ڼ�" �� �ľ� �Ѵ�.
33���� �����ߴٸ�? "¦¦"�� ���� �ڼ��� �� �� ġ�� ���µ� �ִ�.

 */
import java.util.Scanner;

public class Main83 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		int y = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= y; i++) {
			s = String.valueOf(i);
			System.out.print(samyookgu(s) + " ");
		}
	}

	private static String samyookgu(String s) {
		
		int characterCount = s.length();

		for (int z=0; z < characterCount; z++) {
			
			if (s.charAt(z) == '3' || s.charAt(z) == '6' || s.charAt(z) == '9') {
				s = "X";
				return s;
			}
		}
		return s;

	}
}
