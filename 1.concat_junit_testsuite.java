//demo1.java
package testing;

public class demo1 {
	public String concatenstr(String s1, String s2){
		String s3=s1+" "+s2;
		return s3;
	}

}

//concatstrtest.java
package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatstrtest {

	@Test
	public void test() {
		String s1 = "Muthu";
		String s2 = "TMS";
		demo1 d = new demo1();
		String s = d.concatenstr(s1, s2);
		assertEquals("Muthu TMS",s);
		
	}

}

//Alltest.java //TESTSUITE:
package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ concatstrtest.class })
public class AllTests {

}


