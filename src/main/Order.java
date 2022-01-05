package main;

public class Order {
	String unitName;
	int mineral;
	int gas;
	
	public Order(String name, int mineral, int gas) {
		this.unitName = name;
		this.mineral = mineral;
		this.gas = gas;
	}
}
