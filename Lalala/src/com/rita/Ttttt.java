package com.rita;

public class Ttttt {
	protected String goods;
	private int price;
	
	public Ttttt (String goods, int price) {
		this.goods = goods;
		this.price = price;
	}	
	public void print() {
		System.out.println(goods + "\t" + price);
	}
	
	public void setPrice(int price) {
		if(price <= 100 && price >= 0) {
			this.price = price;
		}
	}
	

}
