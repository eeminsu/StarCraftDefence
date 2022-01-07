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
					System.out.println("유효하지 않은 메뉴 목록입니다.");
					break;
				}
			}
		}
		
	}
	
	private void menuFrame(String title) {
		System.out.println();
		System.out.println("=======================================");
		System.out.println(title);
		System.out.println("현재 스테이지 : " + stage.getLevel());
		System.out.println();
		System.out.println("영웅 정보");
		System.out.println("HP, 공격력, 방여력");
		System.out.println(enemy.getUnits().peek());
	}
	
	private void mainMenu() {
		menuFrame("스타크래프트 영웅 디펜스");
		System.out.println();
		System.out.println("현재 생산 유닛");
		System.out.println(gamer.getUnits());
		System.out.println("=======================================");
		System.out.println("       원하시는 메뉴의 번호를 입력하세요!       ");
		System.out.println("1. 유닛 생산");
		System.out.println("2. 생산된 유닛 능력치 업그레이드");
		System.out.println("3. 전투 시작");
		System.out.println("4. 게임 종료");
		System.out.print("> ");
	}
	
	private void unitProduceMenu(Scanner sc) {
		menuFrame("유닛 생산");
		System.out.println();
		System.out.println("현재 보유 자원");
		System.out.println("미네랄: " + gamer.getMineral() + ", 가스: " + gamer.getGas() );
		System.out.println();
		System.out.println("유닛 정보");
		System.out.println("미네랄, 가스, HP, 공격력, 방어력");
		System.out.println("=======================================");
		System.out.println("       원하시는 메뉴의 번호를 입력하세요!       ");
		System.out.println("1. " + new Marine());
		System.out.println("2. " + new Firebat());
		System.out.println("3. " + new Vulture());
		System.out.println("4. " + new Tank());
		System.out.println("5. " + new Goliath());
		System.out.println("6. " + new Wraith());
		System.out.println("7. " + new Battlecruiser());
		System.out.println("8. " + new Valkyrie());
		System.out.println("9. 메인 화면으로 이동");
		System.out.print("> ");
		
		int menu = sc.nextInt();
		
		if(1<=menu && menu <= 8)
			unitProduce(menu);
		else if(menu == 9)
			return;
		else {
			System.out.println("유효하지 않은 메뉴 목록입니다.");
			return;
		}
		
	}
	
	private void unitTrainingMenu(Scanner sc) {
		menuFrame("생산된 유닛 능력치 업그레이드");
		System.out.println();
		System.out.println("현재 보유 자원");
		System.out.println("미네랄: " + gamer.getMineral() + ", 가스: " + gamer.getGas() );
		System.out.println();
		System.out.println("업그레이드 필요 자원");
		System.out.println("미네랄: 200, 가스: 200");
		System.out.println("=======================================");
		System.out.println("       원하시는 메뉴의 번호를 입력하세요!       ");
		System.out.println("1. 보병 공격력 업그레이드");
		System.out.println("2. 보병 방어력 업그레이드");
		System.out.println("3. 차량 공격력 업그레이드");
		System.out.println("4. 차량 방어력 업그레이드");
		System.out.println("5. 우주선 공격력 업그레이드");
		System.out.println("6. 우주선 방어력 업그레이드");
		System.out.println("7. 메인 화면으로 이동");
		System.out.print("> ");
		
		int menu = sc.nextInt();
		
		if(1<=menu && menu <= 6)
			unitTraining(menu);
		else if(menu == 7)
			return;
		else {
			System.out.println("유효하지 않은 메뉴 목록입니다.");
			return;
		}
	}
	
	private void unitBattleMenu() {
		menuFrame("유닛 VS 영웅");
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
		System.out.println("스타크래프트 영웅 디펜스");
		System.out.println("게임이 종료되었습니다.");
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
