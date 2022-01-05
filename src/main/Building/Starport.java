package main.Building;

import main.Unit.Battlecruiser;
import main.Unit.Unit;
import main.Unit.Valkyrie;
import main.Unit.Wraith;

public class Starport extends UnitBuilding {
	private static Starport starport = null;
	private Starport() {}
	
	public static Starport getInstance() {
		if(starport == null)
			starport = new Starport();
		return starport;
	}

	@Override
	public Unit produceUnit(String unitName) {
		if(unitName.equalsIgnoreCase("Wraith"))
			return new Wraith();
		else if(unitName.equalsIgnoreCase("Battlecruiser"))
			return new Battlecruiser();
		else if(unitName.equalsIgnoreCase("Valkyrie"))
			return new Valkyrie();
		else
			return null;
	}

}
