package codeUpExample;

/*���� ���ڰ� ���ԵǾ� �ִ� ������ �Է¹ް� �״�� ����ϴ� ������ �غ���.

����
char data[2001];
fgets(data, 2000, stdin);
printf("%s", data);

���� ���� �����ϸ� ������ ���Ե� ������ Ű����(stdin)�� �Է¹޾�
�ִ� 2000�ڱ��� data[ ] ������ �����ϰ� ����� �� �ִ�.

%s �� ���ڿ�(string, �Ƿ� ����� ���ڵ�. ����)�� ����϶�� �ǹ��̴�.

����
fgets( ) �� ����ϸ� ���鹮�ڰ� ���ԵǾ��մ� ������ �Է¹޾� ������ �� �ִ�.
����, �Ʒ�ó��
scanf("%s", ... ) �� �̿��� ������ �Է¹�����, ù ��° �ܾ������ ����ȴ�.

char data[51] = ""; //�ִ� 50���ڱ��� ���� ����
scanf("%s", data);
*/

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
        sc.close();
        
        System.out.println(a);
    }
}
