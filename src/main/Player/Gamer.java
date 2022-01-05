package main.Player;

import java.util.ArrayList;
import main.Order;
import main.Unit.Unit;

public class Gamer extends Player {
	private int mineral;
	private int gas;
	
	public Order unitOrdering(String name, int mineral, int gas) {
		return new Order(name, mineral, gas);
	}
	
	public void getUnit(Unit u) {
		//���� �����ϰų� �ٸ� ������ ������ �� �޾ƿ��� �׳� return
		if(u == null)
			return;
		else {
			ArrayList<Unit> list = super.getUnits();
			list.add(u);
			
			this.setMineral(this.getMineral() - u.getMINERAL());
			this.setGas(this.getGas() - u.getGAS());
			
			super.setUnits(list);
		}
	}
	
	public int getMineral() {
		return mineral;
	}
	public void setMineral(int mineral) {
		this.mineral = mineral;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}

}
