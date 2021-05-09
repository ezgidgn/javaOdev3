import Abstract.BaseCustomerManager;
import Adapaters.MernisServiceAdapter;

import java.util.Date;


import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	


	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(2, "	Ezgi","	Doðan", new Date(1999,10,3), "46885461024"));
	}

}
