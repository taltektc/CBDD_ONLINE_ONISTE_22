package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Config {
public static String url;
public static String eMail;
public static String password;
public static String driverType = System.getProperty("browser");
public static String envType = System.getProperty("env");

@Before
public void startTest(){
    // open browser - browser type
    // go to url - envType
    driver = setupBrowser (driverType);
    switch (envType){
        case "qa":
            url = "https://qa.taltektc.com";
            eMail = "testoctqaenv@gmail.com";
            password = "Test1234$";
            break;
        case "stg":
            url = "https://stage.taltektc.com";
            eMail = "testoctstgenv@gmail.com";
            password = "Password1234$";
            break;
    }
    driver.get(url);

}

@After
public void endTest(){
    // close driver
    // create report
    // if test fail, take screenshot
}


}
