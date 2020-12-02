package Ekart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Evkart {
	
	WebDriver driver;
	 @BeforeTest
	 public void Setup()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 @Test
	 public void incerementitem1()
	 {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[2]/a[2]")).click();
	 }
	 @Test
	 public void addtocart1()
	 {
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
	 }
	 
	 @Test
	 public void incerementitem2()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
	 }
	 
	 @Test
	 public void addtocart2()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[3]/button")).click();
	 }
	 
	 @Test
	 public void incerementitem3()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[2]/a[2]")).click();
	 }
	 
	 @Test
	 public void addtocart3()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[3]/button")).click();
	 }
	 
	 @Test
	 public void incerementitem4()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[2]/a[2]")).click();
	 }
	 
	 @Test
	 public void addtocart4()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[3]/button")).click();
	 }
	 
	 
	 @Test
	 public void incerementitem5()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[5]/div[2]/a[2]")).click();
	 }
	 
	 
	 
	 
	 @Test
	 public void addtocart5()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[5]/div[3]/button")).click();
	 }
	 
	 
	 
	 @Test
	 public void incerementitem6()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[6]/div[2]/a[2]")).click();
	 }
	 	 
	 @Test
	 public void addtocart6()
	 
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[6]/div[3]/button")).click();
	 }
	 
	 @Test
	 public void cartlog()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();
	 }
	 @Test
	 public void deletitem1()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[7]/a")).click();
	 }
	 @Test
	 public void checkout()
	 {
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
	 }
	 @Test
	 public void placeorder()
	 {
		 driver.findElement(By.xpath("/html/body/div/div/div/div/div/button")).click();
	 }
}
