import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("testoctqaenv@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test1234$");
        driver.findElement(By.xpath("//*[@value='Log In']")).click();
        Thread.sleep(1000);
        String exp = "Welcome to TalentTek";
        String actLocator = "//*[@id='profile_form']/legend";
        String act = driver.findElement(By.xpath(actLocator)).getText();
        Assert.assertEquals(act, exp);
    }


}
