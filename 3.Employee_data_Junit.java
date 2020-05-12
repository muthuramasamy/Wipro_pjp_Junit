//employee.java
package emp_details;
import java.util.*;
public class employee {

	public String findName (ArrayList<String> empl ,String Name) {
		String result = " ";
		if(empl.contains(Name))
		{
			result="FOUND";
		}
		else
		{
			result= "NOT FOUND";
		}
		
		return result;
		
	}

}

//employeetest.java
package emp_details;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class employeetest {
	
	employee e = new employee();
	ArrayList<String> li = new ArrayList<String>();
	{
		li.add("Muthu");
		li.add("Brutus");
		li.add("sundaram");
	}

	@Test
	public void test() {
		System.out.println("The list is");
		assertEquals("FOUND",e.findName(li,"sundaram"));
		System.out.println("tested");
	}

}
