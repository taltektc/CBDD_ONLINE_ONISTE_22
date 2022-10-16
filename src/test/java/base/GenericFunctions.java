package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

public class GenericFunctions extends Config{

    // Wait functions
    public void implicitWait (int x){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(x));
    }
    public void waitForElementToBePresent(int x, String loc){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(x));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc)));
    }

    public void waitForElementToBeClickable_xpath(int x, String loc){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(x));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc)));
    }

    public void waitForElementToBeClickable_css(int x, String loc){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(x));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(loc)));
    }

    public void getCurrentDateAndTimeWithTimeStamp(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = sdf.format(cal.getTime());
        System.out.println("Current date in String Format:===> "+strDate);
    }

}
