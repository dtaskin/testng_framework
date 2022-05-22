package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_EtsyTest extends Base{

//    WebDriver driver;
     // WE EXTEND THE CLASS TO PARENT WHICH HAS BEFORE AND AFTER METHODS SO WE DONT NEED THOSE HERE
//    @BeforeMethod
//    public void setup() {
//        driver = Driver.getDriver();
//    }

    /*
   1. Go to https://www.etsy.com/
   2. Validate Etsy logo is displayed

   testEtsyLogo
    */
    @Test
        public void testEtsyLogo(){
        driver.get("https://www.etsy.com/");

        WebElement logo = driver.findElement(By.xpath("//span[@id='logo']")); // or By.id("logo");

        Assert.assertTrue(logo.isDisplayed());

    }
          /*
          1. Go to https://www.etsy.com/
          2. Validate Etsy search input box and search button is displayed

          testEtsySearch
           */
    @Test
    public void testEtsySearch(){
        driver.get("https://www.etsy.com/");

         WebElement searchInputBox = driver.findElement(By.id("global-enhancements-search-query"));
         WebElement searchButton = driver.findElement(By.xpath("//button[@data-id='gnav-search-submit-button']"));

         Assert.assertTrue(searchButton.isDisplayed());
         Assert.assertTrue(searchInputBox.isDisplayed());
    }


//    @AfterMethod
//    public void teardown(){
//        Driver.quitDriver();
//    }
}
