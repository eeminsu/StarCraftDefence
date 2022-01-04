package main.Unit;

public class Battlecruiser extends Unit implements AirForce{
	public Battlecruiser() {
		super(400, 300);
		this.hp = 500;
		this.power = 25;
		this.armor = 3;
	}
	
	public String toString() {
		return "배틀크루저(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
