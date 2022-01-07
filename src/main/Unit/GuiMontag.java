package main.Unit;

public class GuiMontag extends Unit implements Army{
	public GuiMontag() {
		super(0,0);
		this.hp = 400;
		this.power = 25;
		this.armor = 3;
	}
	
	public void attack(Unit u) {
		if(u instanceof Army)
			u.damaged(this.getPower());
	}
	
	public String toString() {
		return "구이 몬타크(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
