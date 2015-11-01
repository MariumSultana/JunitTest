package com.JunitF.JunitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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

	String text = dr.findElement(By.xpath("//form[@id='search-form']/fieldset/div[1]/div/strong")).getText();
		System.out.println("get title"+text);

		dr.findElement(By.id("search-field-keyword")).sendKeys("automation engineer");

 System.out.println("new release to");

		System.out.println("relese 2 for team 2 junitframelog");
		

	}
	
	@After
	public void end(){
		dr.quit();
		System.out.println("execution ended");
	}
}
