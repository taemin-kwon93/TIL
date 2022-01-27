package ch3;
/*소문자를 대문자로 변환하기*/
public class OperatorEx15 {

	public static void main(String[] args) {
		char a = 'a';
		char A;
		int x = 32;
		for(int i=0; i<26; i++) {
			A = (char)((a++) - x);
			
			System.out.print(A + " ");
		}
		System.out.println();
	}
}
