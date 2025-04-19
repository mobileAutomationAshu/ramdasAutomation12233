package base;

import org.openqa.selenium.WebElement;

public class CommonActions {
    public void click(WebElement ele,String  Text){
        boolean flag = false;
        try{
            ele.click();
            flag=true;
        }
        catch (Exception e){
         e.printStackTrace();
        }
        finally {
            if (flag){
                System.out.println("The user is able to click on the : "+Text);
            }
            else {
                System.out.println("The user is not able to click on the : "+Text);
            }
        }

    }
}
