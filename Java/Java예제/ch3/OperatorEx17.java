package ch3;

public class OperatorEx17 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double pi2 = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(pi2);//�ݿø��� ��
		/*(pi * 1000 + 0.5)�� ��� ����� double���̴�
		 * �̸� int�� ���� ����ȯ �Ҷ� 3142���� ����ȴ�.*/
	}

}
