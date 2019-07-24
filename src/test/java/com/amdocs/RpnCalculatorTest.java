package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RpnCalculatorTest {
	
	@Test
	public void addition() {
		RpnCalculator calculator= new RpnCalculator();
		double actual= calculator.solve("3 3 +");
		double expected= 6.0;
		assertEquals(expected, actual, 0.001);
	}
	@Test
	public void subtraction() {
		RpnCalculator calculator= new RpnCalculator();
		double actual= calculator.solve("6 3 -");
		double expected= 3.0;
		assertEquals(expected, actual, 0.001);
	}
	@Test
	public void multiplication() {
		RpnCalculator calculator= new RpnCalculator();
		double actual= calculator.solve("3 3 *");
		double expected= 9.0;
		assertEquals(expected, actual, 0.001);
	}
	@Test
	public void division() {
		RpnCalculator calculator= new RpnCalculator();
		double actual= calculator.solve("9 3 /");
		double expected= 3.0;
		assertEquals(expected, actual, 0.001);
	}
	@Test
	public void complexexpression() {
		RpnCalculator calculator= new RpnCalculator();
		double actual= calculator.solve("3 2 + 9 6 - 14 7 / + -");
		double expected= 0;
		assertEquals(expected, actual, 0.001);
	}
	
}
