package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int res = calc.add(2,3);
		assertEquals(5, res); 
	}

	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		int res = calc.sub(2,3);
		assertEquals(-1, res);
	}

	@Test
	public void testMult() {
		Calculator calc = new Calculator();
		int res = calc.mult(2,3);
		assertEquals(6, res);
	}

	@Test
	public void testMod() {
		Calculator calc = new Calculator();
		int res = calc.mod(6,3);
		assertEquals(0, res);
		
		res = calc.mod(8,3);
		assertEquals(2, res);
	}

	@Test
	public void testIsEven() {
		Calculator calc = new Calculator();
		boolean res = calc.isEven(4);
		assertTrue(res);
		
		res = calc.isEven(5);
		assertFalse(res);
	}

}
