import static org.junit.Assert.*;

import org.junit.Test;

public class Testexample1 {

	@Test
	public void testsayHello() { //name it as TestClassname / ClassnameTest (same class name)
		//1. write code to run function
		example1 e = new example1();
		String actualOutput = e.sayHello();
		//2. test if expected o/p = actual o/p
		//pick any JUnit function
		
		assertEquals("Hello!!", actualOutput); //assertEquals("expected o/p", actual o/p)
	}
	@Test
	public void testcalcTax(){
		example1 e = new example1();
		
		assertEquals(125f, e.calcTax(100.0, "CAD"),0);
	}

}
