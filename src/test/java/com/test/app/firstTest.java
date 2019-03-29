package com.test.app;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTest 
{
@BeforeTest
public void testone()
{
	System.out.println("This is before test");
}
@Test
public void testtwo()
{
	System.out.println("this is test1");
}

}
