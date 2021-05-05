package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entites.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService _gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this._gamerCheckService = gamerCheckService;
	}

	@Override
	public void Save(Gamer gamer) {
		if(_gamerCheckService.CheckIfRealPerson(gamer)) {
		System.out.println("Gamer Saved :" + gamer.getFirstName());	
		}else {
			System.out.println("Ger�ek Ki�i De�il");
		}
		

	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Gamer Updated :" + gamer.getFirstName());

	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Gamer Deleted :" + gamer.getFirstName());

	}

}
