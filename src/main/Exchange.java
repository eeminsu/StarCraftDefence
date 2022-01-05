package main;

import main.Building.Barracks;
import main.Building.Factory;
import main.Building.Starport;
import main.Unit.Unit;

public class Exchange {
	Order order;
	
	public Unit giveFactoryUnit() {
		if(order == null) {
			System.out.println("���� ���� ���� : ��û�� �ֹ��� �����ϴ�.");
			return null;
		}
		else {
			Factory factory = Factory.getInstance();
			
			Unit unit = factory.produceUnit(order.unitName);
			
			if(order.mineral < unit.getMINERAL() || order.gas < unit.getGAS()) {
				System.out.println("���� ���� ���� : �ڿ��� �����մϴ�.");
				return null;
			}
			return unit;
		}
	}
	
	public Unit giveBarracksUnit() {
		if(order == null) {
			System.out.println("���� ���� ���� : ��û�� �ֹ��� �����ϴ�.");
			return null;
		}
		else {
			Barracks barracks = Barracks.getInstance();
			
			Unit unit = barracks.produceUnit(order.unitName);
			
			if(order.mineral < unit.getMINERAL() || order.gas < unit.getGAS()) {
				System.out.println("���� ���� ���� : �ڿ��� �����մϴ�.");
				return null;
			}
			return unit;
		}
	}

	public Unit giveStarportUnit() {
		if(order == null) {
			System.out.println("���� ���� ���� : ��û�� �ֹ��� �����ϴ�.");
			return null;
		}
		else {
			Starport starport = Starport.getInstance();
			
			Unit unit = starport.produceUnit(order.unitName);
			
			if(order.mineral < unit.getMINERAL() || order.gas < unit.getGAS()) {
				System.out.println("���� ���� ���� : �ڿ��� �����մϴ�.");
				return null;
			}
			return unit;
		}
	}
	
	public boolean getOrderForUnit(Order order) {
		if(order == null)
			return false;
		
		this.order = order;
		return true;
	}
}
