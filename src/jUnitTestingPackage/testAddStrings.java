package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit=new jUnitFunction();
		String result=junit.addStrings("Dollar", "Rupee");
		assertEquals("DollarRupee",result);
	}

}
