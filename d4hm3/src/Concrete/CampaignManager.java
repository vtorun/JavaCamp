package Concrete;

import Abstract.CampaignService;
import Entites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void Save(Campaign campaign) {
		System.out.println("Saved :" + campaign.getCampaignName());

	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println("Updated :" + campaign.getCampaignName());

	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Deleted :" + campaign.getCampaignName());

	}

}
