package main.Building;

import main.Unit.Goliath;
import main.Unit.Tank;
import main.Unit.Unit;
import main.Unit.Vulture;

public class Factory extends UnitBuilding {
	@Override
	public Unit produceUnit(String unitName) {
		if(unitName.equalsIgnoreCase("Vulture"))
			return new Vulture();
		else if(unitName.equalsIgnoreCase("Tank"))
			return new Tank();
		else if(unitName.equalsIgnoreCase("Goliath"))
			return new Goliath();
		else
			return null;
	}
}
