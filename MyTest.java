package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest {

	@Test

	public void main() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		System.out.println("Testing started");

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kameshkandikuppa@gmail.com");

		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ViratKohli@18");

		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		System.out.println("Successfully logged to Amazon");

		// Adding Mobile

		System.out.println("Searching for Iphone");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));

		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();

		System.out.println("Iphone Added to the cart");

		Thread.sleep(6000);

		driver.navigate().back();

		// Lap

		System.out.println("Searching for the Dell Laptops");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptops", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));

		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();

		System.out.println("Dell laptop added to cart");

		Thread.sleep(6000);

		driver.navigate().back();

		driver.findElement(By.id("twotabsearchtextbox")).clear();

		// Blutooth

		System.out.println("Searching for the bluetooth");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bluetooth", Keys.ENTER);

		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));

		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();

		System.out.println("Blutooth Added To Cart");

		Thread.sleep(6000);

		driver.navigate().back();

		driver.findElement(By.id("twotabsearchtextbox")).clear();

		// remove the product from the cart

		System.out.println("Entering to the Cart section to remove");

		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();

		driver.findElement(By.xpath("//input[@value='Delete']")).click();

		Thread.sleep(6000);

		System.out.println("Item Removed Successfully");

		// Buy products

		System.out.println("Going to buy the product");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.amazon.in/gp/product/B0CJ8Y7GL5/ref=ox_sc_act_title_2?smid=A14CZOWI0VEHLG&psc=1");

		driver.findElement(By.id("//input[@id='buy-now-button']")).click();

		driver.findElement(By.id("buyNow")).click();

		driver.findElement(By.className("submit.buy-now"));

		driver.findElement(By.xpath("input[@aria-labelledby='submit.buy-now-announce']")).click();

		driver.findElement(By.xpath("submit.buy-now-announce")).click();

		System.out.println("Select payment method");

		// Use this payment
		driver.findElement(By.xpath("input[@aria-label='pp-oeiQ3m-135-announce']")).click();

		// place u r order
		System.out.println("place your order");
	}
}