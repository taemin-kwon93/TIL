package ch3;

public class OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float pi2;
		//�Ʒ� �ΰ��� ����� �ٸ� ����� ���´�.
		System.out.printf("%.3f \n", pi);//�ݿø�
		
		pi2 = (int)(pi*1000) / 1000f;//����
		System.out.println(pi2);
	}
}
