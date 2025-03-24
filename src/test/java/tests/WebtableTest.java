package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WebTablesPage;
import sharedData.SharedData;

import java.util.List;

public class WebtableTest extends SharedData {


    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnElementsMenu();
        indexPage.enterOnWebTablesSubMenu();

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.verifyTableContent(3);

        webTablesPage.addNewRecordButtonClick();

        String firstNameValue = "Razvan";
        String lastNameValue = "Gherasa";
        String userEmailValue = "razvan@gmail.com";
        String ageValue = "25";
        String salaryValue = "3000";
        String departmentValue = "it";
        int expectedSize = 4;

        webTablesPage.fillFirstName(firstNameValue);
        webTablesPage.filllastName(lastNameValue);
        webTablesPage.fillEmail(userEmailValue);
        webTablesPage.fillAge(ageValue);
        webTablesPage.fillSalary(salaryValue);
        webTablesPage.fillDepartment(departmentValue);
        webTablesPage.submitClick();

        webTablesPage.verifyTableContent(expectedSize);

        webTablesPage.editClick();

        String firstNameValueEdit = "Ran";
        String lastNameValueEdit = "Ghesa";
        String userEmailValueEdit = "razn@gmail.com";
        String ageValueEdit = "5";
        String salaryValueEdit = "300";
        String departmentValueEdit = "ijjt";
        int expectedSizeEdit = 4;

        webTablesPage.verifyTableContent(expectedSizeEdit);
        webTablesPage.fillFirstName(firstNameValueEdit);
        webTablesPage.filllastName(lastNameValueEdit);
        webTablesPage.fillEmail(userEmailValueEdit);
        webTablesPage.fillAge(ageValueEdit);
        webTablesPage.fillSalary(salaryValueEdit);
        webTablesPage.fillDepartment(departmentValueEdit);
        webTablesPage.submitClick();

        webTablesPage.deleteRecords();
        webTablesPage.verifyTableContent(3);

    }
}