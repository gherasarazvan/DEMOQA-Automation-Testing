package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void enterOnAlertFrameWindowMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsFrameWindowsMenu);
        LoggerUtility.infoTest("The user clicks on Alert Frame Window Menu");
    }

    public void enterOnAlertSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsSubMenu);
        LoggerUtility.infoTest("The user clicks on Alerts Submenu");
    }

    public void enterOnBrowserWindowSubmenu(){
        elementHelper.clickJSLocator((IndexLocators.browserSubMenu));
        LoggerUtility.infoTest("The user clicks on Browser Submenu");
    }

    public void enterOnFrameSubmenu(){
        elementHelper.clickJSLocator(IndexLocators.frameSubMenu);
        LoggerUtility.infoTest("The user clicks on Frame Submenu");
    }

    public void enterOnFormsMenu(){
        elementHelper.clickJSLocator(IndexLocators.formsMenu);
        LoggerUtility.infoTest("The user clicks on Forms Menu");
    }

    public void enterOnPracticeFormSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormSubMenu);
        LoggerUtility.infoTest("The user clicks on Practice Form Submenu");
    }

    public void enterOnElementsMenu(){
        elementHelper.clickJSLocator(IndexLocators.elementsMenu);
        LoggerUtility.infoTest("The user clicks on Elements Menu");
    }

    public void enterOnWebTablesSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.webTablesSubMenu);
        LoggerUtility.infoTest("The user clicks on WebTables Submenu");
    }

}
