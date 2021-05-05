package Abstract;

import Entites.Game;

public interface GameService {
	public void Save(Game game);

	public void Update(Game game);

	public void Delete(Game game);
}
