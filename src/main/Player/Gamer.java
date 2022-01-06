package main.Player;

import java.util.LinkedList;

import main.Order.TrainingOrder;
import main.Order.UnitOrder;
import main.Unit.Unit;

public class Gamer extends Player {
	private static Gamer gamer = null;
	private int mineral;
	private int gas;

	private Gamer() {}
	
	public static Gamer getInstance() {
		if(gamer == null) {
			gamer = new Gamer();
			return gamer;
		}
		return gamer;
	}
	
	public UnitOrder unitOrdering(String unitName) {
		return new UnitOrder(unitName, this.mineral, this.gas);
	}
	
	public TrainingOrder trainOrdering(String kind, String ability) {
		return new TrainingOrder(this.units, kind, ability, this.mineral, this.gas);
	}
	
	public void getUnit(Unit u) {
		if(u == null)
			return;
		else {
			LinkedList<Unit> list = super.getUnits();
			list.add(u);
			
			this.setMineral(this.getMineral() - u.getMINERAL());
			this.setGas(this.getGas() - u.getGAS());
			
			super.setUnits(list);
		}
	}
	
	public void unitTrain(String completed) {
		if(completed.equals("") || completed.equals(null))
			return;
		else {
			String[] price = completed.split(" ");
			
			int mineral = Integer.parseInt(price[0]);
			int gas = Integer.parseInt(price[1]);
			
			this.setMineral(this.getMineral() - mineral);
			this.setGas(this.getGas() - gas);
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
