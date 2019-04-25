package org.mukil.ProjectMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcutableClass extends BaseClass {
public static void main(String[] args) throws IOException, AWTException {
Browser("http://demo.automationtesting.in/Register.html");
WebElement web = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
type(web, getdata(0,1));
type(driver.findElement(By.xpath("(//input[@type='text'])[2]")), getdata(1, 1));
type(driver.findElement(By.xpath("//textarea[@ng-model='Adress']")), getdata(2, 1));
type(driver.findElement(By.xpath("//input[@type='email']")), getdata(3, 1));
type(driver.findElement(By.xpath("//input[@type='tel']")), getdata(4, 1));
//driver.findElement(By.xpath("//input[@value='Male']")).click();
clickbtn(driver.findElement(By.xpath("//input[@value='Male']")));
driver.findElement(By.xpath("//input[@value='Cricket']")).click();
dropDown (driver.findElement(By.xpath("//select[@id='Skills']")),getdata(13, 1));
dropDown (driver.findElement(By.xpath("(//select[@type='text'])[2]")),getdata(14, 1));
driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
type (driver.findElement(By.xpath("//input[@class='select2-search__field']")),getdata(19, 1));
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
dropDown ( driver.findElement(By.xpath("//select[@id='yearbox']")),getdata(15, 1));
dropDown (driver.findElement(By.xpath("(//select[@type='text'])[4]")),getdata(16, 1));
dropDown (driver.findElement(By.xpath("//select[@id='daybox']")),getdata(17, 1));
type(driver.findElement(By.xpath("(//input[@type='password'])[1]")),getdata(11, 1));
type(driver.findElement(By.xpath("(//input[@type='password'])[2]")),getdata(12, 1));
driver.findElement(By.id("msdd")).click();
driver.findElement(By.xpath("//a[text()='Arabic']")).click();
WebElement click = driver.findElement(By.id("submitbtn"));
click.click();

}}


