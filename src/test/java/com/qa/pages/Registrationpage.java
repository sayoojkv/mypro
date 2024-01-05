package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Registrationpage extends BaseClass{
	
	
	public Registrationpage(WebDriver driver)//constructor
	{
		PageFactory.initElements(driver,this );
		
	}
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement registerButton;
	
	//@FindBy(xpath="gender-male")
	//WebElement radio;
	
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//*[@name='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='ConfirmPassword']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id='register-button']")
	WebElement confirmRegister;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	
	
	
	
	public void registerUser(String first,String last,String mail)
	{
		registerButton.click();
		//radio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		email.sendKeys(mail);
	}
	
	public void userPassword(String pass,String confirmpass)
	{
		password.sendKeys(pass);
		confirmpassword.sendKeys(confirmpass);
		
	}
	
	public void register()
	{
		confirmRegister.click();
	}
	
	public String user()
	{
		String acc=account.getText();
		return acc;
	}

}
