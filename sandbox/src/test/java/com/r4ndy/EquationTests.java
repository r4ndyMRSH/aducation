package com.r4ndy;

import org.junit.Assert;
import org.junit.Test;

public class EquationTests {
	
	@Test
	public void test0() {
		Equation e = new Equation(1, 1, 1);
		Assert.assertEquals(e.getN(),0);
	}
	
	@Test
	public void test1() {
		Equation e = new Equation(1, 2, 1);
		Assert.assertEquals(e.getN(),1);
	}
	
	@Test
	public void test2() {
		Equation e = new Equation(1, 5, 6);
		Assert.assertEquals(e.getN(),2);
	}



}
