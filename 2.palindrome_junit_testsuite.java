//palindrome.java

package palind;

public class palindrome {

	public boolean palindrome(String a) {
		String b = new StringBuffer(a).reverse().toString();
		if(a.equals(b))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}

//palindrometest.java
package palind;

import static org.junit.Assert.*;

import org.junit.Test;

public class palindrometest {

	@Test
	public void test() {
		palindrome pm = new palindrome();
		String a="MADAM";
		String b="HELLO";
		assertTrue(pm.palindrome(a));
		assertFalse(pm.palindrome(b));
	}

}

//alltest.java//TESTSUITE:
package palind;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ palindrometest.class })
public class AllTests {

}
