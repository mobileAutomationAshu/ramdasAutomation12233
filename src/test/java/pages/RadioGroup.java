package pages;

import base.CommonActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadDataFromNotePad;

import java.io.IOException;
import java.util.List;

public class RadioGroup {
    AndroidDriver driver;
    CommonActions actions;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    private WebElement viewTextTab;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Radio Group\"]")
    private WebElement groupBtnTab;
    @FindBy (xpath = "//android.widget.RadioButton[@resource-id=\"io.appium.android.apis:id/snack\"]")
    private WebElement snackBtn;

    @FindBy (xpath = "//android.widget.Button[@content-desc=\"Clear\"]")
    private WebElement clearBtn;

@FindBy(xpath = "//android.widget.RadioGroup[@resource-id=\"io.appium.android.apis:id/menu\"]//child::android.widget.RadioButton")
private List<WebElement> list;

//@FindBy(xpath = "//android.widget.RadioGroup[@resource-id=\"io.appium.android.apis:id/menu\"]//child::android.widget.RadioButton")
//private List<WebElement> cllist;

public RadioGroup(AndroidDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        actions = new CommonActions();
        //  read=new ReadDataFromNotePad();

    }

    public void navigateToViewTextTab ()
    {
        actions.click(viewTextTab, "ViewTextTab");
    }

    public void navigateToGroupTab ()
    {


        // JavascriptExecutor js=(JavascriptExecutor)driver;
        // js.executeScript("arguments[0].scrollBy(0, 500);", groupBtnTab);
        Actions tc = new Actions(driver);
        //  tc.moveToLocation(552,1500).clickAndHold().moveToLocation(418,500).release().perform();
        tc.moveToLocation(500, 1730).clickAndHold().moveToLocation(400, 800).release().perform();
        actions.click(groupBtnTab, "GroupTextTab");
    }

    public void navigateToSnackBtn ()
    {

        actions.click(snackBtn, "ClickSnackBtn");
        // System.out.println(snackBtn.isDisplayed());

    }
    public void navigateToClearBtn ()
    {

        actions.click(clearBtn, "ClcickClearBtn");
    }
    public boolean isdisplayedSnackBtn ()
    {
        boolean flag = false;
        if (snackBtn.isDisplayed()) {
            System.out.println("The Radio button is visible");
            flag = true;
        } else {

            System.out.println("The Radio is not  button is visible");
        }
        return flag;


    }
    public boolean isEnableBtn ()
    {
        boolean flag = false;
        if (snackBtn.isEnabled()) {
            System.out.println("The Radio button is Enable");
            flag = true;
        } else {

            System.out.println("The Radio is not  Enable");
        }
        return flag;


    }
    public boolean isAllRadioBtnUnselect ()
    {
        boolean flag = false;

        try {
            for (WebElement w : list) {
                if (!w.isSelected()) {
                    flag = true;
                    System.out.println("button is disable " + w.getText());
                } else {
                    System.out.println("button is enable " + w.getText());
                    flag = false;
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

/*public  boolean ChecksElements() {

        boolean flag = false;
        for (WebElement m : cllist) {
            if (!m.isSelected()) {
                flag = true;
                System.out.println("button is disable " + m.getText());
            } else {
                System.out.println("button is enable " + m.getText());
                flag = false;
            }


        }
        return flag;
    }

*/
}






