package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(xpath = "//img[starts-with(@class,'AirlineLogo')]")
    private WebElement airlineLogo;
    @FindBy(xpath = "//div[starts-with(@class,'LegInfo__leg-depart')]")
    private WebElement departTime;
    @FindBy(xpath = "//div[starts-with(@class,'LegInfo__leg-arrive')]")
    private WebElement arrivalTime;
    @FindBy(xpath = "//*[@data-e2e='itinerary-price']")
    private WebElement flightPrice;







}
