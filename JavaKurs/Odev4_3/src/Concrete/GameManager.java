package Concrete;

import Entities.Game;

public class GameManager {
	
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu ba�ar�yla eklendi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu ba�ar�yla silindi.");
	}
	
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu ba�ar�yla g�ncellendi.");
	}

}
