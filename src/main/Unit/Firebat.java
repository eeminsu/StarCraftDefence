package main.Unit;

public class Firebat extends Unit implements Army, Bionic{
	
	public Firebat(){
		super(50,25);
		this.hp = 50;
		this.power = 16;
		this.armor = 1;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "ÆÄÀÌ¾î¹î(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
	
}
