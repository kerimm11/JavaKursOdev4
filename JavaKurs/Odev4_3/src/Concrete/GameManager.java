package Concrete;

import Entities.Game;

public class GameManager {
	
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu baþarýyla eklendi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu baþarýyla silindi.");
	}
	
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu baþarýyla güncellendi.");
	}

}
