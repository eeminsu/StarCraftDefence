package main.Unit;

public class Wraith extends Unit implements AirForce{
	private int missilePower = 20;
	
	public Wraith() {
		super(150,100);
		this.hp = 120;
		this.power = 8;
		this.armor = 0;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
		else if(u instanceof AirForce)
			u.damaged(missilePower);
	}
	
	public String toString() {
		return "∑π¿ÃΩ∫(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
