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
        String stateInputValue = "NCR";
        String cityInputValue = "Delhi";
        String expectedMessage = "Thanks for submitting the form";

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
        practiceFormPage.fillState(stateInputValue);
        practiceFormPage.fillCity(cityInputValue);
        practiceFormPage.submitClick();
        practiceFormPage.validateThankYouMessage(expectedMessage);
        practiceFormPage.validateEntireTable(firstNameValue, lastNameValue, emailValue, genderValue, mobilePhoneValue, addressValue, stateInputValue, cityInputValue);
    }
}