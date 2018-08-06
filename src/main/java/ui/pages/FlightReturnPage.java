package ui.pages;

import entities.FlightDashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightReturnPage extends FlightResultListComponent {

    @FindBy(xpath = "//div[@class='fss-fdetails-itinerary']")
    private WebElement flightInfoSection;
    @FindBy(xpath = "//*[starts-with(@class,'ItineraryLeg__leg-summary-details')]")
    private WebElement flightSummaryDetailsSection;



    public FlightReturnPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public FlightDashboard getFlightInfoOutbound () {

        WebElement logo = getFlightLogos().get(0);
        WebElement departTime = getFlightDepartTimes().get(0);
        WebElement arrivalTime = getFlightArrivalTimes().get(0);

        return new FlightDashboard.Builder().
    }

    public FlightDashboard getFlightInfoReturn () {

        String logo = flightInfoSection.findElement(By.xpath(""))getFlightLogos().get(1).getText();
        String departTime = getFlightDepartTimes().get(1).getText();
        String arrivalTime = getFlightArrivalTimes().get(1).getText();

        return new FlightDashboard.
                Builder().
                departLogoFlightTo(flightInfoSection.)
    }

    public  FlightDashboard getFlights () {
        flightInfoSection.
    }
}
