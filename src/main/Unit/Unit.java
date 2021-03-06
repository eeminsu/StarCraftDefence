package main.Unit;

public abstract class Unit {
	int hp;
	int power;
	int armor;
	
	final int MIN_HP = 0;
	final int MINERAL;
	final int GAS;
	
	Unit(int mineral, int gas){
		this.MINERAL = mineral;
		this.GAS = gas;
	}
	
	public void attack(Unit u) {
		u.damaged(this.getPower());
	}

	protected void damaged(int power) {
		this.setHp(this.getHp() - (power - this.getArmor()));
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
		
		if(this.hp < MIN_HP)
			this.hp = MIN_HP;
	}
	
	public int getMINERAL() {
		return MINERAL;
	}

	public int getGAS() {
		return GAS;
	}

	public int getPower() {
		return this.power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getArmor() {
		return this.armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
}
