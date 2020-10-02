package courier.main;

import courier.dao.DAO;
import courier.utility.ReadData;

public class CourierMain {

	public static void main(String[] args) {
	
		DAO dao = new DAO();
		callingMenuOptions(dao);

	}

	private static void callingMenuOptions(DAO dao) {
		
		switch(ReadData.readData()) {
		
		case "Enter customer Details":
			//dao.saveCustomer(customer);
		}
		
	}

}
