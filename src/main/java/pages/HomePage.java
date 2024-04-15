package pages;

import data.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElements;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

        @FindBy(xpath = ".//a[@href='https://readeat.com/catalog/knigi']")
        private static WebElement buttonKnigiInCatalog;


        public HeaderElements getHeaderElements () {
            return new HeaderElements(webDriver);
        }

        public HomePage checkIsRedirectToHomePage () {
            checkUrl();
            Assert.assertTrue("Invalid Page Not Home Page", getHeaderElements()
                    .isButtonCabinetDisplayed());
            return this;
        }

        public void clickOnButtonKnigiInCatalog () {
            clickOnElement(buttonKnigiInCatalog);
        }



}
