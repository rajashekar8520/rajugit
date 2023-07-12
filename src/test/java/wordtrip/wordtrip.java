package wordtrip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class wordtrip {

	public class MyTest {
	    @Test
	    public void myTestMethod() {
	    	
	    	
	    	  WebDriverManager.chromedriver().setup();

	          // Create a new instance of the Chrome driver
	          WebDriver driver = new ChromeDriver();
	          
	       // Create a file to write the console output
	          File outputFile = new File("output.txt");

	          
	          int level = 7;
	          while (level <= 30) {
	              String url = "https://www.slantsixgames.com/word-trip-level-" + level + "/";

	              driver.get(url);

					 WebElement listElement1 = driver.findElement(By.xpath("(//ul)[2]"));
				  //      String displayedText = textElement.getText();


	              // Print the text for the current level
	              System.out.println("Level " + level + " text: " + listElement1.getText());
	              System.out.println("-------------------------------------------------------------------------------");

	              // Increment the level
	              level++;
	          }
	         

	          // Close the browser
	          driver.quit();
	      }
	  }
	    
	}


