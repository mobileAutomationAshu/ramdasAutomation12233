package pages;

import base.CommonActions;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReadDataFromNotePad;

import java.io.IOException;

public class LogTextBox {
AndroidDriver driver;
CommonActions action;
    ReadDataFromNotePad read;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
    private WebElement textTab;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"LogTextBox\"]")
    private WebElement logTextTab;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Add\"]")
    private WebElement addTextBtn;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/text\"]")
    private WebElement textContains;


    public LogTextBox(AndroidDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        action = new CommonActions();
        read=new ReadDataFromNotePad();
    }
public void navigateToTextTTab()
        {
         action.click(textTab,"ClickText");


        }

    public void navigateTologTextTab()
    {
        action.click(logTextTab,"ClickLogTextTab");

    }
    public void navigateToAddButton()
    {
        action.click(addTextBtn,"ClickLogAddBtn");

    }


  /* public void navigateToaddText()
    {
        action.click(addText,"ClickAddText");

    }
    */

    public boolean verifyTextFieldContains()
    {
        boolean flag=false;
      //  addTextBtn.click();;
        System.out.println(textContains.getText());
                if (read.getText().equalsIgnoreCase(textContains.getText())) {
            System.out.println("Contains match for Expected text");
            flag = true;
        }
            else
        {

            System.out.println("Contains doesn't match for Expected text");
        }
            return flag;
    }



    }


