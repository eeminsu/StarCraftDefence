package main.Unit;

public class AlanSchezar extends Unit implements Army {
	private int missilePower = 40;

	public AlanSchezar() {
		super(0,0);
		this.hp = 1000;
		this.power = 24;
		this.armor = 3;
	}

	public void attack(Unit u) {
		if (u instanceof Army)
			u.damaged(this.getPower());
		else if (u instanceof AirForce)
			u.damaged(missilePower);
	}

	public String toString() {
		return "¾Ù·± ¼ÎÀÚ¸£(" + getHp() + "," + getPower() + "," + getArmor() + ")";
	}
}
