package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions jUnit=new jUnitFunctions();
		int Result=jUnit.add(10,20);
		assertEquals(30,Result);
	}

}
