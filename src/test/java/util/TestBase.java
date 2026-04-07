package util;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public static WebDriver driver;

    @BeforeClass // Annotation
    public static void initialSetup() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");
    }

    //@AfterClass
//    public static  void teardown() {
//        driver.quit();
//    }
}
