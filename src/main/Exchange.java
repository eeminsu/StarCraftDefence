package main;

import main.Building.Armory;
import main.Building.Barracks;
import main.Building.EngineeringBay;
import main.Building.Factory;
import main.Building.Starport;
import main.Building.TrainingBuilding;
import main.Building.UnitBuilding;
import main.Order.Order;
import main.Order.TrainingOrder;
import main.Order.UnitOrder;
import main.Unit.Unit;

public class Exchange {
	private Order order;
	
	public Unit giveUnit() {
		if(order == null || !(order instanceof UnitOrder)) {
			System.out.println("유닛 생성 실패 : 요청한 주문이 올바르지 않습니다.");
			return null;
		}
		else {
			UnitOrder uOrder = (UnitOrder)order;
			UnitBuilding uBuild = null;
			
			switch (uOrder.getUnitName()) {
				case "Vulture":
				case "Tank":
				case "Goliath":
					uBuild = Factory.getInstance();
					break;
				case "Marine":
				case "Firebat":
					uBuild = Barracks.getInstance();
					break;
				case "Wraith":
				case "Battlecruiser":
				case "Valkyire":
					uBuild = Starport.getInstance();
					break;
			}
			
			Unit unit = uBuild.produceUnit(uOrder.getUnitName());
			
			if(uOrder.getMINERAL() < unit.getMINERAL() || uOrder.getGAS() < unit.getGAS()) {
				System.out.println("유닛 생성 실패 : 자원이 부족합니다.");
				return null;
			}
			return unit;
		}
	}
	
	public String trainingUnit() {
		if(order == null || !(order instanceof TrainingOrder)) {
			System.out.println("유닛 업그레이드 실패 : 요청한 주문이 올바르지 않습니다.");
			return "";
		}
		else {
			TrainingOrder tOrder = (TrainingOrder) order;
			TrainingBuilding tBuild = null;
			
			switch (tOrder.getKindOfUnit()) {
				case "Mechanic":
				case "AirForce":
					tBuild = Armory.getInstance();
					break;
				case "Bionic":
					tBuild = EngineeringBay.getInstance();
					break;
			}
			
			if(tOrder.getMINERAL() < tBuild.getMINERAL() || tOrder.getGAS() < tBuild.getGAS()) {
				System.out.println("유닛 업그레이드 실패 : 자원이 부족합니다.");
				return "";
			}
			
			tBuild.upgrade(tOrder.getUnits(), tOrder.getKindOfUnit(), tOrder.getAbility());
			return tBuild.getMINERAL() + " " + tBuild.getGAS();
		}
	}
	
	public boolean getOrder(Order order) {
		if(order == null)
			return false;
		
		this.order = order;
		return true;
	}
}
