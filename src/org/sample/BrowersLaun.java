package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowersLaun {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\sep1409\\BrowserLaunch\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("vishnupriya");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("23456");
	
	
		}
}
