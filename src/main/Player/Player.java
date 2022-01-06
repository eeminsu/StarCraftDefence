package main.Player;

import java.util.LinkedList;

import main.Unit.Unit;

public abstract class Player {
	LinkedList<Unit> units = new LinkedList<>();

	public LinkedList<Unit> getUnits() {
		return units;
	}

	public void setUnits(LinkedList<Unit> units) {
		this.units = units;
	}
}
