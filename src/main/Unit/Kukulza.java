package main.Unit;

public class Kukulza extends Unit implements AirForce{
	public Kukulza() {
		super(0,0);
		this.hp = 1400;
		this.power = 40;
		this.armor = 3;
	}
	
	public String toString() {
		return "ÄíÄğÀÚ(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
