package main.Player;

import java.util.LinkedList;

import main.Unit.AlanSchezar;
import main.Unit.EdmundDuke;
import main.Unit.Fenix;
import main.Unit.GuiMontag;
import main.Unit.HunterKiller;
import main.Unit.JamesRaynor;
import main.Unit.Kukulza;
import main.Unit.SarahKerrigan;
import main.Unit.Torrasque;
import main.Unit.Unit;
import main.Unit.Zeratul;

public class Enemy extends Player{
	private static Enemy enemy = null;
	
	private Enemy() {
		LinkedList<Unit> list = new LinkedList<Unit>();
		
		list.add(new JamesRaynor());
		list.add(new GuiMontag());
		list.add(new SarahKerrigan());
		list.add(new EdmundDuke());
		list.add(new AlanSchezar());
		list.add(new HunterKiller());
		list.add(new Kukulza());
		list.add(new Torrasque());
		list.add(new Fenix());
		list.add(new Zeratul());
		
		super.setUnits(list);
	}
	
	public static Enemy getInstance() {
		if(enemy == null) {
			enemy = new Enemy();
			return enemy;
		}
		return enemy;
	}
}
