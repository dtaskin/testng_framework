package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FaceBookPage {
    public FaceBookPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement createNewAccountLink;

    @FindBy(xpath = "//span[@class='_5k_3']/span/input")
    public List<WebElement> genderRadioButtons;



}
