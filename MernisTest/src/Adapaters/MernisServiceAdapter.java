package Adapaters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		
		try {
			
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),
		                   customer.getName().toUpperCase() ,
		                   customer.getLastName().toUpperCase(),
		                   customer.getDateOfBirth().getYear());
		
		
		}
		
		catch (Exception e) {
			System.out.println("Not a valied person");
		
		}
		return serviceResult;
		
		
	}

}
