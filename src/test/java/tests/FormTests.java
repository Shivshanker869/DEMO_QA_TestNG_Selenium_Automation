package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTests {
  // declare Webdriver object
	public WebDriver driver;
	
	//Run before the test method
	@BeforeMethod
	public void setUp() {
		// initialize the WebDriver object
		driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		// set impleset wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// navigate to the form page
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	// Test Case
	@Test 
	public void testFormSubmission() {
        // Fill out the form fields
        driver.findElement(By.id("firstName")).sendKeys("Shiv");
        driver.findElement(By.id("lastName")).sendKeys("Gupta");
        driver.findElement(By.id("userEmail")).sendKeys("shiv.gupta@example.com");
        
        //driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
       // driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
        //Mobile Number
        driver.findElement(By.id("userNumber")).sendKeys("9936395876");
        driver.findElement(By.id("currentAddress")).sendKeys("123 Main St, Mirzapur, UP");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        // Add assertions here to verify successful form submission
        // For example, check for a success message or confirmation dialog
        WebElement ModelTitle = driver.findElement(By.id("example-modal-sizes-title-v2"));
        String actualModalTitle = ModelTitle.getText();
        // Assert.assertEquals()
        Assert.assertEquals(actualModalTitle, "Thanks for submitting the form");
       
        
        // Close the browser
      
}
	@AfterMethod
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}
	
}
