package ch3;
/*�ҹ��ڸ� �빮�ڷ� ��ȯ�ϱ�*/
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
