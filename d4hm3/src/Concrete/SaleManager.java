package Concrete;

import Abstract.SaleService;
import Entites.Campaign;
import Entites.Game;
import Entites.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void Sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " '" + game.getGameName() + "' oyununu "
				+ game.getPrice() + " TL'ye satýn aldý.");

	}

	@Override
	public void SaleCampaing(Gamer gamer, Game game, Campaign campaing) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " '" + game.getGameName() + "' oyununu %"
				+ campaing.getDiscountPercent() + " indirimle "
				+ (game.getPrice() - (game.getPrice() * campaing.getDiscountPercent() / 100)) + " TL'ye satýn aldý.");

	}

}
