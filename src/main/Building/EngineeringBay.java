package main.Building;

import main.Unit.Bionic;
import main.Unit.Unit;

public class EngineeringBay extends TrainingBuilding implements Bionic{
	private static EngineeringBay engineeringbay = null;
	private EngineeringBay() {}
	
	public static EngineeringBay getInstance() {
		if(engineeringbay == null)
			engineeringbay = new EngineeringBay();
		return engineeringbay;
	}

	@Override
	public boolean powerUpgrade(Unit[] u) {
		if(u == null || u.length == 0) {
			return false;
		}
		
		for(int i=0; i<u.length; i++) {
			if(u[i] instanceof Bionic)
				u[i].setPower(u[i].getPower() + 1);
		}
		return true;
	}

	@Override
	public boolean armorUpgrade(Unit[] u) {
		if(u == null || u.length == 0) {
			return false;
		}
		
		for(int i=0; i<u.length; i++) {
			if(u[i] instanceof Bionic)
				u[i].setArmor(u[i].getArmor() + 1);
		}
		return true;
	}

}
