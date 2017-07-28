package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.PropertiesUtils;
import main.java.Provider;


public class TestParseCsvFileFunction {

	/**
	 * Negative
	 */
	@Test
	public void testNeg_1() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		Assert.assertEquals(null, sb);
	}

	@Test
	public void testNeg_2() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		Assert.assertEquals(null, sb);
	}

	
	@Test
	public void testPos_1() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(PropertiesUtils.getInstance().getCsvFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		Assert.assertNotEquals(null, sb);
	}
	
	@Test(expected = NullPointerException.class)
	public void testPos_2() {		
		StringBuffer sb = null;
		try {
			sb = Provider.parseCsvFile(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}		
	}
}
