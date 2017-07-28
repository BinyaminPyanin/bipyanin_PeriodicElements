package main.java;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.google.gson.Gson;

/**
 * 
 * @author BIPYANIN
 *
 */
public class Provider {
	
	private final static Logger logger = Logger.getLogger(Provider.class);
	private final static String DELIMETER_COMMA=",";
	private final static String DELIMETER_PIPE="|";
	private final static String DELIMITER_PIPE_SPLIT="\\|";	
	private final static String DELIMITER_NEW_LINE="\r\n|\r|\n";
	private final static int NUM_OF_COLUMNS=23;
	private final static String PROPETIES_FILE_NAME="Opendaylight_1.properties";	
	
	static{
		BasicConfigurator.configure();		
	}
	
	/**
	 * createSinglePeriodicElement
	 * 
	 * @param splittedLine
	 * @return
	 * @throws PeriodicElementException
	 */
	private static PeriodicElement createSinglePeriodicElement(String splittedLine) throws PeriodicElementException{
		
		String msg="";		
		String[] splittedElements = splittedLine.split(DELIMITER_PIPE_SPLIT);
		if(splittedElements.length%NUM_OF_COLUMNS != 0){			
			msg="The length of splitted array:" + splittedElements.length + " is not equal to " + NUM_OF_COLUMNS +".";			
			logger.debug(msg);
			throw new PeriodicElementException(msg);
		}
		
		PeriodicElement pe = new PeriodicElement();
		
		pe.setAtomicNumber(splittedElements[0]);	
		pe.setElementSymbol(splittedElements[1]);
		pe.setAtomicWeight(splittedElements[2]);
		pe.setPeriod(splittedElements[3]);
		pe.setGroup(splittedElements[4]);	
		pe.setPhase(splittedElements[5]);
		pe.setMostStableCrystal(splittedElements[6]);
		pe.setType(splittedElements[7]);
		pe.setIonicRadius(splittedElements[8]);
		pe.setAtomicRadius(splittedElements[9]);
		pe.setElectronegativity(splittedElements[10]);	
		pe.setFirstIonization(splittedElements[11]); 
		pe.setPotential(splittedElements[12]);
		pe.setDensity(splittedElements[13]);
		pe.setMeltingPoint(splittedElements[14]);
		pe.setBoilingPoint(splittedElements[15]);	
		pe.setIsotopes(splittedElements[16]);
		pe.setDiscoverer(splittedElements[17]);
		pe.setYearOfDiscovery(splittedElements[18]);
		pe.setSpecificHeatCapacity(splittedElements[19]);
		pe.setElectronConfiguration(splittedElements[20]);	
		pe.setDisplayRow(splittedElements[21]);
		pe.setDisplayColumn(splittedElements[22]);
		
		return pe;
	}
	
	/**
	 * createPeriodicElementFactory
	 * 
	 * @param sb
	 * @return
	 * @throws PeriodicElementException
	 */
	private static ArrayList<PeriodicElement> createPeriodicElementFactory(StringBuffer sb) throws PeriodicElementException{
		
		ArrayList<PeriodicElement> list = new ArrayList<PeriodicElement>();		
		String[] splittedLines = sb.toString().split(DELIMITER_NEW_LINE);
		int length=splittedLines.length;
		
		//Skip headers
		for (int i = 1; i < length-1; i++) {		
			PeriodicElement pe = createSinglePeriodicElement(splittedLines[i]);
			logger.debug("Adding:"+pe.toString());
			list.add(pe);
		}
		
		logger.debug("List of PeriodicElement contains " + list.size() + " elements.");
		return list;
	}

	/**
	 * parseCsvFile
	 * 
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */
	public static StringBuffer parseCsvFile(String path){
		
		StringBuffer sb = new StringBuffer();
				
        Scanner scanner;
		try {
			scanner = new Scanner(new File(path));
		
	        scanner.useDelimiter(DELIMETER_COMMA); 
	
	        StringBuffer sbQuote= new StringBuffer();
	        boolean quoteFound=false;
	        boolean skipMainBuffer=false;
	        
	        while(scanner.hasNext()){
	        	String cellValue = scanner.next();
	
	        		//Special case with comma inside the cell
	        		//For example "Gahn, Scheele"
	        		if(cellValue.startsWith("\"") || quoteFound){
	            		sbQuote.append(cellValue+" ");
	            		quoteFound=true;
	            		skipMainBuffer=true;
	            	}
	        		
	        		if(!skipMainBuffer){
	        			sb.append(cellValue+DELIMETER_PIPE);
	        		}
	        		
	            	if(cellValue.endsWith("\"")){
	            		sbQuote.append(DELIMETER_PIPE);
	            		quoteFound=false;
	            		logger.debug(sbQuote.toString());
	            		sb.append(sbQuote.toString());
	            		sbQuote = new StringBuffer();
	            		skipMainBuffer=false;
	            	}	
	
	        }//end of while
	        
	        scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
		}
        return sb;
	}
	
	/**
	 * logPeriodicTable
	 * 
	 * @param sb
	 */
	public static ArrayList<PeriodicElement> logPeriodicTable(StringBuffer sb){
		
		String msg="";
		
		//Create PeriodicElement object
        ArrayList<PeriodicElement> list = null;
        try {
        	list = Provider.createPeriodicElementFactory(sb);
		} catch (PeriodicElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                       
        if(list!=null){        	
        	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				PeriodicElement periodicElement = (PeriodicElement) iterator.next();
				logger.info(periodicElement.toString());	
			}  	
        }else{
        	msg="List of PeriodicElements is null.";
        	logger.debug(msg);
        }
        
        return list;
	}
	
	/**
	 * exportToJson
	 * 
	 * @param path
	 * @param list
	 * @throws IOException 
	 */
	public static boolean exportToJson(String path,ArrayList<PeriodicElement> list){
		
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
			
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				PeriodicElement periodicElement = (PeriodicElement) iterator.next();
				Gson gson = new Gson();
				String json = gson.toJson(periodicElement);
				logger.debug(json);
				
				//Write to output file
				out.println(json);
				
			} //end of for
			
			 out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
			return false;
		}
		
		return true;
	}

	/**
	 * exportToXML
	 * 
	 * @param path
	 * @param list
	 * @throws JAXBException 
	 * @throws IOException
	 */
	public static boolean exportToXML(String path,ArrayList<PeriodicElement> list){
				
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
		
			JAXBContext contextObj = JAXBContext.newInstance(PeriodicElementList.class);
			
			Marshaller marshallerObj = contextObj.createMarshaller();  
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			PeriodicElementList pel =new PeriodicElementList();
			pel.setList(list);
			
			marshallerObj.marshal(pel,out);
	
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
			return false;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
			return false;
		}
		
		return true;
	}		
	
	public static void main(String[] args) {	
		
		//i. Parse the CSV file in Java
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
		}

		//ii. Log the resulting Java objects at INFO level.
		ArrayList<PeriodicElement> list = Provider.logPeriodicTable(sb);
        
		//iii. Export those Java Objects in a JSON file, under src/main/resources
		try {
			exportToJson(PropertiesUtils.getInstance().getJsonOutputFile(), list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
		}
			
		//iv. Export those Java Objects in a XML file, under src/main/resources
		try {
			exportToXML(PropertiesUtils.getInstance().getXmlOutputFile(), list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(ExceptionUtils.getRootCauseMessage(e.getCause()), e);
		}
		
		//v. Provide Unit Tests for the created functions.

		//4. Upload the resulting code to a github repository.
		//https://github.com/BinyaminPyanin/bipyanin_PeriodicElements
		
		
    }
	
}
