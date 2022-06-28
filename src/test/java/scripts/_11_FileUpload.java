package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waiter;

public class _11_FileUpload extends Base{

    /*

     */

    @Test(priority = 1, description = "File upload")
    public void testFileUpload1(){
        driver.get("http://the-internet.herokuapp.com/");
        Waiter.pause(2);
        heroAppPage.clickOnLink("File Upload");
        Waiter.pause(2);
        heroAppPage.chooseFileInputBox.sendKeys("/Users/deniztaskin/IdeaProjects/testng_framework/myFileHellow.txt");
        Waiter.pause(10);

        heroAppPage.uploadFileButton.click();

        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(),"File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(),"myFileHellow.txt");

    }

  /*
    Go to http://the-internet.herokuapp.com/
    Click on “File Download” link
    Click on “myFileTech2.xls” link
    Validate “myFileTech2.xls” file is downloaded in your “Downloads” folder
     */

    @Test(priority = 2, description = "File download")
    public void testFileDownload(){
        driver.get("http://the-internet.herokuapp.com/");

        heroAppPage.clickOnLink("File Download");

        heroAppPage.downloadFileLink.click();
        Waiter.pause(2);
    }
}
