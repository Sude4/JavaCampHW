package Concrete;
import Abstract.CustomerCheckService;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
private CustomerCheckService customerCheckService ;
public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	this.customerCheckService=customerCheckService;

}

@Override
public void save(Customer customer) {
	if(customerCheckService.checkIfRealPerson(customer)) {
		super.Save(customer);
	}
	else {
		System.out.println("Not a valid person");
	}
}
}
