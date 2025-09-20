package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenStudentFormTests {
public WebDriver driver;
@BeforeMethod
public void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/automation-practice-form");
	
	
}
@DataProvider(name="studentData")
public Object[][] getStudentData() {
    return new Object[][] {
        {"Shiv","Gupta","shivgupta@gmail.com", 1, "9936395876", "123 Main St, Mirzapur, UP"},
        {"John","Doe","john.doe@example.com", 2, "1234567890","456 Elm St, Springfield, IL"},
        {"Jane","Smith","jane.smith@test.com", 1, "9876543210","789 Oak St, Metropolis, NY"}
        };
        
}
@Test(dataProvider="studentData")
public void testFormSubmission(String firstName, String lastName, String email, int genderIndex, String mobileNumber, String address) {
    // Fill out the form fields using the provided data
    driver.findElement(By.id("firstName")).sendKeys(firstName);
    driver.findElement(By.id("lastName")).sendKeys(lastName);
    driver.findElement(By.id("userEmail")).sendKeys(email);
    //MobileNumber
    driver.findElement(By.id("userNumber")).sendKeys(mobileNumber);
    //current Address
    driver.findElement(By.id("currentAddress")).sendKeys(address);
    //submit button
    WebElement submitButton = driver.findElement(By.id("submit"));
    submitButton.click();
    // Assertion Validation
    WebElement ModelTitle = driver.findElement(By.id("example-modal-sizes-title-v2"));
    String actualModalTitle = ModelTitle.getText();
    // Assert.assertEquals()
    Assert.assertEquals(actualModalTitle, "Thanks for submitting the form");
}
@AfterMethod
public void tearDown() {
	if (driver != null) {
		driver.quit();
	}
}
    }
