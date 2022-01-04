package main.Unit;

public class Torrasque extends Unit implements Army{
	public Torrasque() {
		super(0,0);
		this.hp = 1600;
		this.power = 50;
		this.armor = 4;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "토라스크(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
	
}
