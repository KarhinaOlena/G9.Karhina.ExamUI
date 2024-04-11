package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;
import pages.MyProfilePage;

public class HeaderElements extends CommonActionsWithElements {


    @FindBy(xpath =
            ".//a[@class='btn btn-link text-body p-0 d-flex flex-column align-items-center justify-content-center position-relative']")
    private WebElement buttonCabinet;

    public HeaderElements(WebDriver webDriver) {
        super(webDriver);
    }

    public MyProfilePage clickOnButtonCabinet() {
        clickOnElement(buttonCabinet);
        return new MyProfilePage(webDriver);

    }

    public boolean isButtonCabinetDisplayed() {
        return isElementDisplayed(buttonCabinet);
    }

}

