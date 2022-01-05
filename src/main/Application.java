package main;

import java.util.Arrays;

import main.Building.Factory;
import main.Player.Enemy;
import main.Player.Gamer;
import main.Unit.Unit;

public class Application {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		Exchange exchange = new Exchange();
		Enemy enemy = new Enemy();
		
		gamer.setMineral(1000);
		gamer.setGas(500);
		Order order = gamer.unitOrdering("Vulture", gamer.getMineral(), gamer.getGas());
		
		if(exchange.getOrderForUnit(order)) {
			Unit unit = exchange.giveFactoryUnit();
			gamer.getUnit(unit);
		}
		
		Order order2 = gamer.unitOrdering("Marine", gamer.getMineral(), gamer.getGas());

		if (exchange.getOrderForUnit(order2)) {
			Unit unit = exchange.giveBarracksUnit();
			gamer.getUnit(unit);
		}
		
		Order order3 = gamer.unitOrdering("Wraith", gamer.getMineral(), gamer.getGas());

		if (exchange.getOrderForUnit(order3)) {
			Unit unit = exchange.giveStarportUnit();
			gamer.getUnit(unit);
		}
		
		if(gamer.getUnits() != null) {
			System.out.println(Arrays.toString(gamer.getUnits().toArray()));
			System.out.println(Arrays.toString(enemy.getUnits().toArray()));
		}
		
		System.out.println(gamer.getMineral());
		System.out.println(gamer.getGas());
	}

}
