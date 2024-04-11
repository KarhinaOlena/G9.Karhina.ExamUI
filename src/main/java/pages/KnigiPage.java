package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KnigiPage extends ParentPage{

    public KnigiPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/catalog/knigi";
    }

    @FindBy(xpath = "//a[@class='d-block link-primary fw-bolder mb-2 mb-lg-3 lh-sm'][contains(text(),'Художня література')]")
    private static WebElement buttonXudozniaLiteraturaInCatalog;

    public KnigiPage checkIsRedirectToKnigiPage() {
        checkUrl();
        return this;
    }

    public void clickOnButtonXudozniaLiteraturaInCatalog() {
        clickOnElement(buttonXudozniaLiteraturaInCatalog);
    }
}
