package codeUpExample;
/*������(int)���� ������ �����ϰ�, ������ �������� ������ ��
������ ����Ǿ� �ִ� ���� �״�� ����غ���.

����
int main()
{
    int n;
    scanf("%d", &n);
    printf("%d", n);

    return 0;
}
�� ���� ���·� �����ϴ�. */

import java.util.Scanner;
public class Main10 {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		System.out.println(x);
	}
}
