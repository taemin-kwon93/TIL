package ch7.polyArg;

public class Product {
	
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	
	Product(){}
	
}
