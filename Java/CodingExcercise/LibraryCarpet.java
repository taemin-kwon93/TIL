package codingExample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryCarpet {
	private static List<Integer> list1 = new ArrayList<>();
	private static List<Integer> list2 = new ArrayList<>();//받은 얼룩들의 좌표 저장.

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		
		int libraryXLeft, libraryYLeft, libraryXRight, libraryYRight;
		int carpetLength;
		int stains;
		
		int coveredStains;
		
		//첫번째로 입력될 줄은 도서실 직사각형의 왼쪽 위 꼭지 점과 오른쪽 아래 꼭지 점의 좌표이다. 
		libraryXLeft = sc.nextInt();
		libraryYLeft = sc.nextInt();
		libraryXRight = sc.nextInt();
		libraryYRight = sc.nextInt();
		
		//둘째 줄에는 카펫 정사각형의 가로 길이가 주어진다.
		carpetLength = sc.nextInt();
		
		//셋째 줄에는 얼룩의 수가 주어진다.
		stains = sc.nextInt();
		
		//넷째 줄부터는 얼룩 직사각형들의 왼쪽 위 꼭지 점과 오른쪽 아래 꼭지 점의 좌표가 주어진다.
		
		
		
		/*
		 * 도서실 바닥에서 카페트를 1씩 옮겨가며 얼룩을 가려본다. 
		 * 가장 벽 쪽으로 붙어 오른쪽으로 한칸씩 옮겨가며 얼룩을 가린후 오른쪽 끝에 카펫이
		 * 닿으면 왼쪽 벽 끝으로 돌아가 위로 한칸 올라간다.
		 * 
		 *  안쪽 for문은 오른쪽으로 조금씩 이동하는 것, 
		 * 바깥쪽 for문은 위로 한칸 올라가는 것을 뜻한다.
		 * 카펫을 옮겨가며 가려진 얼룩의 수를 세어보고 list1에 저장해둔다.
		 */

		//y축 값 1씩 증가
		for(int i=0; i<libraryYLeft; i++) {
		
			//x축 값 1씩 증가
			for(int j=0; j<libraryXRight; j++) {
				//카페트 깔기.
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				
				//카페트 왼쪽 위 꼭지점.
				x1 = j;
				y1 = carpetLength + i;
				
				//카페트 오른쪽 아래 꼭지점.
				x2 = carpetLength + j;
				y2 = i;
				
				//가려진 얼룩의 수를 구하는 메서드 private static int checkNumOfStains() ;
				checkNumOfStains();//checkNumOfStains()메소드를 통해 알게된 가려진 얼룩 수를 list에 저장해둔다.
				
				//가려진 얼룩의 수 중, 가장 큰 수를 구하는 메서드 coveredMost();
				int result = coveredMost(list1);
				System.out.println(result);
			}
		}//end for
		System.out.println(list1);
		
	}//main 메소드
	
	private static void checkNumOfStains() {
		//가려진 얼룩의 수를 검사하여 리턴한다.
		
		/*
		 * 카페트가 얼룩을 가릴 수 있는 조건. 
		 * x1은 더 작고 y1은 더 크고 
		 * x2는 더 크고 y2는 더 작아야 한다. 
		 * 즉, libraryXLeft, libraryYLeft, libraryXRight, libraryYRight;
		 * libraryXLeft <= x1, libraryYLeft >= y1, libraryXRight >= x2, libraryYRight <= y2.
		 * 얼룩이 7개가 있다면, 그 7개에 맞는 값을 저장하고
		 * 저장된 값들을 carpet Length에 맞춰 기준값을 정한 뒤(예를들면, 도서실 왼쪽 벽 가장 끝 부분) 카펫을 옮겨가며 얼룩들을 가린다.
		 * 가장 많이 얼룩을 가렸을때의 수를 저장해야 한다.
		 * list2에 저장돼있는 좌표값을 통해 가릴수 있는 얼룩의 수를 계산하고 list1에 담는다.
		 */
		
	}
	
	private static int coveredMost(List<Integer> list) {
		/* checkNumOfStains() 메소드를 통해 저장된 수 중, 가장 큰 수를 찾아 리턴한다.
		 * list에 저장돼있는 가려진 얼룩의 수들을 반복하여 비교해서 가장 큰수를 result에 저장한다.
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
 * 예제 입력 예시.
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