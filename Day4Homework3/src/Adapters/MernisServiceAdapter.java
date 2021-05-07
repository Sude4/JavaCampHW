package Adapters;

import java.rmi.RemoteException;

import Abstract.ValidationService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ValidationService{

	@Override
	public boolean validate(Player player) {
		KPSPublicSoap soapClient =new KPSPublicSoapProxy();
			boolean result = false;	
			try {
				result = soapClient.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()),player.getFirstName(),player.getLastName(),player.getYearOfBirth());
				
			}catch (NumberFormatException e) {
				   e.printStackTrace();
			  } catch (RemoteException e) {
			       e.printStackTrace();
			  }
			 return result;

}
}

