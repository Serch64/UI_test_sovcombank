package ru.sovcombank.people.pom;

import static com.codeborne.selenide.Selenide.$;
import static ru.sovcombank.people.locators.VacationPageLocators.*;
;

public class VacanciesPage {
    public void chooseMoscow() {
        $(CITY_DROPDOWN).click();
        $(MOSCOW_CITY).click();
    }
}
