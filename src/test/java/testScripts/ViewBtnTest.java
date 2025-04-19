package testScripts;

import base.Capabilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ViewBtn;

import java.io.IOException;

public class ViewBtnTest extends Capabilities {
    ViewBtn view;
    SoftAssert asserts;

    public ViewBtnTest() throws IOException {
        view =new ViewBtn(driver);
        asserts=new SoftAssert();
    }
    @Test(priority = 0)
    public  void verifyNavigation() throws IOException {
        view =new ViewBtn(driver);
        view.navigateToViewsTab();
        view.navigateToButtonsTab();
    }
    @Test(priority = 1)
    public void VerifyClickAndCheckToggleButtonOn() throws IOException {
        view =new ViewBtn(driver);
        boolean isBtnOn = view.clickAndCheckToggleButtonOn();
        asserts.assertTrue(isBtnOn,"The test fail since the button is off");

    }
    @Test(priority = 2)
    public void VerifyClickAndCheckToggleButtonOff() throws IOException {
        view =new ViewBtn(driver);
        boolean isBtnOff = view.clickAndCheckToggleButtonOff();
        asserts.assertTrue(isBtnOff,"The test fail since the button is On");

    }

    @AfterClass
    public void catchAssertion(){
        asserts.assertAll();
    }

}
