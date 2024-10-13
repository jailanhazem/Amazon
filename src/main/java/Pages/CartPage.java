package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Elements
    private By cartItems = By.className("cart_item");
    private By itemPrices = By.cssSelector(".inventory_item_price");
    private By checkoutButton = By.id("checkout");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions
    public int getCartItemCount() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cartItems)).size();
    }

}
