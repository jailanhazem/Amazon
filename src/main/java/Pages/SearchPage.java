package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Elements
    private By SearchText = By.id("twotabsearchtextbox");
    private By SearchBtn = By.id("nav-search-submit-button");
    private By FilterBtn = By.id("searchDropdownBox");
    private By Category = By.cssSelector("#searchDropdownBox > option:nth-child(2)");

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Page Actions

    public void clickFilterBtn() {
        driver.findElement(FilterBtn).click();
    }
    public void selectCategory(){driver.findElement(Category).click();}
    public void clickSearchBtn(){driver.findElement(SearchBtn).click();}
    public void clickTextboxBtn() {
        driver.findElement(SearchText).click();
    }


    public void enterKeyword(String keyword) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchText)).sendKeys(keyword);}

    public boolean isNoResultsMessageDisplayed() {
        try {
            return driver.findElement(By.className("a-row")).isDisplayed(); // Adjust locator as necessary

        } catch (NoSuchElementException e) {
            return false;
        }
    }




}
