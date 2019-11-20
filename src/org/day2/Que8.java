package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que8 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(2000);
WebElement txtUserName = d.findElement(By.name("username"));

txtUserName.sendKeys("gokuljhfn");

WebElement txtPassword = d.findElement(By.xpath("//input[@aria-label='Password']"));
txtPassword.sendKeys("123");
}
}
