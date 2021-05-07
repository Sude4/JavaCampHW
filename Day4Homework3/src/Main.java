import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;


import Adapters.MernisServiceAdapter;
public class Main {

	public static void main(String[] args) {
PlayerManager playerManager =new PlayerManager(new MernisServiceAdapter());
GameManager gameManager =new GameManager();
CampaignManager campaignManager =new CampaignManager();
SaleManager saleManager =new SaleManager();

Player player =new Player(1,"Sude","Çetin",2001,"12345678911");
playerManager.add(player);
playerManager.delete(player);
playerManager.update(player);

Campaign campaign1 = new Campaign(1, "Sömestr", 50);
campaignManager.add(campaign1);
campaignManager.update(campaign1);
campaignManager.delete(campaign1);


Game game = new Game(1, "FIFA", 350);
gameManager.add(game);
gameManager.update(game);
gameManager.delete(game);
	
//saleManager.sale(player, game,campaignManager);

SaleManager sale = new SaleManager();
saleManager.sale(game, campaign1, player);
	}

}
