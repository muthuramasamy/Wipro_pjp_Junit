//calculator.java
package testsuite_sample_calc;

public class calculator {

	public int add(int a , int b) {
		return a+b;
	}
	public int sub(int a , int b)
	{
		return a-b;
	}

}

//clculatortest.java

package testsuite_sample_calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculator_test {

	@Test
	public void testadd(int a,int b) {
		calculator c = new calculator();
		assertEquals(10,c.add(5, 5));
		assertEquals(25,c.add(20, 5));
	}
	public void testsub(int a ,int b)
	{
		calculator c = new calculator();
		assertEquals(0,c.sub(5, 5));
		assertEquals(15,c.sub(20, 5));
	}

}

//TESTSUITE:Alltests.java
package testsuite_sample_calc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ calculator_test.class })
public class AllTests {

}

