import entities.Flight;
import org.junit.Test;
import ui.pages.FilterComponent;
import ui.pages.SearchFlightBasePage;

import java.time.LocalDate;

public class SkyScannerSmokeTest  extends BaseTest {

    @Test
    public void verifySearchFlights ()  {

        Flight flight = new Flight.Builder().
                destinationFrom("Kiev").
                destinationTo("London").
                departDate(LocalDate.of(2018,10,10)).
                returnDate(LocalDate.of(2018,10,11)).
                cabinClass("Economy").
                adultNumber(4).
                childrenNumber(3).
                build();
        SearchFlightBasePage flightBasePage = new SearchFlightBasePage(getDriver("chrome"));
        flightBasePage.fillSearchForm(flight);
        FilterComponent filterComponent = new FilterComponent(driver);
        filterComponent.setDepartTimeOutbound(18);

    }
}
