package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ChromeDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        String pathChromeDirver = "./src/test/resources/chromedriver/chromedriver2";
        System.setProperty("webdriver.chrome.driver", pathChromeDirver);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--disable-blink-features=AutomationControlled ");
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features");
        options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-automation");
        options.addArguments("Object.defineProperty(navigator, 'webdriver', {get: () => undefined})");
        options.addArguments("--no-sandbox");
        options.addArguments("-disable-gpu");
        options.addArguments("--disable-blink-features=AutomationControlled");

        //    options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }
}
