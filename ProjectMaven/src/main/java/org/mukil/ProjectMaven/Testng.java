package org.mukil.ProjectMaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	@BeforeClass 
	public void launchBrowser() {
	System.out.println("launch");
	}
	@AfterClass
	public void closeBrowser() {
	System.out.println("close");
	}
	@BeforeMethod
	public void startTime() {
	System.out.println("start");
	}
	@AfterMethod
	public void endTime() {
	System.out.println("end");
	}
	@Test
	public void test1() {
	System.out.println("test1");
	}
	@Test
	public void test2() {
	System.out.println("test2");
	}
	}

