package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer1) {
		System.out.println("Saved to db : " + customer1.getName());
		
	}

	public void save(Customer customer1) {
		// TODO Auto-generated method stub
		
	}

}
