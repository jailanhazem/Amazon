import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utils.utils;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/-/en/");
    }


    @AfterMethod
    public void teardown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            utils.captureScreenshot(driver, result.getName());
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
