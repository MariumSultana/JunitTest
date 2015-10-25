package com.JunitF.JunitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitFramelog2 {

	WebDriver dr;
	@Before
	public void start(){
		System.out.println("execution statred");
	}
	
	@Test
	public void TestFacebook(){
		dr = new FirefoxDriver();
		dr.get("https://www.dice.com");
	}
	
	@After
	public void end(){
		dr.quit();
		System.out.println("execution ended");
	}
}
