package main.Unit;

public class SarahKerrigan extends Unit implements Army{
	public SarahKerrigan() {
		super(0,0);
		this.hp = 600;
		this.power = 30;
		this.armor = 3;
	}
	
	
	public String toString() {
		return "��� �ɸ���(" + getHp() + ","  + getPower() + ","  + getArmor() + ")";
	}
}
