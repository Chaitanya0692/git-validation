package GitHubLoginValid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLoginWithValidUnameAndPwd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://Test Software//CD//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"login_field\"]")).sendKeys("Chaitanya0692");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Chaitanya@0692");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		
		WebElement el1=driver.findElement(By.xpath("(//span[@class=\"flex-shrink-0 css-truncate css-truncate-target\"])[1]"));
		if(el1.isDisplayed())
		{
			System.out.println("login succesful");
		}
		else
		{
			System.out.println("login fail");
		}

		driver.close();
		

	}

}
