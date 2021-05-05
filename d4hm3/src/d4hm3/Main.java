package d4hm3;

import Entites.Gamer;
import Entites.Game;

import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entites.Campaign;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Volkan", "Torun", LocalDate.of(1990, 4, 7), "12345678900");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.Save(gamer);
		gamerManager.Update(gamer);
		gamerManager.Delete(gamer);
		System.out.println("-------------------------");

		Game game = new Game(1, "PES 2021", 750);
		GameManager gameManager = new GameManager();
		gameManager.Save(game);
		gameManager.Update(game);
		gameManager.Delete(game);
		System.out.println("-------------------------");

		Campaign campaign = new Campaign(1, "Hafta Sonu Ýndirimi", 50,
				"Hafta sonu için geçerli PS4 oyunlarýnda yüzde 25 indirim");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Save(campaign);
		campaignManager.Update(campaign);
		campaignManager.Delete(campaign);
		System.out.println("-------------------------");

		SaleManager saleManager = new SaleManager();
		saleManager.Sale(gamer, game);
		saleManager.SaleCampaing(gamer, game, campaign);
	}

}
