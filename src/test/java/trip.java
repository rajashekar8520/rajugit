import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trip {
    @Test
    public void myTestMethod() {
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
     //   ChromeOptions options = new ChromeOptions();
     //   options.addArguments("--incognito");
        int level = 340;
        while (level <= 500) {
            String url = "https://www.slantsixgames.com/word-trip-level-" + level + "/";

            driver.get(url);

            WebElement listElement = driver.findElement(By.xpath("(//ul)[2]"));
            String displayedText = listElement.getText();

            // Print the text for the current level on the console
            System.out.println("Level " + level + " text: " + displayedText);
            System.out.println("-------------------------------------------------------------------------------");

            // Write the text to the file
            writeToFile("output.txt", "Level " + level + " text: " + displayedText);
            writeToFile("output.txt", "-------------------------------------------------------------------------------");

            // Increment the level
            level++;
        }

        // Close the browser
        driver.quit();
    }

    private void writeToFile(String filePath, String text) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
