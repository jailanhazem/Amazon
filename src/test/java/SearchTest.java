import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    private SearchPage SearchPage;

    // Search by Category
    @Test()
    public void Search_by_Category() {

        SearchPage= new SearchPage(driver);
        SearchPage.clickFilterBtn();
        SearchPage.selectCategory();
        SearchPage.clickSearchBtn();

    }
    // Search by keyword
    @Test()
    public void Search_by_Keyword()  {
        String keyword = "laptop";
        SearchPage= new SearchPage(driver);
        SearchPage.clickTextboxBtn();
        SearchPage.enterKeyword(keyword);
        SearchPage.clickSearchBtn();

    }
    //Search with Invalid Input
    @Test()
    public void Search_by_invalid_Input() throws InterruptedException {
        String keyword = "dddddd";
        SearchPage = new SearchPage(driver);
        SearchPage.clickTextboxBtn();
        SearchPage.enterKeyword(keyword);
        SearchPage.clickSearchBtn();
        Thread.sleep(5000);
        // Assert that the no results message is displayed
        Assert.assertTrue(SearchPage.isNoResultsMessageDisplayed(), "No results for " + keyword + ".");
    }

    }


