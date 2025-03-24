package pages;

import helpMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageLocators.WebTablesLocators;

import java.util.List;

import static pageLocators.PracticeFormsLocators.tablesRowsListElement;
import static pageLocators.WebTablesLocators.*;

public class WebTablesPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void verifyTableContent(int expectedTablesRowListElement){
        elementHelper.waitForElementsVisible(tablesRowListElement);
        List<WebElement> tablesRowsList = driver.findElements(tablesRowListElement);
        Assert.assertEquals(tablesRowsList.size(), expectedTablesRowListElement, "Valoarea initiala a tabelului nu este 3");
    }

    public void addNewRecordButtonClick(){
        elementHelper.clickJSLocator(addElement);
    }

    public void fillFirstName(String firstNameValue){
        elementHelper.fillLocator(firstNameElement, firstNameValue);
    }

    public void filllastName(String lastNameValue){
        elementHelper.fillLocator(lastNameElement, lastNameValue);
    }

    public void fillEmail(String userEmailValue){
        elementHelper.fillLocator(userEmailElement, userEmailValue);
    }

    public void fillAge(String ageValue){
        elementHelper.fillLocator(ageElement, ageValue);
    }

    public void fillSalary(String salaryValue){
        elementHelper.fillLocator(salaryElement, salaryValue);
    }

    public void fillDepartment(String departmentValue){
        elementHelper.fillLocator(departmentElement, departmentValue);
    }

    public void submitClick(){
        elementHelper.clickJSLocator(submitElement);
    }

    public void verifyTableContent(int expectedSize, String firstNameValue, String lastNameValue, String userEmailValue,
                                   String ageValue, String salaryValue, String departmentValue){
        List<WebElement> tablesRowsList = driver.findElements(tablesRowsListElement);
        Assert.assertEquals(tablesRowsList.size(), 4, "Valoarea actuala a tabelului nu este 4");
        elementHelper.validateTextContainsElement(tablesRowsList.get(3),firstNameValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3),lastNameValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3),userEmailValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3),ageValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3),salaryValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(3),departmentValue);
    }

    public void deleteRecords(){
        elementHelper.clickJSLocator(deleteElement);
    }

    public void editClick(){
        elementHelper.clickJSLocator(editElement);
    }
}
