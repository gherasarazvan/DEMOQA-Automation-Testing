package helpMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementHelper {
    public WebDriver driver;

    //constructor
    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }

    //metode:
    public void waitForElementVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementVisible(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }



    public void clickLocator(By locator){
        waitForElementVisible(locator);
        driver.findElement(locator).click();
    }

    public void clickJSLocator(By locator){
        waitForElementVisible(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(locator));
    }

    public void clickJSLocator(WebElement locator){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", locator);
    }

    public void fillLocator(By locator, String value){
        waitForElementVisible(locator);
        driver.findElement(locator).sendKeys(value);
    }

    public void fillPressLocator(By locator, String value, Keys key){
        waitForElementVisible(locator);
        driver.findElement(locator).sendKeys(value);
        driver.findElement(locator).sendKeys(key);

    }

    public void validateTextLocator(By locator, String expected){
        waitForElementVisible(locator);
        String actualMessage = driver.findElement(locator).getText();
        Assert.assertEquals(actualMessage, expected);
    }

    public void validateTextContainsElement(WebElement element, String text){
        waitForElementVisible(element);
        Assert.assertTrue(element.getText().contains(text));
    }

    public void clearFilledLocator(By locator, String text){
        waitForElementVisible(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);

    }
}