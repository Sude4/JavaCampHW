package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void save(Game game) {
	System.out.println(game.getGameName() + "Adli oyun sisteme kay�t edildi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "Adli oyun sistemden cikarildi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "Adli oyun g�ncellendi...");
		
	}

	public void add(Game game) {
		// TODO Auto-generated method stub
		
	}


}
