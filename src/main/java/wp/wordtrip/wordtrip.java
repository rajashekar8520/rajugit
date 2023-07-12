package wp.wordtrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class wordtrip {

	@Test
		public static void main(String[] args) {

		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();

		    driver.get("https://ikman.lk");
		    driver.close();
		}
		}
	

