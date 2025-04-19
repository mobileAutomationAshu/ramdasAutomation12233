package testScripts;

import base.Capabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RadioGroup;

import java.io.IOException;

public class RadioGroupTest extends Capabilities {

    RadioGroup radioGp;
    SoftAssert soft;

    public RadioGroupTest() throws IOException {
        radioGp = new RadioGroup(driver);
        soft = new SoftAssert();

    }

    @Test(priority = 1)
    public void verifyRadioGroupNavigation() throws IOException {
        radioGp = new RadioGroup(driver);
        radioGp.navigateToViewTextTab();
        radioGp.navigateToGroupTab();
        radioGp.navigateToSnackBtn();
        radioGp.navigateToClearBtn();
        ;
    }

    @Test
    public void checkAndVerifySnackRadioBtn() throws IOException {

        radioGp = new RadioGroup(driver);
        // boolean isDisSnackBtn=radioGp.isdisplayedSnackBtn();
        Assert.assertTrue(radioGp.isdisplayedSnackBtn(), "The test is failed : Unable click on Radio button");
        Assert.assertTrue(radioGp.isEnableBtn(), "button is not unable");
    }

    @Test(priority = 3)
    public void checkAndVerifyUnslectBtn() throws IOException {
        radioGp = new RadioGroup(driver);

        boolean isUnSelect = radioGp.isAllRadioBtnUnselect();
        Assert.assertTrue(isUnSelect, "The test is failed:: butttons are selected");


    }

/*
    @Test(priority = 4)
    public void CheckAllElemr() throws IOException {
        radioGp = new RadioGroup(driver);

        boolean cheE = radioGp.ChecksElements();
        System.out.println(cheE);

    }
*/

    @AfterClass
    public void AllSoftAsser() {
        soft.assertAll();

    }


}
