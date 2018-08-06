package ui.pages;

import entities.FlightDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class FlightResultListComponent {

    private WebDriver driver;
    @FindBy(xpath = "//button/span[text()='Best']")
    private WebElement best;
    @FindBy(xpath = "//button/span[text()='Cheapest']")
    private WebElement chipest;
    @FindBy(xpath = "//button/span[text()='Fastest']")
    private WebElement fastest;

    //flight list table
    @FindBy(xpath = "//li[starts-with(@class,'day-list-item ItinerariesContainer')]")
    private WebElement flightListTable;

    private By airlineLogo = By.xpath("//*[starts-with(@class,'Leg__itinerary')]//*[starts-with(@class,'AirlineLogo__airline')]");
    private By departTime = By.xpath("//div[starts-with(@class,'LegInfo__leg-depart')]/span[starts-with(@class,'LegInfo__times')]");
    private By arrivalTime = By.xpath("//div[starts-with(@class,'LegInfo__leg-arrive-')]/span[starts-with(@class,'LegInfo__times')]");
    private By  flightPrice = By.xpath("//*[@data-e2e='itinerary-price']");

    @FindBy(xpath = "//button[starts-with(@class,'bpk-button CTASection')]")
    private List<WebElement> select;


    public FlightResultListComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public List<WebElement> getFlightLogos() {
        List<WebElement> logos = flightListTable.findElements(airlineLogo);
        return logos;
    }

    public List<WebElement> getFlightDepartTimes() {
        List<WebElement> departTimes = flightListTable.findElements(departTime);
        return departTimes;
    }

    public List<WebElement> getFlightArrivalTimes() {
        List<WebElement> arrivalTimes = flightListTable.findElements(arrivalTime);
        return arrivalTimes;
    }

    public List<WebElement> getFlightPrices() {
        List<WebElement> flightPrices = flightListTable.findElements(flightPrice);
        return flightPrices;
    }

    public FlightReturnPage selectFlight(int index) {
        select.get(index - 1).click();
        return new FlightReturnPage(driver);
    }

    public FlightDashboard getFlightsInfoByIndex(int index) {
        int indexTo = index * 2 - 2;
        int indexBack = index * 2 - 1;
        String logoFlightTo = getFlightLogos().get(indexTo).getText();
        String departTimeFlightTo = getFlightDepartTimes().get(indexTo).getText();
        String arrivalTimeFlightTo = getFlightArrivalTimes().get(indexTo).getText();
        String logoFlightBack = getFlightLogos().get(indexBack).getText();
        String departTimeFlightBack = getFlightDepartTimes().get(indexBack).getText();
        String arrivalTimeFlightBack = getFlightArrivalTimes().get(indexBack).getText();
        BigDecimal flightPrices = new BigDecimal(getFlightPrices().get(index).getText().replaceAll("£", ""));

        return new FlightDashboard.Builder()
                .departLogoFlightTo(logoFlightTo)
                .departLogoFlightBack(logoFlightBack)
                .departTimeFlightTo(departTimeFlightTo)
                .drrivalTimeFlightBack(departTimeFlightBack)
                .arrivalTimeFlightTo(arrivalTimeFlightTo)
                .departTimeFlightBack(arrivalTimeFlightBack)
                .flightPrice(flightPrices)
                .build();
    }

    public void selectBestFlights() {
        best.click();
    }

    public void selectChipestFlights() {
        chipest.click();
    }

    public void selectFastestFlight() {
        fastest.click();
    }
}
