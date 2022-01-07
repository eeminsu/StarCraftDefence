package main;

import java.util.Scanner;

import main.Player.Enemy;
import main.Player.Gamer;
import main.Unit.Battlecruiser;
import main.Unit.Firebat;
import main.Unit.Goliath;
import main.Unit.Marine;
import main.Unit.Tank;
import main.Unit.Valkyrie;
import main.Unit.Vulture;
import main.Unit.Wraith;

public class Game {
	private static Game game = null;
	
	private static Stage stage = Stage.getInstance();
	private static Enemy enemy = Enemy.getInstance();
	private static Gamer gamer = Gamer.getInstance();
	private static Exchange exchange = Exchange.getInstance();
	
	private Game() {}
	
	public static Game getInstance() {
		if(game == null) {
			game = new Game();
			return game;
		}
		return game;
	}
	
	
	public void play() {
		System.out.print(" /$$      /$$ /$$$$$$$$ /$$        /$$$$$$   /$$$$$$  /$$      /$$ /$$$$$$$$\r\n");
		System.out.print("| $$  /$ | $$| $$_____/| $$       /$$__  $$ /$$__  $$| $$$    /$$$| $$_____/\r\n");
		System.out.print("| $$ /$$$| $$| $$      | $$      | $$  \\__/| $$  \\ $$| $$$$  /$$$$| $$      \r\n");
		System.out.print("| $$/$$ $$ $$| $$$$$   | $$      | $$      | $$  | $$| $$ $$/$$ $$| $$$$$   \r\n");
		System.out.print("| $$$$_  $$$$| $$__/   | $$      | $$      | $$  | $$| $$  $$$| $$| $$__/   \r\n");
		System.out.print("| $$$/ \\  $$$| $$      | $$      | $$    $$| $$  | $$| $$\\  $ | $$| $$      \r\n");
		System.out.print("| $$/   \\  $$| $$$$$$$$| $$$$$$$$|  $$$$$$/|  $$$$$$/| $$ \\/  | $$| $$$$$$$$\r\n");
		System.out.print("|__/     \\__/|________/|________/ \\______/  \\______/ |__/     |__/|________/\r\n");
		
		Scanner sc = new Scanner(System.in);
		stage.giveResources(gamer);
		
		while(true) {
			mainMenu();			
			if(sc.hasNext()) {
				switch(sc.nextLine()) {
				case "1" :
					unitProduceMenu(sc);
					break;
				case "2" :
					unitTrainingMenu(sc);
					break;
				case "3" :
					unitBattleMenu();
					break;
				case "4" :
					gameExit();
					break;
				default :
					System.out.println("��ȿ���� ���� �޴� ����Դϴ�.");
					break;
				}
			}
		}
		
	}
	
	private void menuFrame(String title) {
		System.out.println();
		System.out.println("=======================================");
		System.out.println(title);
		System.out.println("���� �������� : " + stage.getLevel());
		System.out.println();
		System.out.println("���� ����");
		System.out.println("HP, ���ݷ�, �濩��");
		System.out.println(enemy.getUnits().peek());
	}
	
	private void mainMenu() {
		menuFrame("��Ÿũ����Ʈ ���� ���潺");
		System.out.println();
		System.out.println("���� ���� ����");
		System.out.println(gamer.getUnits());
		System.out.println("=======================================");
		System.out.println("       ���Ͻô� �޴��� ��ȣ�� �Է��ϼ���!       ");
		System.out.println("1. ���� ����");
		System.out.println("2. ����� ���� �ɷ�ġ ���׷��̵�");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.print("> ");
	}
	
	private void unitProduceMenu(Scanner sc) {
		menuFrame("���� ����");
		System.out.println();
		System.out.println("���� ���� �ڿ�");
		System.out.println("�̳׶�: " + gamer.getMineral() + ", ����: " + gamer.getGas() );
		System.out.println();
		System.out.println("���� ����");
		System.out.println("�̳׶�, ����, HP, ���ݷ�, ����");
		System.out.println("=======================================");
		System.out.println("       ���Ͻô� �޴��� ��ȣ�� �Է��ϼ���!       ");
		System.out.println("1. " + new Marine());
		System.out.println("2. " + new Firebat());
		System.out.println("3. " + new Vulture());
		System.out.println("4. " + new Tank());
		System.out.println("5. " + new Goliath());
		System.out.println("6. " + new Wraith());
		System.out.println("7. " + new Battlecruiser());
		System.out.println("8. " + new Valkyrie());
		System.out.println("9. ���� ȭ������ �̵�");
		System.out.print("> ");
		
		int menu = sc.nextInt();
		
		if(1<=menu && menu <= 8)
			unitProduce(menu);
		else if(menu == 9)
			return;
		else {
			System.out.println("��ȿ���� ���� �޴� ����Դϴ�.");
			return;
		}
		
	}
	
	private void unitTrainingMenu(Scanner sc) {
		menuFrame("����� ���� �ɷ�ġ ���׷��̵�");
		System.out.println();
		System.out.println("���� ���� �ڿ�");
		System.out.println("�̳׶�: " + gamer.getMineral() + ", ����: " + gamer.getGas() );
		System.out.println();
		System.out.println("���׷��̵� �ʿ� �ڿ�");
		System.out.println("�̳׶�: 200, ����: 200");
		System.out.println("=======================================");
		System.out.println("       ���Ͻô� �޴��� ��ȣ�� �Է��ϼ���!       ");
		System.out.println("1. ���� ���ݷ� ���׷��̵�");
		System.out.println("2. ���� ���� ���׷��̵�");
		System.out.println("3. ���� ���ݷ� ���׷��̵�");
		System.out.println("4. ���� ���� ���׷��̵�");
		System.out.println("5. ���ּ� ���ݷ� ���׷��̵�");
		System.out.println("6. ���ּ� ���� ���׷��̵�");
		System.out.println("7. ���� ȭ������ �̵�");
		System.out.print("> ");
		
		int menu = sc.nextInt();
		
		if(1<=menu && menu <= 6)
			unitTraining(menu);
		else if(menu == 7)
			return;
		else {
			System.out.println("��ȿ���� ���� �޴� ����Դϴ�.");
			return;
		}
	}
	
	private void unitBattleMenu() {
		menuFrame("���� VS ����");
		System.out.println("=======================================");
		
		if(stage.battle(gamer, enemy)) {
			stage.levelUp();
			stage.giveResources(gamer);
		}
		else
			gameExit();
	}
	
	private void gameExit() {
		System.out.println();
		System.out.println("=======================================");
		System.out.println("��Ÿũ����Ʈ ���� ���潺");
		System.out.println("������ ����Ǿ����ϴ�.");
		System.out.println("=======================================");
		System.exit(0);
	}
	
	
	private void unitProduce(int menu) {
		String[] unitMenu = {
				"Marine", "Firebat", "Vulture", "Tank",
				"Goliath", "Wraith", "Battlecruiser", "Valkyrie"
		};
		
		if(exchange.getOrder(gamer.unitOrdering(unitMenu[menu-1])))
			gamer.getUnit(exchange.giveUnit());
	}
	
	private void unitTraining(int menu) {
		String[][] trainMenu = {
			{"Bionic" , "Power"},
			{"Bionic" , "Armor"},
			{"Mechanic" , "Power"},
			{"Mechanic", "Armor"},
			{"AirForce" , "Power"},
			{"AirForce", "Armor"},
		};
		
		if(exchange.getOrder(gamer.trainOrdering(trainMenu[menu-1][0], trainMenu[menu-1][1])))
			gamer.unitTrain(exchange.trainingUnit());
	}
	
	
}
