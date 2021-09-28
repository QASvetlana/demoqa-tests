package ru.sandreeva.tests.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ru.sandreeva.tests.pages.components.CalendarComponent;
import ru.sandreeva.tests.pages.components.StateCityComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {


    private final String FORM_TITLE = "Student Registration Form";
    private final String MODAL_TITLE = "Thanks for submitting the form";

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genterWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userSubjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            submitButton = $("#submit"),
            modalTitle = $("#example-modal-sizes-title-lg"),
            modalTable = $(".table-responsive");

    public CalendarComponent calendar = new CalendarComponent();
    public StateCityComponent statecity = new StateCityComponent();


    public void openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text("Student Registration Form"));

    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(value);

    }

    public void typeLastName(String value) {
        lastNameInput.setValue(value);

    }


    public void typeUserEmail(String value) {
        userEmailInput.setValue(value);

    }


    public void typeUserGenter(String value) {
        genterWrapper.$(byText(value)).click();

    }


    public void typeUserNumber(String value) {
        userNumberInput.setValue(value);

    }

    public void typeUserSubjects(String value) {
        userSubjectsInput.setValue(value).pressEnter();

    }

    public void typeUserHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

    }

    public void uploadPicture(String fileName) {
        uploadPictureInput.uploadFromClasspath(fileName);

    }


    public void currentAddress(String value) {
        currentAddressInput.setValue(value);

    }

    public void submitPage() {
        submitButton.click();
    }


    public void checkFinalTitle() {
        modalTitle.shouldHave(text(MODAL_TITLE));
    }

    public void checkResult(String key, String value) {
        modalTable.$(byText(key)).parent().shouldHave(text(value));
    }


}