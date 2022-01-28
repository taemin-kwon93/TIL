package ch3;

public class OperatorEx28 {

	public static void main(String[] args) {
		int x = 0xAB;
		System.out.println(x);
		System.out.printf("x = %#X \t\t%s%n",x , toBinaryString(x));
	}

	private static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero+Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
/*
 * 0000000000000000000000000000000010101011
 * 00000000000000000000000000000000
 */
