package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;

public class CartElements extends CommonActionsWithElements {
    public CartElements(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//button[@class='btn btn-outline-dark w-100']")
    private WebElement buttonContinueShopping;

    @FindBy(xpath = ".//a[@class='fn_checkout btn btn-primary w-100 mb-4 mb-lg-0']")
    private WebElement buttonCheckout;

    @FindBy(xpath = ".//a[@href='https://readeat.com/checkout']")
    private WebElement buttonCheckoutLink;

    @FindBy(xpath = ".//button[@class='fn_cartRemove btn btn-light p-2 lh-1']")
    private WebElement buttonRemoveFromCart;

    @FindBy(xpath = ".//div[@id='cartModalLabel']")
    private WebElement cartModalLabel;



    public boolean isButtonContinueShoppingDisplayed() {
        return isElementDisplayed(buttonContinueShopping);
    }

    public boolean isButtonCheckoutDisplayed() {
        return isElementDisplayed(buttonCheckout);
    }

    public boolean checkIsButtonCheckoutLinkDisplayed() {
        return checkElementIsDisplayed(buttonCheckoutLink);
    }

    public boolean checkIsButtonRemoveFromCartDisplayed() {
        return checkElementIsDisplayed(buttonRemoveFromCart);
    }

    public boolean checkIsCartModalLabelDisplayed() {
        return checkElementIsDisplayed(cartModalLabel);
    }

    public void checkIsButtonContinueShoppingDisplayed() {
        checkElementIsDisplayed(buttonContinueShopping);
    }

    public void checkIsButtonCheckoutDisplayed() {
        checkElementIsDisplayed(buttonCheckout);
    }


}


