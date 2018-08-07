package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Slider {

    private WebDriver driver;

    @FindBy(xpath = "//div[starts-with(@class,'departure-times-slider noUi')]")
    private WebElement sliderContainer;
    @FindBy(xpath = "//div[starts-with(@class,'departure-times')]//div[@class='noUi-origin noUi-connect']")
    private WebElement sliderHandlerFrom;
    @FindBy(xpath = "//div[starts-with(@class,'departure-times')]//div[@class='noUi-origin noUi-background']")
    private WebElement sliderHandlerTo;

    @FindBy(xpath = "//*[@data-id='duration']//dd[starts-with(@class,'filter-opts slider-opts')]")
    private WebElement journeyDurationFrom;
    @FindBy(xpath = "//*[@data-id='duration']//dd[starts-with(@class,'filter-opts slider-opts')]")
    private WebElement journeyDurationTo;





    public Slider setOutboundTimes(String depart,String arrival) {
        Actions actions = new Actions(driver);
        Action bulder = actions.dragAndDropBy(sliderContainer,30,0).build();
        bulder.perform();
        return this;
    }
    /**
     * Дорожка слайдера
     */

    @FindBy(className = "ui-slider")
    private WebElement sliderTrack;

    /**
     * Ползунок
     */
    @FindBy(className = "ui-slider-handle")
    private WebElement slider;


    /**
     * Получить шаг в слайдбаре в пикселях
     */
    public Integer getStep() {
        return sliderContainer.getSize().width / 48;
    }

    /**
     * Получить текущую позицию слайдера
     *
     * @return значение от 1-го до 5-ти
     */
    public Integer getCurrentPosition() {
        // Позицию можно получить по значению атрибута left
        // getCssValue("left") возвращает абсолютное значение в px,
        Integer sliderCenter = Integer.parseInt(slider.getCssValue("left")
                .replaceAll("%", "")) + slider.getSize().width / 48;

        return sliderCenter / getStep() + 1;
    }

    /**
     * Установить слайдер в позицию
     *
     * @param position
     *            - значение от 1-го до 5-ти
     */
    public void setSliderPosition(Integer position) {
        if (position < 0 || position > 24) {
            throw new AssertionError(
                    "Slider position value should be in the range of 0 to 24");
        }
        Integer xOffset = (position - getCurrentPosition()) * getStep();
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, xOffset, 0).perform();
    }


}
