package main.Unit;

public class HunterKiller extends Unit implements Army{
	public HunterKiller() {
		super(0,0);
		this.hp = 1200;
		this.power = 40;
		this.armor = 8;
	}
	
	public String toString() {
		return "«Â≈Õ ≈≥∑Ø(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
