package main.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class PropertiesUtils {

	private static final String PROPERTIES_RESOURCE_NAME = "Opendaylight_1.properties";
	private static PropertiesUtils propertiesInstance = null;
	private static Properties properties = null;
	
	//CSV_FILE=c:\\_dev\\Eclipse\\Eclipse_workspace\\Opendaylight_1\\resources\\input\\Periodic Table of Elements.csv
	//JSON_OUTPUT_FILE=c:\\_dev\\Eclipse\\Eclipse_workspace\\Opendaylight_1\\resources\\output\\PeriodicElements.json
	//XML_OUTPUT_FILE=c:\\_dev\\Eclipse\\Eclipse_workspace\\Opendaylight_1\\resources\\output\\PeriodicElements.xml
	private static final String CSV_FILE = "CSV_FILE";
	private static final String JSON_OUTPUT_FILE = "JSON_OUTPUT_FILE";
	private static final String XML_OUTPUT_FILE = "XML_OUTPUT_FILE";
	
	private PropertiesUtils() throws IOException , Exception {

		FileInputStream input = null;
		
		String propDir = PROPERTIES_RESOURCE_NAME;

		input = new FileInputStream(propDir);
		
		properties = new Properties();
		properties.load(input);
	}

	public static PropertiesUtils getInstance() throws Exception {

		if (propertiesInstance == null) {
			propertiesInstance = new PropertiesUtils();
		}

		return propertiesInstance;
	}

	public Properties getProperty() {
		return properties;
	}

	public static void setProperties(Properties aProperties) {
		properties = aProperties;
	}

	public static String getCsvFile() {
		return properties.getProperty(CSV_FILE);
	}

	public static String getJsonOutputFile() {
		return properties.getProperty(JSON_OUTPUT_FILE);
	}

	public static String getXmlOutputFile() {
		return properties.getProperty(XML_OUTPUT_FILE);
	}



}
