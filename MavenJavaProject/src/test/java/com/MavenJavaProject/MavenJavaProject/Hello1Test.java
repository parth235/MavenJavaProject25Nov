package com.MavenJavaProject.MavenJavaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello1Test {
  @Test
  public void f() {
	  System.out.println("Hello I m in TestNG1");
 
 System.setProperty("webdriver.chrome.driver","C:\\Browers\\chromedriver.exe");
 WebDriver dri=new ChromeDriver();
 dri.get("https://www.google.com");
 dri.manage().window().maximize();
  }
}
