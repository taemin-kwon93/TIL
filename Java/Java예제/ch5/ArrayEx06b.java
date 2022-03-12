package ch5;

public class ArrayEx06b {

	public static void main(String[] args) {
		int[] Arr1 = new int[] {32, 25, 73, 20, 2, 3, 6, 10234, 20};
		int tmp;
		int min = Arr1[0];
		System.out.println("값비교를 시작합니다. 현재 최소값은 = " + min);
		
		for(int i = 1; i < Arr1.length; i++) {
			tmp = (Arr1[i-1] <= Arr1[i])? Arr1[i-1] : Arr1[i];
			System.out.println("비교값: " + Arr1[i-1] + ", " + Arr1[i]);
			System.out.println("tmp에 저장된 값: " + tmp);
			System.out.println("tmp와 min을 비교할 때 min에 저장돼있는 값" + min);
			System.out.println("최소값 정하기 : " + min + ", " + tmp);

			min = (min <= tmp)? min : tmp;
			System.out.println("최소값 min : " + min);
			System.out.println();
		}
	}

}
