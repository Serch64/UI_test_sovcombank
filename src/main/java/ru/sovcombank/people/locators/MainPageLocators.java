package ru.sovcombank.people.locators;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;

public class MainPageLocators {
    public static final By VACANCIES_BUTTON = byXpath(".//div[5]/a/button");
    public static final By POPUP_EXIT_BUTTON = byXpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div/button");
}
