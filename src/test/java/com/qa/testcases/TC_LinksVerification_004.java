package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_LinksVerification_004 extends BaseClass{
	
	@Test
	public void test1()
	{
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test
	public void test2()
	{
		HomePage hp=new HomePage(driver);
		hp.verifyLinks();
		
		int expectLinks=96;
		System.out.println("expected links="+expectLinks);
		
		int actualLinks=hp.linksCount();
		System.out.println("actual links="+actualLinks);
		
		Assert.assertEquals(actualLinks, expectLinks);
	}
	
	@Test
	public void test3()
	{
		HomePage hp=new HomePage(driver);
		int display=hp.displayLinks();
		System.out.println("the display links count="+display);
	}

}
