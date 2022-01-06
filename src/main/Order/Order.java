package main.Order;

public abstract class Order {
	final int MINERAL;
	final int GAS;
	
	public Order(int mineral, int gas) {
		this.MINERAL = mineral;
		this.GAS = gas;
	}

	public int getMINERAL() {
		return MINERAL;
	}

	public int getGAS() {
		return GAS;
	}
}
