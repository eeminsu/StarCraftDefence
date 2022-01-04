package main.Unit;

public class EdmundDuke extends Unit implements Army {
	public EdmundDuke() {
		super(0,0);
		this.hp = 800;
		this.power = 70;
		this.armor = 3;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "에드먼드 듀크(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
