package main.Unit;

public class Tank extends Unit implements Army{
	
	public Tank(){
		super(150, 100);
		this.hp = 150;
		this.power = 30;
		this.armor = 1;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "≈ ≈©(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
