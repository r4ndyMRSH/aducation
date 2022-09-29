package com.r4ndy;

import org.junit.Assert;
import org.junit.Test;


public class SandboxProjectTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDistance() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,2);
//		assert SandboxProject.distance(p1, p2) == 2;
		Assert.assertEquals(SandboxProject.distance(p1, p2),2.0);
	}

}
