package test.java;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.PeriodicElement;
import main.java.PropertiesUtils;
import main.java.Provider;


public class TestExportToJsonFunction {

	/**
	 * Negative test
	 */
	@Test
	public void testNeg_1() {		
		StringBuffer sb = null;
		boolean result = false;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());			
			ArrayList<PeriodicElement> list = Provider.logPeriodicTable(sb);	        			
			result=Provider.exportToJson(PropertiesUtils.getInstance().getJsonOutputFile(), list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		Assert.assertEquals(false, result);
	}
	
	/**
	 * Positive test
	 */
	@Test
	public void testPos_1() {		
		StringBuffer sb = null;
		boolean result = false;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());			
			ArrayList<PeriodicElement> list = Provider.logPeriodicTable(sb);	        			
			result=Provider.exportToJson(PropertiesUtils.getInstance().getJsonOutputFile(), list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		Assert.assertEquals(true, result);
	}
	

}
