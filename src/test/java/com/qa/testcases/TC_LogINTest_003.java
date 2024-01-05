package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.Loginpage;

public class TC_LogINTest_003 extends BaseClass{
	
	public Loginpage lp;
	@Test(priority=1)
	public void test1()
	{
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
		
	}
	
	@Test(priority=2)
	public void test2()
	{
		lp=new Loginpage(driver);
		lp.logInCredentials("sayukv12344@gmail.com","Test@1234");
		lp.logIn();
		
	}
	@Test(priority=3)
	public void test3()
	{
		lp=new Loginpage(driver);
		
		String actualUserId=lp.accountVerify();
		System.out.println("actual auser id="+actualUserId);
		String expectUserId="sayukv12344@gmail.com";
		System.out.println("expect user id="+expectUserId);
		
		Assert.assertEquals(actualUserId, expectUserId);
		
	}

}
