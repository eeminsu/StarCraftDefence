package main.Unit;

public class Fenix extends Unit implements Army {
	public Fenix() {
		super(0,0);
		this.hp = 1800;
		this.power = 40;
		this.armor = 2;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "ÇÇ´Ð½º(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
