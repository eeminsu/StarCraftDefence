package main.Unit;

public class Zeratul extends Unit implements Army{
	public Zeratul() {
		super(0,0);
		this.hp = 2000;
		this.power = 60;
		this.armor = 3;
	}
	
	public String toString() {
		return "Á¦¶óÅø(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
