package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver driver;
    WebDriverWait explicitWait;
    Wait fluentWait;
    SoftAssert softAssert;
    Actions actions;
    EtsySearchPage etsySearchPage;
    TGApplicationPage tgApplicationPage;
    GoogleSearchPage googleSearchPage;
    GoogleSearchResultPage googleSearchResultPage;
    HeroAppPage heroAppPage;
    FaceBookPage faceBookPage;
    ExpediaPage expediaPage;
    EbayPage ebayPage;
    RediffHomePage rediffHomePage;
    AmazonHomePage amazonHomePage;
    TGHomePage tgHomePage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        explicitWait = new WebDriverWait(driver, 30);
        fluentWait = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
        softAssert = new SoftAssert();
        actions = new Actions(driver);
        etsySearchPage = new EtsySearchPage(driver);
        tgApplicationPage = new TGApplicationPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchResultPage = new GoogleSearchResultPage(driver);
        heroAppPage = new HeroAppPage(driver);
        faceBookPage = new FaceBookPage(driver);
        expediaPage = new ExpediaPage(driver);
        ebayPage = new EbayPage(driver);
        rediffHomePage = new RediffHomePage(driver);
        amazonHomePage = new AmazonHomePage(driver);
        tgHomePage = new TGHomePage(driver);
    }

    @AfterMethod
    public void teardown(){
        softAssert.assertAll();
        Driver.quitDriver();
    }
}