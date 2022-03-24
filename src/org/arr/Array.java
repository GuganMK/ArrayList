package org.arr;

import java.util.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.function.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Array {
	public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\ArrayList\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/search?q=redmi%20mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("redmi mobiles",Keys.ENTER);
	String parent = driver.getWindowHandle();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	String text3 = driver.findElement(By.xpath("//div[@class='_4rR01T']")).getText();
	System.out.println(text3);
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	String text4 = driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Metallic Blue, 64 GB)']")).getText();
	System.out.println(text4);		
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
	String text5 = driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Carbon Black, 64 GB)']")).getText();
	System.out.println(text5);
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).click();
	
	
	Set<String> child = driver.getWindowHandles();
	for (String x:child) {
		if(!parent.equals(x)) {
	}
		driver.switchTo().window(x);
		
	}
	String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(text);
	
	WebElement w = driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
	w.click();
	w.sendKeys("609001");
	driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
	
	WebElement text1 = driver.findElement(By.xpath("//div[@class='_3XINqE']"));
	String text2 = text1.getText();
	System.out.println(text2);
	if (text2.equals("Usually delivered in3 days?")) {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File filetype = ts.getScreenshotAs(OutputType.FILE);
	File store = new File ("C:\\Users\\admin\\eclipse-workspace\\ArrayList\\Library\\Screenshot");
	FileUtils.copyFile(filetype, store);
	}
	else
		System.out.println("Invalid")
}
}			
		
	
		
	

	


