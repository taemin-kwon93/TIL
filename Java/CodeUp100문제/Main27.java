package codeUpExample;

/*������� ����ϴ� ����� ���󸶴�, ���ĸ��� ���ݾ� �ٸ���.

�����(yyyy.mm.dd)�� �Է¹޾�,

�Ͽ���(dd-mm-yyyy)�� ����غ���.

(��, �� �ڸ� ��/���� 0�� �ٿ� ���ڸ���, �⵵�� 0�� �ٿ� ���ڸ��� ����Ѵ�.) 


����
����ϴ� �ڸ����� �����ϱ� ���� %4d�� ���� ������ ����� �� �ִµ�,
��ĭ�� 0���� ����ϱ� ���ؼ��� %04d�� ���� ������ ����ϸ� �ȴ�.

����
printf("%02d-%02d-%04d", d, m, y);
2014.07.15 -> 15-07-2014 
*/

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ymd = sc.nextLine();
		sc.close();
		
		String[] eachWord = ymd.split("\\.");
		
		System.out.println(eachWord[2]+"-"+eachWord[1]+"-"+eachWord[0]);
	}
}