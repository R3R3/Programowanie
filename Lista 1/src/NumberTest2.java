import static org.junit.Assert.*;

import org.junit.*;
/**
 * @author Remek
 *
 */
public class NumberTest2 {
	private Number num = null;
	
	@Before
	public void setUp(){
		num = new Number(12);
	}
	@After
	public void cleanUp(){
		num = null;
	}
	
	@Test
	public void testoBase16() {
		assertTrue(num.toBase(16).equals("d"));
	}
	
	@Ignore("Not implemented")
	@Test
	public void whatevertest(){
		num.whatever();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNegative(){
		num.toBase(-2);
	}
	
	@Test(timeout=1000)
	public void timeout(){
		while(true){}
	}
	
}
