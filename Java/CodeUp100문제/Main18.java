package codeUpExample;

/*� ���Ŀ� ���߾� �ð��� �Էµ� ��, �״�� ����ϴ� ������ �غ���.

����
scanf( ) �Լ��� ������ ����(format)�� ���� �Է¹޴� �Լ��̴�.
����, �Է¹ް��� �ϴ� �������� ǥ�����ָ� �ȴ�.

����
scanf("%d:%d", &h, &m); //�ݷ�(:) ��ȣ�� �������� �� ���� �� ������ ����ȴ�.*/

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.printf("%s",a);
    }
}
