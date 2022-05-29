package scripts;

import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class Automation_Assignment extends Base{
    /*
    Go to https://www.facebook.com/
    Click on “Create New Account” link
    Enter below information and click on Sign Up button
    First name = John
    Last Name = Doe
    Email address = johndoe55555@gmail.com
    Password = abcd1234
    Birthday = April 1, 1990
    Gender = Male
    Validate below error message is displayed with expected text
    "Please choose a more secure password. It should be longer than
    6 characters, unique to you, and difficult for others to guess."

     */

    @Test(priority = 1, description = "TC123: Validate mero secure password error message")
    public void testFacebookCreateNewAccountPage(){
        driver.get("https://www.facebook.com/");
        Waiter.pause(2);

        faceBookPage.createNewAccountLink.click();
        Waiter.pause(2);


        facebookNewAccountPage.firstName.sendKeys("John");
        facebookNewAccountPage.lastName.sendKeys("Doe");
        facebookNewAccountPage.email.sendKeys("johndoe55555@gmail.com");
        Waiter.pause(2);
        facebookNewAccountPage.hiddenEmail.sendKeys("johndoe55555@gmail.com");
        facebookNewAccountPage.password.sendKeys("abcd1234");
        Select select = new Select(driver.findElement(By.id("month")));
        select.selectByValue("4");
        Select select1 = new Select(driver.findElement(By.id("day")));
        select1.selectByValue("1");
        Select select2 = new Select(driver.findElement(By.id("year")));
        select2.selectByValue("1990");
        faceBookPage.genderRadioButtons.get(1).click();
        facebookNewAccountPage.submitButton.click();
        Waiter.pause(5);
        Assert.assertEquals(facebookNewAccountPage.errorMessage.getText(),
                "Please choose a more secure password. It should be longer " +
                        "than 6 characters, unique to you, and difficult for others to guess.");




    }
}
