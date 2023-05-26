import static org.junit.Assert.*;

public class CalculatorTest {

	//BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	//code executed before all test method

	//Before
	public void setUp() throws Exception {
	//code executed before each test method
	}
	
	//Test
	public final void testAdd() {
//		fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	//Test
	public final void testSubtract() {
		fail("Not yet implemented");
	}
	
	//After
	public void tearDown() throws Exception {
		//code executed after each test method
	}
	
	//AfterClass
	public static void tearDownAfterClass() throws Exception {
		//code executed after each test method
	}
}
