package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	driver.findElement(By.xpath("//id[@for='Men - Fashion Bags']")).click();
	String tot = driver.findElement(By.className("length")).getText();
	System.out.println(tot);
	
	System.out.println("no of brand names");
	// = driver.findElement(By.className("brand"));
	
	}

}
