package com.MavenSpareAdditional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Demo extends BaseClass{

	public static void main(String[]args) {
		browserLaunch("Chrome");
		urlLaunch("https://www.google.com/");
		jsSendkeys("Hi", driver.findElement(By.xpath("//textarea[@type='search']")));	
		//inputValues(driver.findElement(By.xpath("//textarea[@type='search']")),"hi");

	}

}
