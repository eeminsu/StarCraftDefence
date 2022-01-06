package main;

public class Game {
	private static Game game = null;
	
	private Game() {}
	
	public static Game getInstance() {
		if(game == null) {
			game = new Game();
			return game;
		}
		return game;
	}
	
}
