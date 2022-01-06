package main;

import main.Player.Enemy;
import main.Player.Gamer;

public class Application {

	public static void main(String[] args) {
		// 테스트 코드
		
		Gamer gamer = Gamer.getInstance();
		Enemy enemy = Enemy.getInstance();
		Exchange exchange = Exchange.getInstance();
		Stage stage = Stage.getInstance();
		
		System.out.print(" /$$      /$$ /$$$$$$$$ /$$        /$$$$$$   /$$$$$$  /$$      /$$ /$$$$$$$$\r\n");
		System.out.print("| $$  /$ | $$| $$_____/| $$       /$$__  $$ /$$__  $$| $$$    /$$$| $$_____/\r\n");
		System.out.print("| $$ /$$$| $$| $$      | $$      | $$  \\__/| $$  \\ $$| $$$$  /$$$$| $$      \r\n");
		System.out.print("| $$/$$ $$ $$| $$$$$   | $$      | $$      | $$  | $$| $$ $$/$$ $$| $$$$$   \r\n");
		System.out.print("| $$$$_  $$$$| $$__/   | $$      | $$      | $$  | $$| $$  $$$| $$| $$__/   \r\n");
		System.out.print("| $$$/ \\  $$$| $$      | $$      | $$    $$| $$  | $$| $$\\  $ | $$| $$      \r\n");
		System.out.print("| $$/   \\  $$| $$$$$$$$| $$$$$$$$|  $$$$$$/|  $$$$$$/| $$ \\/  | $$| $$$$$$$$\r\n");
		System.out.print("|__/     \\__/|________/|________/ \\______/  \\______/ |__/     |__/|________/\r\n");
		
		
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
