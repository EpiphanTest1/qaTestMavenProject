package com.epiphan.wui.test.qaTestMavenProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


//import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class OpenFireFox {
	
	public static WebDriver createFireFox(){
		
		System.out.print("Open FireFox Browser!!\n");
		 WebDriver driver = new FirefoxDriver();
		 //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
	
	

	

}
