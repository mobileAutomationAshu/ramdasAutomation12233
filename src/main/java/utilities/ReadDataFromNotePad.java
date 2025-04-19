package utilities;

import java.io.*;
import java.util.Properties;

public class ReadDataFromNotePad {
    Properties prop;

    //function for fetching data from properties file
    public  ReadDataFromNotePad() throws IOException {
        File file = new File("src/main/resources/data.properties");
        FileInputStream fr = new FileInputStream(file);
         prop=new Properties();
        prop.load(fr);


    }





    public String getText()
    {
        return   prop.getProperty("expectedText");
    }

    public String getButtonOn()
    {
        return   prop.getProperty("expectedOn");
    }

    public String getButtonOff()
    {
        return   prop.getProperty("expectedOff");
    }

}
