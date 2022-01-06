package main.Order;

import java.util.LinkedList;
import main.Unit.Unit;

public class TrainingOrder extends Order {
	private LinkedList<Unit> units;
	private String kindOfUnit;
	private String ability;
	
	public TrainingOrder(LinkedList<Unit> list, String kind, String ability, int mineral, int gas) {
		super(mineral, gas);
		this.units = list;
		this.kindOfUnit = kind;
		this.ability = ability;
	}

	public LinkedList<Unit> getUnits() {
		return units;
	}

	public String getAbility() {
		return ability;
	}
	
	public String getKindOfUnit() {
		return kindOfUnit;
	}
	
	
}
