package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralPage {

    private WebDriver driver;
    @FindBy(className = "hot-spinner medium")
    private WebElement spinner;

    @FindBy(className = "progress-spinner hot-spinner")
    private WebElement progresspinner;

    @FindBy(className = "updating-filters")
    private WebElement updatingFilter;



}
