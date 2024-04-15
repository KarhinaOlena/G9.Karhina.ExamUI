package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElements;

public class WishListPage extends ParentPage{
    public WishListPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//img[@alt='Фото За Перекопом є земля']")
    private static WebElement ImgZaPerekopomJeZemlia;


    @FindBy(xpath = ".//button[@class='fn_remove_wishlist btn btn-light active me-2 mt-2 p-2 rounded-3']")
    private static WebElement buttonRemoveFromWishListOnWishListPage;



    @Override
    protected String getRelativeUrl() {
        return "account/mywishlist";
    }

public WishListPage checkIsRedirectToWishListPage() {
        checkUrl();
        Assert.assertTrue("Invalid Page Not Wish List Page", isButtonRemoveFromWishListOnWishListPageNotDisplayed());
        return this;
    }

    public WishListPage checkIsRedirectToWishListPageNotDisplayed() {
        checkUrl();
        Assert.assertTrue("Invalid Page Not Wish List Page", checkIsZaPerekopomJeZemliaNotDisplayed());
        return this;
    }

    public boolean checkIsZaPerekopomJeZemliaDisplayed() {
        return isElementDisplayed(ImgZaPerekopomJeZemlia);
    }

    public boolean checkIsZaPerekopomJeZemliaNotDisplayed() {
        return checkElementIsNotDisplayed (ImgZaPerekopomJeZemlia);
    }

    public void clickOnImgZaPerekopomJeZemlia() {
        clickOnElement(ImgZaPerekopomJeZemlia);
    }

    public boolean isButtonRemoveFromWishListOnWishListPageDisplayed() {
        return isElementDisplayed(buttonRemoveFromWishListOnWishListPage);
    }

    public boolean isButtonRemoveFromWishListOnWishListPageNotDisplayed() {
        return isElementDisplayed (buttonRemoveFromWishListOnWishListPage);
    }





}
