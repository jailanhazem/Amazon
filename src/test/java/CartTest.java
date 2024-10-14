import Pages.CartPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest  extends BaseTest{

    private Pages.SearchPage SearchPage;
    private Pages.CartPage CartPage;

    // Searching item and add it to cart
    @Test()
    public void Add_Item_To_Cart() {
        CartPage= new CartPage(driver);
        SearchPage= new SearchPage(driver);
        SearchPage.clickTextboxBtn();
        SearchPage.enterKeyword("laptop bag");
        SearchPage.clickSearchBtn();
        CartPage.ViewItemPage();
        CartPage.AddItemToCart();


        // Verify that the item is added in the cart
        WebElement cartItem = driver.findElement(By.cssSelector("#add-to-cart-confirmation-image > div > a > img"));
        Assert.assertNotNull(cartItem, "Item was not added to the cart!");


    }
}
