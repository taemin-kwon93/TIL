package first;

public class CastingExample02 {
	public static void main(String[] args) {
	 /* 다른 두 타입간에 연산시 더 큰타입의 변수로 담아주는것이 좋다.
	 * 작은값에서 큰 값으로 받아줘야 손실이 안난다.*/
	 double x =2.0;
	 float y = 1.0f;  
	 double i = x + y;
	 System.out.println(i);
	}
}
