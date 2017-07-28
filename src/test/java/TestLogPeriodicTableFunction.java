package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.PropertiesUtils;
import main.java.Provider;


public class TestLogPeriodicTableFunction {

	/**
	 * Negative
	 */
	@Test
	public void testPos_1() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());
			Provider.logPeriodicTable(sb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		Assert.assertEquals(null, sb);
	}

	@Test(expected = NullPointerException.class)
	public void testPos_2() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());
			Provider.logPeriodicTable(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}		
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testNeg_1() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());
			Provider.logPeriodicTable(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}		
	}
}
