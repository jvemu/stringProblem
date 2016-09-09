package str.com;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReplaceCharOccuranceTest {

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
	public void testReplace() {
		
		System.out.println("in test Replace");
		c = new ReplaceCharOccurance("a","amy");
        rv =  c.replaceAllatOnce();
        assertEquals(c.nString,"my");
	} 

	@Test
public void testReplace2() {
		
		System.out.println("in test Replace2");
		c = new ReplaceCharOccurance("t","Scotty");
        rv =  c.replaceAllatOnce();
        assertEquals(c.nString,"Scoy");
	} 

	@Test
	public void testWithBlankForSouerceString() {
		System.out.println("in::Test With BlankForsource");
		c = new ReplaceCharOccurance("a","");
        rv =  c.replaceAllatOnce();
        assertFalse(rv);
	}
	@Test
	public void testWithNullValueForSourceString() {
		System.out.println("in::testWithNullValueForSourceString");
		String ts= null;
		c = new ReplaceCharOccurance("a",ts);
        rv =  c.replaceAllatOnce();
        assertFalse(rv);
	} 
	@Test
	public void testWithNullValueforStringtobeReplaced() {
		System.out.println("in:: testWithNullValueforStringtobeReplaced");
		String ts1 = null;
		c = new ReplaceCharOccurance(ts1 ,"a");
        rv =  c.replaceAllatOnce();
        assertFalse(rv);
	} 
	
}
