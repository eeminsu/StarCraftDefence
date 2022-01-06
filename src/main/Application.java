package main;

import main.Player.Enemy;
import main.Player.Gamer;

public class Application {

	public static void main(String[] args) {
		// 테스트 코드
		
		Gamer gamer = new Gamer();
		Enemy enemy = new Enemy();
		Exchange exchange = new Exchange();
		Stage stage = new Stage();
		
		
		while(true) {
			stage.giveResources(gamer);
			System.out.println(gamer.getMineral() + " " + gamer.getGas());
			
			if(exchange.getOrder(gamer.unitOrdering("Vulture")))
				gamer.getUnit(exchange.giveUnit());
			
			if(exchange.getOrder(gamer.unitOrdering("Tank")))
				gamer.getUnit(exchange.giveUnit());
			
			if(exchange.getOrder(gamer.unitOrdering("Tank")))
				gamer.getUnit(exchange.giveUnit());
			
			if(exchange.getOrder(gamer.unitOrdering("Marine")))
				gamer.getUnit(exchange.giveUnit());
			
			if(exchange.getOrder(gamer.trainOrdering("Mechanic", "Power")))
				gamer.unitTrain(exchange.trainingUnit());
			
			
			if(stage.battle(gamer, enemy)) {
				stage.levelUp();
			}
			else {
				break;
			}
		}
		
	}

}
