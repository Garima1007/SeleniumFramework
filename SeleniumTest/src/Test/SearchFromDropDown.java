package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFromDropDown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/garimasharma/Downloads/chromedriver99");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--kiosk");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://youtube.com/");
		driver.manage().window().maximize();
		
		WebElement suggestion = driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]"));
		suggestion.sendKeys(("automation step by step"));
		suggestion.click();
		
		//WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("automation step by step")));
		//driver.findElement(By.name("automation step by step")).click();
	}

}
