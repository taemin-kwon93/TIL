package codeUpExample;

/*�ֹι�ȣ�� ������ ���� �����ȴ�.

XXXXXX-XXXXXXX

���� 6�ڸ��� �������(yymmdd)�̰� �� 7�ڸ��� ����, ����, ���������ڵ��̴�.
�ֹι�ȣ�� �Է¹޾� ���¸� �ٲ� ����غ���.*/

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b, c;
        a = sc.next();
        b = a.substring(0, 6);
        c = a.substring(7,14);
        System.out.println(b+c);
        sc.close();
    }
}
