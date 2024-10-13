package ru.sovcombank.people;

import org.junit.jupiter.api.Test;

import ru.sovcombank.people.pom.MainPage;
import ru.sovcombank.people.pom.VacanciesPage;

import static com.codeborne.selenide.Selenide.open;

public class VacanciesTest {

    private static final String URL = "https://people.sovcombank.ru/";

    @Test
    public void vacanciesTest() {
        MainPage mainPage = open(URL, MainPage.class);
        mainPage.closePopup();
        VacanciesPage vacanciesPage = mainPage.clickVacanciesButton();
        vacanciesPage.chooseMoscow();
    }
}
