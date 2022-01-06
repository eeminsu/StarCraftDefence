package main.Building;

import java.util.LinkedList;

import main.Unit.Unit;

public abstract class TrainingBuilding {
	private final int MINERAL = 200;
	private final int GAS = 200;
	
	public int getMINERAL() {
		return MINERAL;
	}

	public int getGAS() {
		return GAS;
	}

	public abstract void upgrade(LinkedList<Unit> unitList, String kindOfUnit, String ability);
}
