package com.f2i.test;

import org.junit.Assert;
import org.junit.Test;

import com.f2i.Calculator;

public class CalculatorTest {

	Calculator c = new Calculator();
	
	@Test
	public void addTest() {
		Assert.assertEquals(5, c.add(2, 3));
	
	}
	
	@Test
	public void multiplyTest() {
		Assert.assertEquals(6, c.multiply(2, 3));
	
	}	
	
}