package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

public class _01_AppleTest extends Base {
    // WE EXTEND THE CLASS TO PARENT WHICH HAS BEFORE AND AFTER METHODS SO WE DONT NEED THOSE HERE
    //Declare your driver
//    WebDriver driver;
    // 1. Initial set up - before each test
//    @BeforeMethod
//    public void setup(){
//        driver = Driver.getDriver();
//    }

    // 2. Validation of test - test
    @Test
    public void testAppleTitle(){
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // requirement
        String actualTitle = driver.getTitle(); // development

        if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
        else System.out.println("Apple title validation failed");
    }

    @Test
    public void testAppleURL(){
        driver.get("https://www.apple.com/");

        String expectedURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL);
    }
    @Test
    public void X(){

        //fail() method is used to fail a test on purpose
        Assert.fail("Failure on purpose");
    }

    // 3. Teardown actions - after each test
//    @AfterMethod
//    public void teardown(){
//        Driver.quitDriver();
//    }

    // WE USED TO DO THIS WAY
    /*
    public static void main(String[] args) {
        // 1. Initial set up - before each test
        WebDriver driver = Driver.getDriver();

        // 2. Validation of test - test
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // requirement
        String actualTitle = driver.getTitle(); // development

        if(actualTitle.equals(expectedTitle)) System.out.println("Apple title validation passed");
        else System.out.println("Apple title validation failed");

        // 3. Teardown actions - after each test
        Driver.quitDriver();
    }
     */
}
