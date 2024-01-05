package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.Registrationpage;

public class TC_RegisterPage_002 extends BaseClass{
	
	@Test(priority=1)
	public void test1()
	
	{
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority=2)
	public void test2()
	{
		Registrationpage rp=new Registrationpage(driver);
		rp.registerUser("sayooj","kv","sayukv12344@gmail.com");
		rp.userPassword("Test@1234","Test@1234" );
		rp.register();
		
	}
	@Test(priority=3)
	public void testUserVerify()
	{
		Registrationpage rp=new Registrationpage(driver);
		String actualUser=rp.user();
		System.out.println("actual username="+actualUser);
		String expectUser="sayukv12344@gmail.com";
		System.out.println("expected username is="+expectUser);
		Assert.assertEquals(actualUser, expectUser);
	}

}
