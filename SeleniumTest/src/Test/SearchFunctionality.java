package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchFunctionality {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/garimasharma/Downloads/chromedriver99");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--kiosk");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://youtube.com/");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Automation Step by Step");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	driver.quit();
	}
}
