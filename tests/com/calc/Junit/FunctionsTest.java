package com.calc.Junit;

import com.calc.Functions;

import junit.framework.TestCase;

public class FunctionsTest extends TestCase {

	Functions f = new Functions();

	public void testAdd() {
		int result= f.add(2, 3);
		assertEquals(5, result);
	}

	public void testSub() {
		int result = f.sub(3, 2);
		assertEquals(1, result);
	}

	public void testMultiply() {
		int result = f.multiply(2, 3);
		assertEquals(6, result);
	}

}
