package ru.sovcombank.people.pom;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static ru.sovcombank.people.locators.MainPageLocators.POPUP_EXIT_BUTTON;
import static ru.sovcombank.people.locators.MainPageLocators.VACANCIES_BUTTON;

public class MainPage {
    public void closePopup() {
        $(POPUP_EXIT_BUTTON).shouldBe(visible, Duration.ofSeconds(30));
        $(POPUP_EXIT_BUTTON).click();
    }
    public VacanciesPage clickVacanciesButton() {
       $(VACANCIES_BUTTON).click();
       return page(VacanciesPage.class);
    }
}
