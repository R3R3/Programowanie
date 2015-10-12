import junit.framework.*;

public class NumberTest extends TestCase {

	Number Numb = null;
	
	public void setUp(){
		Numb = new Number(12);
	}
	public void testtoBase2() throws Exception{
		String Bin = Numb.toBase(2);
		assertEquals(Bin, "1100");
	}
	public void testHex() throws Exception{
		String Hex = Numb.toBase(16);
		assertFalse(Hex.contains("D"));
	}
	public void testOct() throws Exception{
		String Oct = Numb.toBase(8);
		assertTrue("b³¹d", Oct == "14");
	}
	public void testDec() throws Exception{
		assertEquals("Nie s¹ równe",Numb.toBase(10), "11");
	}
	public void testNumber() throws Exception{
		assertNotNull(Numb);
	}
	public void testNumber2() throws Exception {
		assertNull(Numb);
	}
	public void testNegative() throws Exception {
		try{
			Numb.toBase(-2);
			fail();
		}
		catch(IllegalArgumentException ex){
			assertNotNull (ex);
		}
	}
	public void testLargeBase() {
		try {
			Numb.toBase(42);
			fail();
		}
		catch(IllegalArgumentException ex) {}
	}
}
