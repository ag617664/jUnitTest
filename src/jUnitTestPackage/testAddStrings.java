package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitString=new jUnitFunctions();
		String result=junitString.add1("capstone", "project");
		assertEquals("capstoneprojec",result);
		
	}

}
