package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;


    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public void ViewItemPage() {
        WebElement viewItemPage = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/span/a/div/img"));
        viewItemPage.click();
    }
    public void AddItemToCart() {
        WebElement addItemToCart = driver.findElement(By.id("add-to-cart-button"));
        addItemToCart.click();
    }

}
