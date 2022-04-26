package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.monsterindia.com/seeker/registration");
		System.out.println("monster india website opens");
		 WebElement element = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//WebElement element=driver.findElement(By.linkText("Choose CV"));
		element.sendKeys("E:\\Resume-fresher Manual testing\\Achyut_Puri.pdf");
		System.out.println("file uploaded successully");

	}

}
