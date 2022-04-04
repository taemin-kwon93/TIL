package codingExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryCarpet {
	private static List<Integer> list1 = new ArrayList<>();
	private static List<Integer> list2 = new ArrayList<>();//���� ������ ��ǥ ����.

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		
		int libraryXLeft, libraryYLeft, libraryXRight, libraryYRight;
		int carpetLength;
		int stains;
		
		int coveredStains;
		
		//ù��°�� �Էµ� ���� ������ ���簢���� ���� �� ���� ���� ������ �Ʒ� ���� ���� ��ǥ�̴�. 
		libraryXLeft = sc.nextInt();
		libraryYLeft = sc.nextInt();
		libraryXRight = sc.nextInt();
		libraryYRight = sc.nextInt();
		
		//��° �ٿ��� ī�� ���簢���� ���� ���̰� �־�����.
		carpetLength = sc.nextInt();
		
		//��° �ٿ��� ����� ���� �־�����.
		stains = sc.nextInt();
		
		//��° �ٺ��ʹ� ��� ���簢������ ���� �� ���� ���� ������ �Ʒ� ���� ���� ��ǥ�� �־�����.
		
		
		
		/*
		 * ������ �ٴڿ��� ī��Ʈ�� 1�� �Űܰ��� ����� ��������. 
		 * ���� �� ������ �پ� ���������� ��ĭ�� �Űܰ��� ����� ������ ������ ���� ī����
		 * ������ ���� �� ������ ���ư� ���� ��ĭ �ö󰣴�.
		 * 
		 *  ���� for���� ���������� ���ݾ� �̵��ϴ� ��, 
		 * �ٱ��� for���� ���� ��ĭ �ö󰡴� ���� ���Ѵ�.
		 * ī���� �Űܰ��� ������ ����� ���� ����� list1�� �����صд�.
		 */

		//y�� �� 1�� ����
		for(int i=0; i<libraryYLeft; i++) {
		
			//x�� �� 1�� ����
			for(int j=0; j<libraryXRight; j++) {
				//ī��Ʈ ���.
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				
				//ī��Ʈ ���� �� ������.
				x1 = j;
				y1 = carpetLength + i;
				
				//ī��Ʈ ������ �Ʒ� ������.
				x2 = carpetLength + j;
				y2 = i;
				
				//������ ����� ���� ���ϴ� �޼��� private static int checkNumOfStains() ;
				checkNumOfStains();//checkNumOfStains()�޼ҵ带 ���� �˰Ե� ������ ��� ���� list�� �����صд�.
				
				//������ ����� �� ��, ���� ū ���� ���ϴ� �޼��� coveredMost();
				int result = coveredMost(list1);
				System.out.println(result);
			}
		}//end for
		System.out.println(list1);
		
	}//main �޼ҵ�
	
	private static void checkNumOfStains() {
		//������ ����� ���� �˻��Ͽ� �����Ѵ�.
		
		/*
		 * ī��Ʈ�� ����� ���� �� �ִ� ����. 
		 * x1�� �� �۰� y1�� �� ũ�� 
		 * x2�� �� ũ�� y2�� �� �۾ƾ� �Ѵ�. 
		 * ��, libraryXLeft, libraryYLeft, libraryXRight, libraryYRight;
		 * libraryXLeft <= x1, libraryYLeft >= y1, libraryXRight >= x2, libraryYRight <= y2.
		 * ����� 7���� �ִٸ�, �� 7���� �´� ���� �����ϰ�
		 * ����� ������ carpet Length�� ���� ���ذ��� ���� ��(�������, ������ ���� �� ���� �� �κ�) ī���� �Űܰ��� ������ ������.
		 * ���� ���� ����� ���������� ���� �����ؾ� �Ѵ�.
		 * list2�� ������ִ� ��ǥ���� ���� ������ �ִ� ����� ���� ����ϰ� list1�� ��´�.
		 */
		
	}
	
	private static int coveredMost(List<Integer> list) {
		/* checkNumOfStains() �޼ҵ带 ���� ����� �� ��, ���� ū ���� ã�� �����Ѵ�.
		 * list�� ������ִ� ������ ����� ������ �ݺ��Ͽ� ���ؼ� ���� ū���� result�� �����Ѵ�.
		 */
		int result = 0;
		for(int a=0; a<list1.size(); a++) {
			if(result >= (list1.get(a)) ) {
				result = list1.get(a);
			}
		}
		return result;
	}

}

/*
 * InputStreamReader r = new InputStreamReader(System.in); BufferedReader br =
 * new BufferedReader(r);
 * 
 * ���� �Է� ����.
 * 
0 10 15 0
6
7
1 2 3 1
3 4 5 2
7 5 9 4
7 8 8 6
9 7 11 6
10 5 11 4
12 4 14 2
 */