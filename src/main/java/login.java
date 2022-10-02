import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("testoctqaenv@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test1234$");
        driver.findElement(By.xpath("//*[@value='Log In']")).click();
//        String exp = "Welcome to TalentTEK";
//        String actLocator = "//*[@id='profile_form']/legend";
//        String act = driver.findElement(By.xpath(actLocator)).getText();
//        //Assert.assertEquals(act, exp);
    }
}
