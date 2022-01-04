package main;

import main.Player.Enemy;
import main.Player.Gamer;

public class Stage {
	private int level = 1;
	private final int MIN_LEVEL = 1;
	private final int MAX_LEVEL = 10;
	private final int[] MINERAL = {};
	private final int[] GAS = {};

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(!(MIN_LEVEL <= level && level <= MAX_LEVEL))
			return;
		
		this.level = level;
	}
	
	public boolean battle(Gamer gamer, Enemy enemy) {
		
		return false;
	}
	
	public void levelUp() {
		this.level++;
	}
	
	public void giveResources(int level, Gamer gamer) {
		// 게이머에게 미네랄을 주는 코드
		
		// 게이머에게 가스를 주는 코드
	}
	
	
}
