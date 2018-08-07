package ui.pages;

import net.sf.cglib.core.Local;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FilterComponent {

    private WebDriver driver;
    @FindBy(xpath = "//li[@data-id='direct']//input")
    private WebElement direct;
    @FindBy(xpath = "//li[@data-id='one_stop']//input")
    private WebElement oneStop;
    @FindBy(xpath = "//li[@data-id='two_plus_stops']//input")
    private WebElement twoPlusStop;

    public FilterComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void setDepartTimeOutbound (int pos) {
        Slider slider = new Slider(driver);
        slider.setSliderPosition(pos);
    }
}
