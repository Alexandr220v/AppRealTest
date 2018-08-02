package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Wait;

public class GeneralPage {

    private By spinner = By.className("hot-spinner medium");
    private By progresspinner = By.className("progress-spinner hot-spinner");
    private By updatingFilter = By.className("updating-filters");

    public void waitForSpinnerAreNotPresent(WebDriver driver) {
        Wait.waitElementIsNotPresent(driver,spinner);
    }

    public void waitForProgressSpinnerAreNotPresent(WebDriver driver) {
        Wait.waitElementIsNotPresent(driver,progresspinner);
    }

    public void waitForUpdating(WebDriver driver) {
        Wait.waitElementIsNotPresent(driver,updatingFilter);
    }
}
