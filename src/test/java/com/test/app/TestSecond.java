package com.test.app;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSecond 
{

	@BeforeTest
	public void first()
	{
		System.out.println("This is before test of TestSecond");
	}
	@Test
	public void second()
	{
		System.out.println("this is test of TestSecond");
	}
	
	@Test
	public void newest()
	{
		System.out.println("Checking Jenkins schedule");
	}

}
