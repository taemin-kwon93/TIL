package codeUpExample;
/*정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
변수에 저장되어 있는 값을 그대로 출력해보자.

예시
int main()
{
    int n;
    scanf("%d", &n);
    printf("%d", n);

    return 0;
}
와 같은 형태로 가능하다. */

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
