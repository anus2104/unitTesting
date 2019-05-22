package org.f5.automation.poc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class calc {
	
	@Test
	public void TestAbsVal1()
	{
		calcCode obj = new calcCode();
		Assert.assertEquals(obj.absoluteVal(2), 2);
	}
	
	@Test
	public void TestAbsVal2()
	{
		calcCode obj = new calcCode();
		Assert.assertEquals(obj.absoluteVal(-2), 2);
		System.out.println("Testing!!!!");
	}
	
}
