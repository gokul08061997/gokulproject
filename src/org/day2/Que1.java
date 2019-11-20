package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Que1 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.facebook.com/ ");

	WebElement txtUserName = d.findElement(By.id("email"));
	txtUserName.sendKeys("JAVA");
	
	WebElement txtPassword = d.findElement(By.id("pass"));
	txtPassword.sendKeys("hello");
}
}