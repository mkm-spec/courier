package courier.main;

import courier.dao.DAO;
import courier.utility.ReadData;

public class CourierMain {

	public static void main(String[] args) {
	
		DAO dao = new DAO();
		callingMenuOptions(dao);

	}

	private static void callingMenuOptions(DAO dao) {
		
		int options = -1;
		try {
			options = Integer.valueOf(ReadData.readData());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		switch(options) {
		
		case 0:
			//dao.saveCustomer(customer);
		}
		
	}

}
