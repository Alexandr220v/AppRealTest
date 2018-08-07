package ui.pages;

import entities.FlightDashboard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

        String logoFlightTo = flightInfoSection.findElements(airlineLogo).get(0).getText();
        String departTimeFlightTo = flightInfoSection.findElements(departTime).get(0).getText();
        String arrivalTimeFlightTo = flightInfoSection.findElements(arrivalTime).get(0).getText();

        return new FlightDashboard.Builder()
                .departLogoFlightTo(logoFlightTo)
                .departTimeFlightTo(departTimeFlightTo)
                .arrivalTimeFlightTo(arrivalTimeFlightTo)
                .build();
    }

    public FlightDashboard getFlightInfoReturn () {

        String logoFlightBack = flightInfoSection.findElements(airlineLogo).get(1).getText();
        String departTimeFlightBack = flightInfoSection.findElements(departTime).get(1).getText();
        String arrivalTimeFlightBack = flightInfoSection.findElements(arrivalTime).get(1).getText();

        return new FlightDashboard.Builder()
                .departLogoFlightBack(logoFlightBack)
                .departTimeFlightBack(departTimeFlightBack)
                .drrivalTimeFlightBack(arrivalTimeFlightBack)
                .build();
    }

}
