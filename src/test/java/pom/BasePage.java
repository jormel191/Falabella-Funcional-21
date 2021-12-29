package pom;


import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;


public class BasePage {

    private static final int WAIT_TIMEOUT = 30;
    private final WebDriverWait wait;
    protected WebDriver driver;
    protected Actions action;

    @FindBy(xpath ="//*[@class='Spinner-module_spinner__svg__3A0EL']")
    private WebElement barraCargando;



    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        action = new Actions(driver);

    }

    protected void click(WebElement element) throws Exception {
        isClickeable(element);
        element.click();
    }

    public void click(By selector)  {
        waitUntilElementIsVisible(selector);
        WebElement element = driver.findElement(selector);
        element.click();
    }

    protected void isClickeable(WebElement element) throws Exception {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new Exception("El elemento no es clickeable " + element);
        }
    }

    public void moveToElement(WebElement element) {
        waitUntilElementIsVisible(element);
        action.moveToElement(element).perform();
    }

    public void waitUntilPageIsLoaded(){
        waitUntilElementIsInVisibleNonThrow(barraCargando);
    }

    protected boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean isVisible(By webElement){
        try {
            return driver.findElement(webElement).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }


    public void waitUntilElementIsVisible(WebElement element) {
        try {
            await().atMost(WAIT_TIMEOUT, SECONDS).until(() -> isVisible(element));
        } catch (ConditionTimeoutException e) {
            throw new ConditionTimeoutException(String.format("No se encuentra el elemento despues de 30 segundos\nElemento: %s", element));
        }
    }

    public void waitUntilElementIsInVisibleNonThrow(WebElement element){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isInvisible(element));
        } catch (ConditionTimeoutException e) {
        }
    }

    public void waitUntilElementIsVisible(By elements){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isVisible(elements));
        }catch (ConditionTimeoutException e){
            throw new ConditionTimeoutException(String.format("No se encuentra el elemento despues de 5 segundos\nElemento: %s", elements));
        }
    }

    protected boolean isInvisible(WebElement element){
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e){
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void waitFor(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ignored) {

        }
    }


    protected void sendKeys(String inputText, WebElement element) {
        waitUntilElementIsVisible(element);
        element.clear();
        element.sendKeys(inputText);
    }

    public void scrollDown() {
        Dimension size = driver.manage().window().getSize();
        int startPoint = (int)((double)size.getHeight() * 0.7D);
        int endPoint = (int)((double)size.getHeight() * 0.4D);
        ((JavascriptExecutor)driver).executeScript("scroll("+startPoint+","+endPoint+")");
    }

    protected boolean getText(WebElement webElement, String text) {
        waitUntilPageIsLoaded();
        return webElement.getText().contains(text);
    }

    protected boolean getText1(WebElement webElement, String text) {
        waitUntilPageIsLoaded();
        return webElement.getText().equals(text);
    }



}

