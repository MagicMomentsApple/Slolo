package org.mukil.ProjectMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\3\\eclipse-workspace\\Nirai\\MavenPro\\driv\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.findElement(By.xpath("//div[@id='msdd']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[text()='Croatian']")).click();
		//driver.findElement(By.xpath("//input[@ng-model='Phone']")).click();
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}