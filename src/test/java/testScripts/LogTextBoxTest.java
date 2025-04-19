package testScripts;

import base.Capabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LogTextBox;

import java.io.IOException;

public class LogTextBoxTest extends Capabilities {
   // private static final Logger log = LoggerFactory.getLogger(LogTextBoxTest.class);
    LogTextBox logbox;
    SoftAssert asserts;


public LogTextBoxTest() throws IOException {
    logbox=new LogTextBox(driver);
    asserts=new SoftAssert();

}
@Test(priority = 1)
public void verifyTextNavigation() throws IOException {
    logbox=new LogTextBox(driver);
logbox.navigateToTextTTab();
logbox.navigateTologTextTab();
logbox.navigateToAddButton();
}
@Test(priority = 2)
    public void verifyAndCheckTextContains() throws IOException {
    logbox = new LogTextBox(driver);
    boolean isTextClick = logbox.verifyTextFieldContains();
    asserts.assertTrue(isTextClick, "The test is fail: Unable to get Text ");

}
    @AfterClass
    public void catchAssertion(){
        asserts.assertAll();
    }

    }






