package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFlightBasePage {

    private WebDriver driver;
    @FindBy(id = "fsc-trip-type-selector-return")
    private WebElement _return;
    @FindBy(id = "fsc-trip-type-selector-one-way")
    private WebElement oneway;
    @FindBy(id = "fsc-trip-type-selector-multi-destination")
    private WebElement multicity;
    @FindBy(id = "origin-fsc-search")
    private WebElement destinationFrom;
    @FindBy(id = "destination-fsc-search")
    private WebElement destinationTo;
    @FindBy(id = "depart-fsc-datepicker-input")
    private WebElement departDate;
    @FindBy(id = "return-fsc-datepicker-input")
    private WebElement returnDate;

    @FindBy(xpath = "//button[contains(@id, 'fsc-class-travellers-trigger')]")
    private WebElement travellerTrigger;
    @FindBy(name = "search-controls-cabin-class-dropdown")
    private WebElement cabinClass;
    @FindBy(xpath = "//button[@title='Increase number of adults']")
    private WebElement increaseAdults;
    @FindBy(xpath = "//button[@title='Decrease number of adults']")
    private WebElement decreaseAdults;
    @FindBy(xpath = "//button[@title='Increase number of children']")
    private WebElement increaseChildren;
    @FindBy(xpath = "//button[@title='Decrease number of children']")
    private WebElement decreaseChildren;
    @FindBy(xpath = "//button[text()='Done']")
    private WebElement done;
    @FindBy(css = "[class*='SubmitButton']")
    private WebElement submit;



}
