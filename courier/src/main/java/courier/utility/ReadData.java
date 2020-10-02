package courier.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.*;

public class ReadData {
	
	private static Logger LOG = Logger.getLogger(ReadData.class);
	
	public static String readData() {
		
		String data = null;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			data = reader.readLine();
		}catch(IOException io) {
			LOG.error("Input output exception. Please check the string");
			io.printStackTrace();
		}finally {
			reader = null;
		}
		return data;
	}

}
