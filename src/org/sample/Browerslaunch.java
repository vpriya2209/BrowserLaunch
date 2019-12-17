package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browerslaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\sep1409\\BrowserLaunch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("vishnupriya");
		String s = txt.getAttribute("class");
		System.out.println(s);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("3456");
		String y = pass.getText();
		System.out.println(y);
				
	}

}
