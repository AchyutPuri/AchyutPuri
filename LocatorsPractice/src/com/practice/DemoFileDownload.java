package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFileDownload {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("textbox"));
		element.sendKeys("hello sayali....how r u?");
		WebElement element2=driver.findElement(By.id("createTxt"));
		element2.click();
		
		WebElement element3=driver.findElement(By.id("link-to-download"));
		element3.click();
	}

}
