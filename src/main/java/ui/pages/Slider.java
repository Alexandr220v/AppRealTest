package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Slider {

    private WebDriver driver;
    @FindBy(xpath = "//div[starts-with(@class,'departure-times')]//div[@class='noUi-origin noUi-connect']")
    private WebElement outbondFrom;
    @FindBy(xpath = "//div[starts-with(@class,'departure-times')]//div[@class='noUi-origin noUi-background']")
    private WebElement outbondTo;
    @FindBy(xpath = "//div[starts-with(@class,'departure-times')]//div[@class='noUi-origin noUi-connect']")
    private WebElement returnFrom;
    @FindBy(xpath = "//div[starts-with(@class,'departure-times')]//div[@class='noUi-origin noUi-background']")
    private WebElement returnTo;
    @FindBy(xpath = "//*[@data-id='duration']//dd[starts-with(@class,'filter-opts slider-opts')]")
    private WebElement journeyDurationFrom;
    @FindBy(xpath = "//*[@data-id='duration']//dd[starts-with(@class,'filter-opts slider-opts')]")
    private WebElement journeyDurationTo;



    public Slider set(String arrival) {

        return this;
    }

    public Slider setJourneyDuration(String  hours) {

        return this;
    }
}
