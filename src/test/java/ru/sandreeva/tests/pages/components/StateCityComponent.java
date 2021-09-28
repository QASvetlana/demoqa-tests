package ru.sandreeva.tests.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateCityComponent {
    public void setPlace(String state, String city){


    $("#state").click();
    $("#stateCity-wrapper").$(byText("NCR")).click();
    $("#city").click();
    $("#stateCity-wrapper").$(byText("Delhi")).click();

}
}
