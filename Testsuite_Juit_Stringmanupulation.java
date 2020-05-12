//stringmanupulation.java
package testsuite_sample_calc;

public class stringmanupaltion {
	String datum;
	public stringmanupaltion(String datum) {
		this.datum=datum;
	}
	public String stringUppercase()
	{
		return datum.toUpperCase();
	}

}



//Stringmanupution_test.java
mport static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class StringmanipTest {
    private String datum;
    private String expected;

    public StringmanipTest(String datum, String expected) {
        this.datum = datum;
        this.expected = expected;
    }


    @Parameters
    public static Collection<Object[]> generateData() {
        Object[][] data = new Object[][] {
            {"Smita", "SMITA"},
            {"smita", "SMITA"},
            {"SMitA", "SMITA"},
            {"SmitA", "SMITA"}
        };

        return Arrays.asList(data);
    }

    @Test
    public void testUpperCase() {
        Stringmanip s = new Stringmanip(this.datum);
        String actualResult = s.upperCase();
        assertEquals(actualResult, this.expected);
    }

}


//TEstSUITE:alltests.java

package testsuite_sample_calc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({stringmanupulation_test.class })
public class AllTests {

}
