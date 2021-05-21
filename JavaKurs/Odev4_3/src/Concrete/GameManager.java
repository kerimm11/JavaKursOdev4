package Concrete;

import Entities.Game;

public class GameManager {
	
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu başarıyla eklendi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu başarıyla silindi.");
	}
	
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu başarıyla güncellendi.");
	}

}
