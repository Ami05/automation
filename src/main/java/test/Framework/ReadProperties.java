package test.Framework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	private Properties p;

	public ReadProperties() {
		try {
			FileReader reader = new FileReader(System.getProperty("user.dir")+"/src/main/java/files/locator.properties");

			p = new Properties();
			p.load(reader);

		} catch (IOException ioException) {
			System.out.println(ioException.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getLocator(String locator) {

		String loc = p.getProperty(locator);
		return loc;
	}
}
