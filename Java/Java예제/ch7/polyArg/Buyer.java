package ch7.polyArg;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] prod = new Product[10];
	int goodsNum = 0;
	
	void buy(Product prod) {
		if(money < prod.price) {
			System.out.println("�ܰ� �����մϴ�.");
			return;
		}
		
		money -= prod.price;
		bonusPoint += prod.price;
		this.prod[goodsNum] = prod;
		goodsNum++;
	}
	
	void summary() {
		int sum = 0;
		
		for(int i=0; i<prod.length; i++) {
			if(prod[i] == null) {
				break;
			}
			System.out.println("���� ��ǰ : " + prod[i]);
			sum += prod[i].price;
		}//for
		
		System.out.println("���� �� �ݾ�: " + sum);
		
	}
}
