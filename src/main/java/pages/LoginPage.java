package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = ".//button[@aria-label='Кабінет']")
    private WebElement buttonCabinetLoginPage;

    @FindBy(xpath = ".//input[@name='login']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//button[contains(text(),'Увійти')]")
    private WebElement buttonSignIn;

    @FindBy(xpath = ".//label[@for='userSigninRemember']")
    private WebElement checkBoxRememberMe;

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public void openLoginPage() {
        try {
            webDriver.get(baseUrl);
            logger.info("Login Page was opened with URL " + baseUrl);
        } catch (Exception e){
            logger.error("Can not open Login Page " + e);
            Assert.fail("Can not open Login Page " + e);
        }
    }

    public void clickOnButtonCabinetLoginPage() {
        clickOnElement(buttonCabinetLoginPage);

    }


    public void enterTextIntoInputLogin(String text) {
        cleanAndEnterTextIntoElement(inputLogin, text);
    }

    public void enterTextIntoInputPassword(String text) {
        cleanAndEnterTextIntoElement(inputPassword, text);
    }

    public void setCheckBoxRememberMeToNeededState(String neededState) {
        setCheckboxToNeededState(checkBoxRememberMe, neededState);
    }

    public void clickOnButtonSignIn() {
        clickOnElement(buttonSignIn);
    }

    public boolean checkIsbuttonCabinetLoginPageIsNotDisplayed() {
        return checkElementIsNotDisplayed(buttonCabinetLoginPage);
    }

    public boolean checkIsButtonSignInIsNotDisplayed() {
        return checkElementIsNotDisplayed(buttonSignIn);
    }

    public boolean checkIsCheckBoxRememberMeIsNotDisplayed() {
        return checkElementIsNotDisplayed(checkBoxRememberMe);
    }

    public boolean checkIsInputLoginIsNotDisplayed() {
        return checkElementIsNotDisplayed(inputLogin);
    }

    public boolean checkIsInputPasswordIsNotDisplayed() {
        return checkElementIsNotDisplayed(inputPassword);
    }





}
