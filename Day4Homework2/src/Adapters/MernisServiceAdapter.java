package Adapters;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
//import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
//import java.rmi.RemoteException;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()) , customer.getName().toUpperCase(), 
					customer.getLastname().toUpperCase(), customer.getDateOfBirth());
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
	return result;
	}
}
