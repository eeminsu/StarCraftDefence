package main.Order;

public class UnitOrder extends Order {
	private String unitName;
	
	public UnitOrder(String name, int mineral, int gas) {
		super(mineral, gas);
		this.unitName = name;
	}

	public String getUnitName() {
		return unitName;
	}
	
	
}
