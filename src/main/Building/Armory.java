package main.Building;

import main.Unit.AirForce;
import main.Unit.Bionic;
import main.Unit.Mechanic;
import main.Unit.Unit;

public class Armory extends TrainingBuilding implements Mechanic, AirForce{
	private static Armory armory = null;
	private Armory() {}
	
	public static Armory getInstance() {
		if(armory == null)
			armory = new Armory();
		return armory;
	}

	@Override
	public boolean powerUpgrade(Unit[] u) {
		if(u == null || u.length == 0) {
			return false;
		}
		
		for(int i=0; i<u.length; i++) {
			if(u[i] instanceof Mechanic)
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
			if(u[i] instanceof Mechanic)
				u[i].setArmor(u[i].getArmor() + 1);
		}
		return true;
	}
	
	public boolean powerUpgradeOfAirForce(Unit[] u) {
		if(u == null || u.length == 0) {
			return false;
		}
		
		for(int i=0; i<u.length; i++) {
			if(u[i] instanceof AirForce)
				u[i].setPower(u[i].getPower() + 1);
		}
		return true;
	}

	public boolean armorUpgradeOfAirForce(Unit[] u) {
		if(u == null || u.length == 0) {
			return false;
		}
		
		for(int i=0; i<u.length; i++) {
			if(u[i] instanceof AirForce)
				u[i].setArmor(u[i].getArmor() + 1);
		}
		return true;
	}

}
