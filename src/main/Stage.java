package main;

import java.util.Queue;

import main.Player.Enemy;
import main.Player.Gamer;
import main.Unit.Unit;

public class Stage {
	private int level = 1;
	private final int MIN_LEVEL = 1;
	private final int MAX_LEVEL = 10;
	private final int[] MINERAL = {300, 500, 700, 900, 1100, 1200, 1300, 1400, 1500, 1600};
	private final int[] GAS = {200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100};

	private static Stage stage = null;
	private Stage() {}
	
	public static Stage getInstance() {
		if(stage == null) {
			stage = new Stage();
			return stage;
		}
		return stage;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(!(MIN_LEVEL <= level && level <= MAX_LEVEL))
			return;
		
		this.level = level;
	}
	
	public boolean battle(Gamer gamer, Enemy enemy) {
		Queue<Unit> gUnit = gamer.getUnits();
		Unit hero = enemy.getUnits().remove();
		
		while(hero.getHp() > 0 && !gUnit.isEmpty()) {
			
			Unit unit = gUnit.peek();
			
			System.out.println("���� ���� ���� ��� : " + gUnit);
			System.out.println("���� �������� ����  : " + unit);
			
			while(hero.getHp() > 0 && unit.getHp() > 0) {
				int turn = (int)(Math.random() * 2);
				
				if(turn == 0) {
					unit.attack(hero);
					hero.attack(unit);
				}
				else {
					hero.attack(unit);
					unit.attack(hero);
				}
			}
			System.out.println("���� �ܿ� HP     : " + hero.getHp());
			System.out.println(".....������.....");
			
			if(unit.getHp() <= 0)
				gUnit.poll();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(hero.getHp() > 0) {
			System.out.println("�й��Ͽ����ϴ�...");
			return false;
		}
		else {
			System.out.println("�¸��Ͽ����ϴ�!");
			return true;
		}
	}
	
	public void levelUp() {
		this.level++;
	}
	
	public void giveResources(Gamer gamer) {
		gamer.setMineral(gamer.getMineral() + MINERAL[level]);
		gamer.setGas(gamer.getGas() + GAS[level]);
	}
	
	
}
