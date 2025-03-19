package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends SharedData {


    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnFormsMenu();
        indexPage.enterOnPracticeFormSubMenu();

        String firstNameValue = "Razvan";
        String lastNameValue = "Gherasa";
        String emailValue = "razvan@gmail.com";
        String genderValue = "Male";
        String mobilePhoneValue = "0744112112";
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Arts");
        subjects.add("Biology");
        subjects.add("Chemistry");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Reading");
        hobbies.add("Music");
        String addressValue = "Timisoara";
        String pathValue = "src/test/resources/b8f4c048cdc9f521294171426cd19369.jpg";


        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillFirstName(firstNameValue);
        practiceFormPage.fillLastName(lastNameValue);
        practiceFormPage.fillEmailValue(emailValue);
        practiceFormPage.fillGenderValue(genderValue);
        practiceFormPage.fillMobilePhoneValue(mobilePhoneValue);
        practiceFormPage.fillSubjects(subjects);
        practiceFormPage.fillHobbies(hobbies);
        practiceFormPage.pictureUpload(pathValue);
        practiceFormPage.fillCurrentAddress(addressValue);


//        By stateElement = By.xpath("//div[text()='Select State']");
//        elementHelper.clickJSLocator(stateElement);
//
//        By stateInputElement = By.id("react-select-3-input");
//        String stateInputValue = "NCR";
////        stateInputElement.sendKeys(stateInputValue);
////        stateInputElement.sendKeys(Keys.ENTER);
//        elementHelper.fillPressLocator(stateInputElement, stateInputValue, Keys.ENTER);
//
//        By cityElement = By.xpath("//div[text()='Select City']");
//        elementHelper.clickJSLocator(cityElement);
//
//        By cityInputElement = By.id("react-select-4-input");
//        String cityInputValue = "Delhi";
////        cityInputElement.sendKeys(cityInputValue);
////        cityInputElement.sendKeys(Keys.ENTER);
//        elementHelper.fillPressLocator(cityInputElement, cityInputValue, Keys.ENTER);
//
//        By submitElement = By.id("submit");
//        elementHelper.clickJSLocator(submitElement);
//
//        //pana aici am lucrat 26.02
//
//        By thankyouElement = By.id("example-modal-sizes-title-lg");
//        String expectedMessage = "Thanks for submitting the form";
//        elementHelper.validateTextLocator(thankyouElement, expectedMessage);
////        String actualMessage = thankyouElement.getText();
////        Assert.assertEquals(actualMessage, expectedMessage);
////        System.out.println("Testul a fost validat");
//
//        By tablesRowsListElement = By.xpath("//tbody/tr");
//        List<WebElement> tablesRowsList = driver.findElements(tablesRowsListElement);
//        elementHelper.validateTextContainsElement(tablesRowsList.get(0), "Student Name");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(0), firstNameValue);
//        elementHelper.validateTextContainsElement(tablesRowsList.get(0), lastNameValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(1), "Student Email");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(1), emailValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(2), "Gender");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(2), genderValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(3), "Mobile");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(3), mobilePhoneValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Subjects");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Maths");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Arts");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Biology");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Chemistry");
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(6), "Hobbies");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(6), "Sports");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(6), "Reading");
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(7), "Picture");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(7), "b8f4c048cdc9f521294171426cd19369.jpg");
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(8), "Address");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(8), addressValue);
//
//        elementHelper.validateTextContainsElement(tablesRowsList.get(9), "State and City");
//        elementHelper.validateTextContainsElement(tablesRowsList.get(9), stateInputValue);
//        elementHelper.validateTextContainsElement(tablesRowsList.get(9), cityInputValue);
    }

}