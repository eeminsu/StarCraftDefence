package main.Building;

import java.util.LinkedList;

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
	public void upgrade(LinkedList<Unit> unitList, String kindOfUnit, String ability) {
		if(unitList == null || unitList.size() == 0) {
			return;
		}
		
		for(int i=0; i<unitList.size(); i++) {
			Unit u = unitList.get(i);
			
			switch(ability) {
			case "Power" :
				if(u instanceof Bionic)
					u.setPower(u.getPower() + 1);
				break;
			case "Armor" :
				if(u instanceof Bionic)
					u.setArmor(u.getArmor() + 1);
				break;
			}
		}
	}

}
