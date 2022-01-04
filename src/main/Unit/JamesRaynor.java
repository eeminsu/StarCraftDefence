package main.Unit;

public class JamesRaynor extends Unit implements Army {
	public JamesRaynor() {
		super(0,0);
		this.hp = 200;
		this.power = 18;
		this.armor = 3;
	}
	
	public String toString() {
		return "Áü·¹ÀÌ³Ê(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
