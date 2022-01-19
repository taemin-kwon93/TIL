package first;

public class TestCode2 {

	public static void main(String[] args) {
		if(!Samet()) {
			System.out.println("테스트 결과1 : ");
		}else{
			System.out.println("테스트 결과2 : ");
		}
		
	}

	public static boolean Samet() {
		String x ="2";
		String y ="3";
		if (x.equals(y))
			return true;

		return false;
	}

}
