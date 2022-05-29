package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookNewAccountPage {
    public FacebookNewAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[@name=\"firstname\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name=\"lastname\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name=\"reg_email__\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@name=\"reg_email_confirmation__\"]")
    public WebElement hiddenEmail;

    @FindBy(xpath = "//*[@name=\"reg_passwd__\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@name=\"websubmit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"reg_error_inner\"]")
    public WebElement errorMessage;

}
