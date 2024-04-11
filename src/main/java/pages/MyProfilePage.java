package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElements;


public class MyProfilePage extends ParentPage {
    public MyProfilePage(WebDriver webDriver) {
        super(webDriver);
    }


    @Override
    protected String getRelativeUrl() {
        return "/account/profile";
    }


    @FindBy(xpath = ".//a[@data-request='onLogout']")
    private WebElement buttonLogout;


    @FindBy(xpath = ".//h1[@class='mb-3']")
    private WebElement CabinetTitle;


    @FindBy(xpath = ".//div[@class='h5 border-bottom mb-4 pb-4'][contains(text(),'Особисті дані')]")
    private WebElement personalDataTitle;


    @FindBy(xpath = ".//img[@class='rounded-circle img-fluid']")
    private WebElement userAvatar;


    @FindBy(xpath = ".//a[@class='btn btn-light btn-sm']")
    private WebElement buttonEditProfile;


    @FindBy(xpath = ".//a[@href='https://readeat.com/account/orders']")
    private WebElement buttonOrders;






    public MyProfilePage checkIsRedirectToMyProfilePage() {
        checkUrl();
        Assert.assertTrue("Invalid Page Not My Profile Page",
                webDriver.getCurrentUrl().contains(baseUrl + getRelativeUrl()));
        return this;
    }




    public MyProfilePage clickOnButtonCabinet() {
        HeaderElements headerElements = new HeaderElements(webDriver);
        headerElements.clickOnButtonCabinet();
        return this;
    }


    public boolean isButtonLogoutIsDisplayed() {
        return isElementDisplayed(buttonLogout);
    }

    public boolean checkIsButtonLogoutDisplayed() {
        return checkElementIsDisplayed(buttonLogout);
    }

    public void checkIsCabinetTitleDisplayed() {
        checkElementIsDisplayed(CabinetTitle);
    }

    public void checkIsPersonalDataTitleDisplayed() {
        checkElementIsDisplayed(personalDataTitle);
    }

    public void checkIsUserAvatarDisplayed() {
        checkElementIsDisplayed(userAvatar);
    }

    public void checkIsButtonEditProfileDisplayed() {
        checkElementIsDisplayed(buttonEditProfile);
    }

    public void checkIsButtonOrdersDisplayed() {
        checkElementIsDisplayed(buttonOrders);
    }

}

