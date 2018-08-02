package ui.pages;

import entities.Flight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Logger;
import utils.Wait;

import java.time.LocalDate;

public class SearchFlightBasePage extends  GeneralPage {

    private WebDriver driver;
    @FindBy(id = "fsc-trip-type-selector-return")
    private WebElement _return;
    @FindBy(id = "fsc-trip-type-selector-one-way")
    private WebElement oneway;
    @FindBy(id = "fsc-trip-type-selector-multi-destination")
    private WebElement multicity;
    //flight
    @FindBy(id = "origin-fsc-search")
    private WebElement destinationFrom;
    @FindBy(id = "destination-fsc-search")
    private WebElement destinationTo;
    //date component
    @FindBy(id = "depart-fsc-datepicker-input")
    private WebElement departDate;
    @FindBy(id = "return-fsc-datepicker-input")
    private WebElement returnDate;


    //date picker
    @FindBy (id = "depart-calendar__bpk_calendar_nav_select")
    private WebElement departmonthId;
    @FindBy (id = "return-calendar__bpk_calendar_nav_select")
    private WebElement returnmonthId;

    //cabin class picker
    @FindBy(xpath = "//button[contains(@id, 'fsc-class-travellers-trigger')]")
    private WebElement travellerTrigger;
    @FindBy (id = "search-controls-cabin-class-dropdown")
    private WebElement cabinClassId;
    @FindBy(xpath = "//button[@title='Increase number of adults']")
    private WebElement adults;
    @FindBy(xpath = "//button[@title='Decrease number of adults']")
    private WebElement decreaseAdults;
    @FindBy(xpath = "//button[@title='Increase number of children']")
    private WebElement increaseChildren;
    @FindBy(xpath = "//button[@title='Decrease number of children']")
    private WebElement decreaseChildren;
    @FindBy(xpath = "//button[text()='Done']")
    private WebElement done;
    @FindBy(css = "[class*='SubmitButton']")
    private WebElement searchFlight;

    public SearchFlightBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillSearchFlightForm(Flight flight) {
        inputFrom(flight.getDestinationFrom());
        inputTo(flight.getDestinationTo());
        inputDepartDate(flight.getDepartDate());
        inputReturnDate(flight.getReturnDate());
        selectCabinClass(flight);
        selectAdults(flight);
        selectChildrensAndSetAges(flight);
        searchFlight.click();
        waitForSpinnerAreNotPresent(driver);
    }

    public SearchFlightBasePage inputFrom(String city) {
        destinationFrom.clear();
        Logger.out.info("Input city from : " + city);
        destinationFrom.sendKeys(city);
        return this;
    }

    public SearchFlightBasePage inputTo(String city) {
        destinationTo.clear();
        Logger.out.info("Input city to : " + city);
        destinationTo.sendKeys(city);
        return this;
    }

    public SearchFlightBasePage inputDepartDate(LocalDate date) {
        String selectMonth = new StringBuilder().
                append(date.getYear()).
                append("-").
                append(date.getMonthValue()).
                toString();
        departDate.click();
        Wait.waitElementIsPresent(driver,By.id("depart-fsc-datepicker-input-popover"));
        Select month = new Select(departmonthId);
        month.selectByValue(selectMonth);
        WebElement date_ = getDay(date);
        date_.click();

        return this;
    }

    public SearchFlightBasePage inputReturnDate(LocalDate date) {
        String selectMonth = new StringBuilder().
                append(date.getYear()).
                append("-").
                append(date.getMonthValue()).
                toString();
        returnDate.click();
        Wait.waitElementIsPresent(driver,By.id("return-fsc-datepicker-input-popover"));
        Select month = new Select(returnmonthId);
        month.selectByValue(selectMonth);
        WebElement date_ = getDay(date);
        date_.click();
        return this;
    }

    public SearchFlightBasePage selectCabinClass(Flight flight) {
        travellerTrigger.click();
        Select cabinClass = new Select(cabinClassId);
        cabinClass.selectByValue(flight.getCabinClass());
        return this;
    }

    public SearchFlightBasePage selectAdults(Flight flight) {
        increaseAdultsTo(flight.getAdultNumber());
        return this;
    }

    public SearchFlightBasePage selectChildrensAndSetAges(Flight flight) {
        int childrens = flight.getChildrenNumber();
        increaseChildsTo(childrens);
        for (int i = 0; i < childrens; i++) {
            Select children = new Select(driver.findElement(By.id("children-age-dropdown-"
                    + String.valueOf(i))));
            children.selectByIndex((int) (5 + (Math.random() * (10 - 5))));
        }
        done.click();
        return this;
    }

    private WebElement getDay(LocalDate date) {
        return driver.findElement(
                    By.xpath("//table[starts-with(@class,'bpk-calendar-grid')]//span[text()='"+ date.getDayOfMonth() +"']"));
    }

    private void increaseAdultsTo(int number) {
        for (int i =0; i<number; i++){
            adults.click();
        }
    }

    private void increaseChildsTo(int childrenNumber) {
        for (int i =0; i<childrenNumber; i++){
            increaseChildren.click();
        }
    }

}
