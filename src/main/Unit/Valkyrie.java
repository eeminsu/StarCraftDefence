package main.Unit;

public class Valkyrie extends Unit implements AirForce {
	public Valkyrie() {
		super(250, 125);
		this.hp = 200;
		this.power = 24;
		this.armor = 2;
	}
	
	public void attack(Unit u) {
		if(u instanceof AirForce)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "¹ßÅ°¸®(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
