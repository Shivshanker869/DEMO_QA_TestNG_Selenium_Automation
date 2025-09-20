package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InteractionTests {
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void handleAlertsTest() {
        driver.get("https://demoqa.com/alerts");

        // Click button to open alert
        driver.findElement(By.id("confirmButton")).click();

        // Switch to alert and accept
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Verify message on page
        String message = driver.findElement(By.id("confirmResult")).getText();
        Assert.assertEquals(message, "You selected Ok");
    }

    @Test
    public void handleIFramesTest() {
        driver.get("https://demoqa.com/frames");

        // Switch to iFrame
        driver.switchTo().frame("frame1");

        // Get text from inside iframe
        String text = driver.findElement(By.tagName("h1")).getText();

        // Assert the text
        Assert.assertEquals(text, "This is a sample page");

        // Switch back to main content
        driver.switchTo().defaultContent();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
