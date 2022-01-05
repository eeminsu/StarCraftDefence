package main.Unit;

public class Marine extends Unit implements Army, Bionic{
	
	public Marine(){
		super(50,0);
		this.hp = 40;
		this.power = 6;
		this.armor = 0;
	}
	
	public String toString() {
		return "¸¶¸°(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
