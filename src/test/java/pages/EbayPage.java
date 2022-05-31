package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage {
    public EbayPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "_sacat")
    public WebElement allCategoriesDropdownMenuButton;

    @FindBy(id = "gh-btn")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[text()='Welcome to eBay Art']")
    public WebElement welcomeToEbayArtHeader;

    @FindBy(xpath = "//h2[text()='Find Prints, Paintings, Posters, and More.']")
    public WebElement findPrintsPaintingsPostersAndMoreHeader;



}
