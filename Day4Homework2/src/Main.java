import java.util.Date;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception{
		
BaseCustomerManager customerManager =new NeroCustomerManager();
Customer customer1 =new Customer(1,"Meryem Sude","Çetin","12345678912",new Date(2001));



}
}
	
