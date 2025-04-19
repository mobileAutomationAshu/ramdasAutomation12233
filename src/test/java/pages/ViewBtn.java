package pages;
import base.CommonActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import utilities.ReadDataFromNotePad;

import java.io.IOException;

public class ViewBtn {
ReadDataFromNotePad read;
        AndroidDriver driver;
        CommonActions action;

        // Locate elements using @FindBy annotation
        @FindBy(xpath = "//android.widget.TextView[@content-desc='Views']")
        private WebElement viewsTab;

        @FindBy(xpath = "//android.widget.TextView[@content-desc='Buttons']")
        private WebElement buttonsTab;

        @FindBy(xpath = "//android.widget.ToggleButton[@content-desc='Toggle']")
        private WebElement toggleButton;

        // Constructor to initialize the page elements
        public ViewBtn(AndroidDriver driver) throws IOException {
            this.driver = driver;
            PageFactory.initElements(driver, this);
            action=new CommonActions();
           read=new ReadDataFromNotePad();
        }

        // Method to navigate to the 'Views' tab
        public void navigateToViewsTab() {
          //  viewsTab.click();
            action.click(viewsTab,"viewsTab");
        }

        // Method to navigate to the 'Buttons' tab
        public void navigateToButtonsTab() {
           // buttonsTab.click();
            action.click(buttonsTab,"buttonsTab");
        }

        // Method to click the toggle button and check if it turns "ON"
        public boolean clickAndCheckToggleButtonOn() throws IOException {
            boolean flag = false;
            toggleButton.click();
            if (read.getButtonOn().equalsIgnoreCase(toggleButton.getText())) {
                System.out.println("Test pass: Button is ON");
                flag=true;
            }
            else {
                System.out.println("Test fail: Button is OFF");
            }
            return flag;
        }

        // Method to click the toggle button and check if it turns "OFF"
        public boolean clickAndCheckToggleButtonOff() {
            boolean flag = false;
            toggleButton.click();

            if (read.getButtonOff().equalsIgnoreCase(toggleButton.getText())) {
                System.out.println("Test pass: Button is OFF");
                flag=true;
            } else {
                System.out.println("Test fail: Button is still ON");
            }
            return flag;

        }

    }

