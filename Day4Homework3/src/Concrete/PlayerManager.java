package Concrete;

import Abstract.PlayerService;
import Abstract.ValidationService;
import Entities.Player;

public class PlayerManager implements PlayerService{
private ValidationService validationService;

public PlayerManager(ValidationService validationService) {
	this.validationService = validationService;
}
public void add(Player player) {
	if(validationService.validate(player)) {
		System.out.println(player.getFirstName() +"Kullanici sisteme kaydedildi" );
	}else {
		System.out.println("Ge�ersiz kimlik bilgisi...");
	}
}

public void delete(Player player) {
	System.out.println(player.getFirstName() + "isimli oyuncu sistemden kald�r�ld�");
}
public void update(Player player) {
	System.out.println(player.getFirstName() + "Sisteme kaydi g�ncellendi");
}
}
