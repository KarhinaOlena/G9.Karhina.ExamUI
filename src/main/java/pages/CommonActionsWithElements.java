package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.apache.log4j.Logger;

public class CommonActionsWithElements {
    protected WebDriver webDriver;
    protected Logger logger = Logger.getLogger(getClass());
    protected WebDriverWait webDriverWait10 , webDriverWait15;


    public CommonActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        webDriverWait10 = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriverWait15 = new WebDriverWait(webDriver, Duration.ofSeconds(15));

    }

    public void clickOnElement(WebElement webElement) {
        try {
            webDriverWait10.until(ExpectedConditions.elementToBeClickable(webElement));
            String elementName = getElementName(webElement);
            webElement.click();
            logger.info(elementName + " element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void cleanAndEnterTextIntoElement(WebElement webElement, String text) {
        try {
            webElement.clear();
            webElement.sendKeys(text);
            logger.info(text + " was inputted into element " + getElementName(webElement));
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementDisplayed(WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            if (state) {
                logger.info(getElementName(webElement) + " element is displayed");
            } else {
                logger.info(getElementName(webElement) + " element is on the page but element is not visible");
            }
            return state;
        } catch (Exception e) {
            logger.info("Element is not displayed");
            return false;
        }
    }

    protected boolean isElementDisplayed(WebElement webElement, String elementName) {
        try {
            boolean state = webElement.isDisplayed();
            if (state) {
                logger.info(elementName + " Element is displayed");
            } else {
                logger.info(elementName + " Element is on the page but element is not visible");
            }
            return state;
        } catch (Exception e) {
            logger.info("Element is not displayed");
            return false;
        }
    }

    protected void setCheckboxSelected(WebElement webElement) {
        try {
            if (!webElement.isSelected()) {
                webElement.click();
                logger.info("Checkbox is selected");
            }
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    protected void setCheckboxUnselected(WebElement webElement) {
        try {
            if (webElement.isSelected()) {
                webElement.click();
                logger.info("Checkbox is unselected");
            }
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    protected void setCheckboxToNeededState(WebElement webElement, String neededState) {
        if (neededState.equals("Checked") && !webElement.isSelected()) {
            setCheckboxSelected(webElement);
            logger.info("Checkbox is checked");
        } else if (neededState.equals("Checked") && webElement.isSelected()) {
            logger.info("Checkbox is already checked");
        } else if (neededState.equals("Unchecked") && webElement.isSelected()) {
            setCheckboxUnselected(webElement);
            logger.info("Checkbox is unchecked");
        } else if (neededState.equals("Unchecked") && !webElement.isSelected()) {
            logger.info("Checkbox is already unchecked");
        } else {
            logger.info("Do nothing with checkbox because checkbox are already in needed state");
        }
    }

    protected boolean checkElementIsDisplayed(WebElement webElement) {
        webDriverWait10.until(ExpectedConditions.visibilityOf(webElement));
        Assert.assertTrue("Element is not displayed", isElementDisplayed(webElement));
        return true;
    }

    protected boolean checkElementIsNotDisplayed(WebElement webElement) {

        webDriverWait10.until(ExpectedConditions.invisibilityOf(webElement));
        Assert.assertFalse("Element is displayed", isElementDisplayed(webElement));
        return true;
    }

    public void refreshPage() {
        webDriver.navigate().refresh();

    }

    private String getElementName(WebElement webElement) {
        try {
            return webElement.getAccessibleName();
        } catch (Exception e) {
            return "";
        }
    }

        private void printErrorAndStopTest (Exception e){
            logger.error("Can not work with element " + e);
            Assert.fail("Can not work with element " + e);
        }
    }

