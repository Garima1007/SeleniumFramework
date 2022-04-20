package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumTest {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/garimasharma/Downloads/chromedriver99");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--kiosk");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://youtube.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
}
