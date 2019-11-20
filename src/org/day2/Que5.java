package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {
	public static void main(String[] args) throws Throwable  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://netbanking.hdfcbank.com/");
	WebElement txt = d.findElement(By.xpath("//[@onkeypress='return fSubmit(event);']"));
	Thread.sleep(2000);
	txt.sendKeys("12355777");
}
}