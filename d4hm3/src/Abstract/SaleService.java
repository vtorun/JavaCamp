package Abstract;

import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public interface SaleService {
	void Sale(Gamer gamer, Game game);

	void SaleCampaing(Gamer gamer, Game game, Campaign campaing);
}
