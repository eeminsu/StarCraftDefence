package main.Player;

import java.util.ArrayList;
import main.Unit.Unit;

public class Player {
	ArrayList<Unit> units = new ArrayList<>();

	public ArrayList<Unit> getUnits() {
		return units;
	}

	public void setUnits(ArrayList<Unit> units) {
		this.units = units;
	}
}
