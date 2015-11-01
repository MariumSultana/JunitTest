package com.JunitF.JunitTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitpageobject {

	WebDriver dr;
	@Before
	public void start(){
		dr = new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("execution statred");
	}
	
	@Test
	public void TestFacebook(){
	
		
		dr.get("https://www.facebook.com");
		String text = dr.findElement(By.xpath("//h2")).getText();
		System.out.println("the text is "+ text );
		System.out.println("relese 2 for team 2 pageobject");
	}
	
	@After
	public void end(){
		dr.quit();
		System.out.println("execution ended");
	}
}
