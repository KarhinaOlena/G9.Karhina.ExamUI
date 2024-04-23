package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends ParentPage{
    public WishListPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//a[@href='https://readeat.com/product/104302-za-perekopom-je-zemlia'][contains(text(),'За Перекопом є земля')]")
    private static WebElement buttonZaPerekopomJeZemliaOnWishListPage;

    @FindBy(xpath = ".//img[@alt='%s']")
    private static WebElement bookN;

    @FindBy(xpath = ".//button[@class='fn_remove_wishlist btn btn-light active me-2 mt-2 p-2 rounded-3']")
    private static WebElement buttonRemoveFromWishListOnWishListPage;

    private String imgBookNameOnWishListPageLocator = ".//img[@alt='%s']";

    @Override
    protected String getRelativeUrl() {return "/wishlist";}

public WishListPage checkIsRedirectToWishListPage() {
        checkUrl();
        return this;
    }

   private WebElement getImgBookName(String bookName) {
        String locator = String.format(imgBookNameOnWishListPageLocator, bookName);
        return webDriver.findElement (By.xpath(locator));
    }

    public boolean checkIsImgZaPerekopomJeZemliaDisplayed(String bookName) {
        Assert.assertTrue("Element is not displayed",
                checkElementIsDisplayed(getImgBookName(bookName)));
        return true;
    }

    public boolean checkIsImgZaPerekopomJeZemliaNotDisplayed(String bookName) {
        Assert.assertTrue("Element is displayed",
                checkElementIsNotDisplayed(getImgBookName(bookName)));
        return true;
    }


    public void clickOnImgZaPerekopomJeZemlia() {
        clickOnElement(buttonZaPerekopomJeZemliaOnWishListPage);
    }

    public boolean isButtonRemoveFromWishListOnWishListPageDisplayed() {
        return isElementDisplayed(buttonRemoveFromWishListOnWishListPage);
    }

    public boolean isButtonRemoveFromWishListOnWishListPageNotDisplayed() {
        return isElementDisplayed (buttonRemoveFromWishListOnWishListPage);
    }





}
