package ch4;

public class FlowEx22b {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		for(int tmp : arr) {
			System.out.println("tmp�� ��: " + tmp);
			System.out.println("arr[]�� ��: " + arr[tmp-1]);
			System.out.println();
		}
	}

}
