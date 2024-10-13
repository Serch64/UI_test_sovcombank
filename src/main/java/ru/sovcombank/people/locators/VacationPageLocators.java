package ru.sovcombank.people.locators;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;

public class VacationPageLocators {
    public static final By CITY_DROPDOWN = byCssSelector(".search-cities");
    public static final By MOSCOW_CITY = byId("list-item-141-0");

}
