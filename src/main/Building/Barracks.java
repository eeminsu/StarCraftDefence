package main.Building;

import main.Unit.Firebat;
import main.Unit.Marine;
import main.Unit.Unit;

public class Barracks extends UnitBuilding {

	@Override
	public Unit produceUnit(String unitName) {
		if(unitName.equalsIgnoreCase("Marine"))
			return new Marine();
		else if(unitName.equalsIgnoreCase("Firebat"))
			return new Firebat();
		else
			return null;
	}
	
}
