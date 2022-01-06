package main.Building;

import java.util.LinkedList;

import main.Unit.AirForce;
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
	public void upgrade(LinkedList<Unit> unitList , String kindOfUnit, String ability) {
		if(unitList == null || unitList.size() == 0) {
			return;
		}
		
		for(int i=0; i<unitList.size(); i++) {
			Unit u = unitList.get(i);
			
			switch(kindOfUnit) {
			case "Mechanic" : 
				switch(ability) {
				case "Power" :
					if(u instanceof Mechanic)
						u.setPower(u.getPower() + 1);
					break;
				case "Armor" :
					if(u instanceof Mechanic)
						u.setArmor(u.getArmor() + 1);
					break;
				}
				break;
			case "AirForce":
				switch(ability) {
				case "Power" :
					if(u instanceof AirForce)
						u.setPower(u.getPower() + 1);
					break;
				case "Armor" :
					if(u instanceof AirForce)
						u.setArmor(u.getArmor() + 1);
					break;
				}
				break;
			}
			
			unitList.set(i, u);
		}
	}

}
