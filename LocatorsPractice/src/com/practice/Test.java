package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		/*
		 * WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		 * element.sendKeys("Boost"); Thread.sleep(5000); element.clear();
		 */

		WebElement e1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		e1.sendKeys("dress");
		Thread.sleep(5000);
		e1.clear();

		List<WebElement> we = driver.findElements(By.tagName("a"));

		for (WebElement webElement : we) {
			String str = webElement.getText();
			if (!str.isEmpty()) {
				System.out.println(str);
			}
		}

	}

}
