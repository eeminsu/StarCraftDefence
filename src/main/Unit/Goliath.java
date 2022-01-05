package main.Unit;

public class Goliath extends Unit implements Army, Mechanic {
	private int missilePower = 20;
	
	public Goliath() {
		super(100,50);
		this.hp = 125;
		this.power = 12;
		this.armor = 1;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
		else if(u instanceof AirForce)
			u.damaged(missilePower);
	}
	
	public String toString() {
		return "°ñ¸®¾Ñ(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
