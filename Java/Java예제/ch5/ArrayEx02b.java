package ch5;

import java.util.Arrays;

public class ArrayEx02b {

	public static void main(String[] args) {
		int[] Arr = new int[5];
		int x = 10;
		
		for(int i = 0; i < Arr.length; i++) {
			Arr[i] += x;
			System.out.println(Arr[i]);
			x += 10;
		}
		
		System.out.println(Arrays.toString(Arr));
	}	

}
