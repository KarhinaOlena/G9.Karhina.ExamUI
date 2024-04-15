package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends ParentPage{
    public WishListPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//a[@href='https://readeat.com/product/104302-za-perekopom-je-zemlia'][contains(text(),'За Перекопом є земля')]")
    private static WebElement ButtonZaPerekopomJeZemliaOnWishListPage;


    @FindBy(xpath = ".//button[@class='fn_remove_wishlist btn btn-light active me-2 mt-2 p-2 rounded-3']")
    private static WebElement buttonRemoveFromWishListOnWishListPage;



    @Override
    protected String getRelativeUrl() {return "account/mywishlist";}

public WishListPage checkIsRedirectToWishListPage() {
        checkUrl();
        return this;
    }


    public boolean checkIsZaPerekopomJeZemliaDisplayed() {
        return isElementDisplayed(ButtonZaPerekopomJeZemliaOnWishListPage);
    }

    public boolean checkIsZaPerekopomJeZemliaNotDisplayed() {
        return checkElementIsNotDisplayed (ButtonZaPerekopomJeZemliaOnWishListPage);
    }

    public void clickOnImgZaPerekopomJeZemlia() {
        clickOnElement(ButtonZaPerekopomJeZemliaOnWishListPage);
    }

    public boolean isButtonRemoveFromWishListOnWishListPageDisplayed() {
        return isElementDisplayed(buttonRemoveFromWishListOnWishListPage);
    }

    public boolean isButtonRemoveFromWishListOnWishListPageNotDisplayed() {
        return isElementDisplayed (buttonRemoveFromWishListOnWishListPage);
    }





}
