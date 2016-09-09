package str.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceCharOccuranceTest2 {

	boolean rv;
	ReplaceCharOccurance c;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("in setup");
		rv = false;
		c= null;
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("in tear down");
		rv = false;
		c= null;
	}

	
		@Test
		public void testWithValidSouerceString() {
			System.out.println("in testWithValidSouerceString");
			c = new ReplaceCharOccurance("m" ,"mom");
			rv =  c.replaceByIteration();
	        assertEquals(" o ", c.nString);
		} 
	
		@Test
	public void testForCaseSensitivity() {
		System.out.println("In::testForCaseSensitivity");
		c = new ReplaceCharOccurance("m" ,"MOM");
		rv =  c.replaceByIteration();
        assertEquals("MOM", c.nString);
	} 
		
		@Test
	public void testWithBlankSouerceString() {
		System.out.println("In::testWithBlankSourceString");
		c = new ReplaceCharOccurance("m" ,"");
		rv =  c.replaceByIteration();
        assertFalse(rv);
	}  
	
		
		@Test
		public void testWithNullValueForSourceString() {
			System.out.println("In::testWithNullValueForSourceString");
			String ts= null;
			c = new ReplaceCharOccurance("a",ts);
	        rv =  c.replaceByIteration();
	        assertFalse(rv);
		}  
		@Test
		public void testWithNullValueforStringtobeReplaced() {
			System.out.println("In::testWithNullValueforStringtobeReplaced");
			String ts1 = null;
			c = new ReplaceCharOccurance(ts1 ,"a");
	        rv =  c.replaceByIteration();
	        assertFalse(rv);
		}  



}
