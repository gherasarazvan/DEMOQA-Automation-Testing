package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageLocators.PracticeFormsLocators;

import java.io.File;
import java.util.List;

import static pageLocators.PracticeFormsLocators.*;

public class PracticeFormPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void fillFirstName(String firstNameValue) {
        elementHelper.fillLocator(firstNameElement, firstNameValue);
        LoggerUtility.infoTest("The user fills first name field");
    }

    public void fillLastName(String lastNameValue) {
        elementHelper.fillLocator(lastNameElement, lastNameValue);
        LoggerUtility.infoTest("The user fills last name field");
    }

    public void fillEmailValue(String emailValue) {
        elementHelper.fillLocator(emailElement, emailValue);
        LoggerUtility.infoTest("The user fills email field");
    }

    public void fillGenderValue(String genderValue) {
        List<WebElement> genderOptionsList = driver.findElements(genderOptionsElement);
        if (genderValue.equals("Male")) {
            elementHelper.clickJSLocator(genderOptionsList.get(0));
        }
        if (genderValue.equals("Female")) {
            elementHelper.clickJSLocator(genderOptionsList.get(1));
        }
        if (genderValue.equals("Other")) {
            elementHelper.clickJSLocator(genderOptionsList.get(2));
        }
        LoggerUtility.infoTest("The user chooses gender");
    }

    public void fillMobilePhoneValue(String mobilePhoneValue) {
        elementHelper.fillLocator(mobilePhoneElement, mobilePhoneValue);
        LoggerUtility.infoTest("The user fills mobile phone field");
    }

    public void fillSubjects(List<String> subjects) {
        elementHelper.clickJSLocator(subjectsElement);

        for (int index = 0; index < subjects.size(); index++) {
            elementHelper.fillPressLocator(subjectsElement, subjects.get(index), Keys.ENTER);
        }
        LoggerUtility.infoTest("The user fills the subjects");
    }

    public void fillHobbies(List<String> hobbies) {
        List<WebElement> hobbiesOptionsList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//label"));
        for (int index = 0; index < hobbies.size(); index++) {
            String currentText = hobbiesOptionsList.get(index).getText();
            if (hobbies.contains(currentText)) {
                elementHelper.clickJSLocator(hobbiesOptionsList.get(index));
            }

        }
        LoggerUtility.infoTest("The user fills the hobbies");
    }

    public void pictureUpload(String path) {
        File file = new File(path);
        elementHelper.fillLocator(pictureElement, file.getAbsolutePath());
        LoggerUtility.infoTest("The user uploads a picture");
    }

    public void fillCurrentAddress(String addressValue) {
        elementHelper.fillLocator(addressElement, addressValue);
        LoggerUtility.infoTest("The user fills current address field");
    }

    public void fillState(String stateValue) {
        elementHelper.clickJSLocator(stateElement);
        elementHelper.fillPressLocator(stateInputElement, stateValue, Keys.ENTER);
        LoggerUtility.infoTest("The user fills state field");
    }

    public void fillCity(String cityInputValue) {
        elementHelper.clickJSLocator(cityElement);
        elementHelper.fillPressLocator(cityInputElement, cityInputValue, Keys.ENTER);
        LoggerUtility.infoTest("The user fills city field");
    }

    public void submitClick() {
        elementHelper.clickJSLocator(submitElement);
        LoggerUtility.infoTest("The user submits the form");
    }

    public void validateThankYouMessage(String expectedMessage) {
        elementHelper.validateTextLocator(thankyouElement, expectedMessage);
        System.out.println("Testul a fost validat");
    }

    public void validateEntireTable(String firstNameValue, String lastNameValue,
                                    String emailValue, String genderValue, String mobilePhoneValue,
                                    String addressValue, String stateInputValue, String cityInputValue) {
        List<WebElement> tablesRowsList = driver.findElements(tablesRowsListElement);
        elementHelper.validateTextContainsElement(tablesRowsList.get(0), "Student Name");
        elementHelper.validateTextContainsElement(tablesRowsList.get(0), firstNameValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(0), lastNameValue);

        elementHelper.validateTextContainsElement(tablesRowsList.get(1), "Student Email");
        elementHelper.validateTextContainsElement(tablesRowsList.get(1), emailValue);

        elementHelper.validateTextContainsElement(tablesRowsList.get(2), "Gender");
        elementHelper.validateTextContainsElement(tablesRowsList.get(2), genderValue);

        elementHelper.validateTextContainsElement(tablesRowsList.get(3), "Mobile");
        elementHelper.validateTextContainsElement(tablesRowsList.get(3), mobilePhoneValue);

        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Subjects");
        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Maths");
        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Arts");
        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Biology");
        elementHelper.validateTextContainsElement(tablesRowsList.get(5), "Chemistry");

        elementHelper.validateTextContainsElement(tablesRowsList.get(6), "Hobbies");
        elementHelper.validateTextContainsElement(tablesRowsList.get(6), "Sports");
        elementHelper.validateTextContainsElement(tablesRowsList.get(6), "Reading");

        elementHelper.validateTextContainsElement(tablesRowsList.get(7), "Picture");
        elementHelper.validateTextContainsElement(tablesRowsList.get(7), "b8f4c048cdc9f521294171426cd19369.jpg");

        elementHelper.validateTextContainsElement(tablesRowsList.get(8), "Address");
        elementHelper.validateTextContainsElement(tablesRowsList.get(8), addressValue);

        elementHelper.validateTextContainsElement(tablesRowsList.get(9), "State and City");
        elementHelper.validateTextContainsElement(tablesRowsList.get(9), stateInputValue);
        elementHelper.validateTextContainsElement(tablesRowsList.get(9), cityInputValue);
    }
}
