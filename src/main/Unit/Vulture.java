package main.Unit;

public class Vulture extends Unit implements Army{
	
	public Vulture(){
		super(75,0);
		this.hp = 50;
		this.power = 16;
		this.armor = 1;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "น๚รณ(" + MINERAL + ","  + GAS + ","  + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}

}
