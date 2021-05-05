package Concrete;

import Abstract.GameService;
import Entites.Game;

public class GameManager implements GameService {

	@Override
	public void Save(Game game) {
		System.out.println("Saved :" + game.getGameName());

	}

	@Override
	public void Update(Game game) {
		System.out.println("Updated :" + game.getGameName());

	}

	@Override
	public void Delete(Game game) {
		System.out.println("Deleted :" + game.getGameName());
	}

}
