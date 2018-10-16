package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test
	public void SUM1() {
		System.out.println("SUM_1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a + b);

	}

	@Test
	public void SUB1() {
		System.out.println("SUB_1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b - a);

	}
}
