package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterComponent {

    private WebDriver driver;
    @FindBy(xpath = "//li[@data-id='direct']//input")
    private WebElement direct;
    @FindBy(xpath = "//li[@data-id='one_stop']//input")
    private WebElement oneStop;
    @FindBy(xpath = "//li[@data-id='two_plus_stops']//input")
    private WebElement twoPlusStop;


    public void setDepartTimeOutbound (String time) {
        setSliderPosition();
    }

    public void setArrivalTimeOutbound (String time) {
        setSliderPosition();
    }

    public void setDepartTimeReturn (String time) {
        setSliderPosition();
    }

    public void setArrivalTimeReturn (String time) {
        setSliderPosition();
    }

    public void setJourneyDuration (String time) {
        setSliderPosition();
    }




}
