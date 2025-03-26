package pages;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageLocators.AlertLocators;

import javax.swing.text.Element;

public class AlertPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private AlertHelper alertHelper;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        alertHelper = new AlertHelper(driver);
    }

    public void interactWithAcceptAlert(){
        elementHelper.clickJSLocator(AlertLocators.alertOkElement);
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user accepts the alert");
    }

    public void interactWithTimerAlert(){
        elementHelper.clickJSLocator(AlertLocators.timerAlertElement);
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user accepts the timer alert");
    }

    public void interactWithCancelAlert(){
        elementHelper.clickJSLocator(AlertLocators.confirmButtonElement);
        alertHelper.cancelAlert();
        LoggerUtility.infoTest("The user cancels the alert");
    }

    public void interactWithPromtAlert(String value){
        elementHelper.clickJSLocator(AlertLocators.promptButtonElement);
        alertHelper.fillAlert(value);
        LoggerUtility.infoTest("The user fills the alert field and accept the alert");
    }
}
