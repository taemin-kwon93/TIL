package ch5;

public class ArrayEx06b {

	public static void main(String[] args) {
		int[] Arr1 = new int[] {32, 25, 73, 20, 2, 3, 6, 10234, 20};
		int tmp;
		int min = Arr1[0];
		System.out.println("���񱳸� �����մϴ�. ���� �ּҰ��� = " + min);
		
		for(int i = 1; i < Arr1.length; i++) {
			tmp = (Arr1[i-1] <= Arr1[i])? Arr1[i-1] : Arr1[i];
			System.out.println("�񱳰�: " + Arr1[i-1] + ", " + Arr1[i]);
			System.out.println("tmp�� ����� ��: " + tmp);
			System.out.println("tmp�� min�� ���� �� min�� ������ִ� ��" + min);
			System.out.println("�ּҰ� ���ϱ� : " + min + ", " + tmp);

			min = (min <= tmp)? min : tmp;
			System.out.println("�ּҰ� min : " + min);
			System.out.println();
		}
	}

}
