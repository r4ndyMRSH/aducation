package com.r4ndy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SandboxProjectTest {

	@Test
	void twoPlusTwoShouldEqualFour() {
		assertEquals(4, SandboxProject.adder(2, 2));
		assertTrue(SandboxProject.adder(2, 2) == 4);
	}

}
