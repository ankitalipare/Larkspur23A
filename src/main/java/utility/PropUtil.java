package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * This class used for to read property file. it contain method to read property file
 */
public class PropUtil {

	private String filePath;

	// value get inti at the time of object creation
	// it will point only one file path
	public PropUtil(String file) {

		filePath = file;
	}

	public PropUtil() {

	}

	public String getValue(String filePath, String key) {

		FileInputStream fis = null;
		try {

			fis = new FileInputStream(filePath);

		} catch (FileNotFoundException e) {

		}
		Properties prop = new Properties();
		try {
			prop.load(fis);

		} catch (IOException e) {
		}

		String value = prop.getProperty(key);
		return value;
	}

	/**
	 * This method use during object creation
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getValue(String key) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);

		Properties p = new Properties();

		p.load(fis);

		return p.getProperty(key);
	}
}
