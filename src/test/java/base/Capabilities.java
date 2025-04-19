package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.xml.datatype.Duration;
import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Capabilities {
    public AndroidDriver driver;
   // public WebDriver driver;
   // Object MobileCapabilityType;


    public void lunchApp() throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android")
                // .setDeviceName("motorola edge 40 neo")
                //  .setPlatformVersion("14")
                .setAutomationName("UiAutomator2")
                .setUdid("emulator-5554")
                .setApp("Downloads/ApiDemos-debug.apk");


        URL url = new URL("http://127.0.0.1:4723/");

        driver = new AndroidDriver(url, options);

    }
@Test
    public void lunchBrowser() throws MalformedURLException, InterruptedException {
    UiAutomator2Options options = new UiAutomator2Options();

    options.setPlatformName("Android")
            // .setDeviceName("motorola edge 40 neo")
            //  .setPlatformVersion("14")

            .setUdid("ZD222G78TS").setAutoGrantPermissions(true);
            //.setApp("Downloads/ApiDemos-debug.apk");


    URL url = new URL("http://127.0.0.1:4723/");

    driver = new AndroidDriver(url, options);

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\MobileAutomation\\MobileAutomation\\driver\\chromedriver.exe");

    // Configure ChromeOptions for Android device
    ChromeOptions optionss = new ChromeOptions();


    // Specify the package name of Chrome on Android
    optionss.setExperimentalOption("androidPackage", "com.android.chrome");

    // Launch Chrome browser on Android device/emulator
    WebDriver driver = new ChromeDriver(optionss);

    // Open a URL in the Android browser
    driver.get("https://katalon.com/");
    driver.findElement(By.xpath("//div[@class=\"mobile__menu--top\"]//ancestor::section//child::i[contains(@class,\"bars\")]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class=\"header__mobile--menu\"]//a[contains(text(),'Log in')]")).click();
    driver.findElement(By.xpath("//div[@class=\"main_content\"]//child::a[@class=\"btn-sso\"][1]")).click();

driver.findElement(By.xpath("//input[@aria-label=\"Email or phone\"]")).sendKeys("nagpureankush1991@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();
   // driver.findElement(By.xpath("//input[@id=\"ap_email_login\"]")).sendKeys("nagpureankush1991@gmail.com");

    // Perform your tests or automation steps
    //System.out.println("Page Title: " + driver.getTitle());
}

//android.widget.Button[@content-desc="Small"]
        // Thread.sleep(6000);
        // driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Small\"]")).click();
//android.widget.Button[@content-desc="Normal"]
        // Thread.sleep(6000);
        // driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Normal\"]")).click();

    }
