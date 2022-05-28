package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _02_TechGlobalTest extends Base {
    /*
    1. Go to "https://www.techglobalschool.com/apply-now"
    2. Validate the heading1 is displayed and the text for it is ="Application Form"
     */
//    WebDriver driver;

    // WE EXTEND THE CLASS TO PARENT WHICH HAS BEFORE AND AFTER METHODS SO WE DONT NEED THOSE HERE
    //1. Set up
//    @BeforeMethod
//    public void setup(){
//        driver = Driver.getDriver();
//    }

    //2. Validate test
    @Test(description = "TC123: Validate Application form Heading") // this is scenario
    public void testApplicationFormHeading(){
        driver.get("https://www.techglobalschool.com/apply-now");

        // WE NO LONGER NEED THIS CODE BELOW BC WE USE tgApplicationBase object
//        WebElement heading = driver.findElement(By.xpath("//div[@id='comp-kh9s3kyz3']//span/span")); // OR //span[text()='Application Form']

//        String actualHeading = heading.getText();
//        String expectedHeading = "Application Form";

        Assert.assertTrue(tgApplicationPage.heading.isDisplayed());
        Assert.assertEquals(tgApplicationPage.heading.getText(), "Application Form");
    }


    //3. Teardown
//
//    @AfterMethod
//    public void teardown(){
//        Driver.quitDriver();
//    }
}
