package GitHubLoginValid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLoginWithInvalidUnameAndPwd {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Test Software//CD//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.xpath("//input[@id=\"login_field\"]")).sendKeys("Chaitanya06963");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Chaitanya0692");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		WebElement el1=driver.findElement(By.xpath("//div[@class=\"flash flash-full flash-error\"]"));
		
		if(el1.isDisplayed()) {
			System.out.println("eroor msg displyed");
			
		}
		else 
		{
			System.out.println("error msg not displayed");
			
		}
		
		driver.quit();
		
		
		
		

	}

}
