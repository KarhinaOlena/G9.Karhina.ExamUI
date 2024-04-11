package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IstorichnaProzaBookPage extends ParentPage{
    public IstorichnaProzaBookPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/catalog/istorichna-hudozhnya-literatura";
    }

    @FindBy(xpath = ".//a[@href='https://readeat.com/product/104302-za-perekopom-je-zemlia']")
    private static WebElement buttonZaPerekopomJeZemlia;

    public IstorichnaProzaBookPage checkIsRedirectToIstorichnaHudozhnyaLiteraturaBookPage() {
        checkUrl();
        return this;
    }

    public void clickOnButtonZaPerekopomJeZemlia() {
        clickOnElement(buttonZaPerekopomJeZemlia);
    }




}
