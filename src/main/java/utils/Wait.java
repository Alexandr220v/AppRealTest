package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait   {

    public static final long TIMEOUT = 90;

    public static void waitElementIsVisible(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, TIMEOUT);
        webDriverWait.
                until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitElementIsNotPresent(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, TIMEOUT);
        webDriverWait.
                until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void waitElementIsClickable(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, TIMEOUT);
        webDriverWait.
                until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitElementIsPresent(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, TIMEOUT);
        webDriverWait.
                until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitFotAjaxIsFinished(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("return (typeof jQuery != 'undefined') ? jQuery.active == 0 : true;");

    }


}
