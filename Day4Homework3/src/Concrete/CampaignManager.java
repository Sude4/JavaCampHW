package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{
public void add(CampaignService campaign) {
	System.out.println(campaign.getName() + "adli kampanya eklendi...");
}
public void update(Campaign campaign) {
	System.out.println(campaign.getName() + "adli kampanya güncellendi...");
}
public void delete (Campaign campaign) {
	System.out.println(campaign.getName() + "adli kampanya silindi...");
}
@Override
public void add(Campaign campaign) {
	// TODO Auto-generated method stub
	
}
@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
}
