package ru.sandreeva.tests;

import org.junit.jupiter.api.Test;
import ru.sandreeva.tests.pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static ru.sandreeva.tests.TestDataFaker.*;

public class TextBoxwithpagesobjectTests extends TestBase {

RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void fillFormTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeUserEmail(userEmail);
        registrationPage.typeUserGenter(gender);
        registrationPage.typeUserNumber(phone);
        registrationPage.calendar.setDateOfBirth(day, month, year);
        registrationPage.typeUserSubjects(subject);
        registrationPage.typeUserHobbies(hobby);
        registrationPage.uploadPicture(fileName);
        registrationPage.currentAddress(currentAddress);
        registrationPage.statecity.setPlace(state, city);
        registrationPage.submitPage();




        registrationPage.checkFinalTitle();
        registrationPage.checkResult("Student Name", firstName + " " + lastName);
        registrationPage.checkResult("Student Email", userEmail);
        registrationPage.checkResult("Mobile", phone);
        registrationPage.checkResult("Date of Birth", day + " " + month + "," + year);
        registrationPage.checkResult("Subjects", subject);
        registrationPage.checkResult("Hobbies", hobby);
        registrationPage.checkResult("Picture", fileName);
        registrationPage.checkResult("Address", currentAddress);
        registrationPage.checkResult("State and City", state + " " + city);
    }
}

