package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Campaign campaign, Player player) {
	System.out.println(player.getFirstName()+ " " + 
	player.getLastName() + " " + game.getGameName() + "isimli oyun  " +
			 game.getGameName ()+ " Fiyatiyla satildi...");
		
	}

	/*public void sale(Player player, Game game, CampaignManager campaignManager) {
		// TODO Auto-generated method stub
		
	}*/

}
