package ch7.polyArg;

public class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Monitor());
		b.buy(new Mouse());
		
		System.out.println("½ÇÇà");
		b.summary();
	}
}
