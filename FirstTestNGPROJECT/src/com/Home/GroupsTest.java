package com.Home;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest {
	@Test
	public void  addition(int a, int b, int result) {
		int sum = a+b;
		Assert.assertEquals(sum, result);
		
	}
	

}
