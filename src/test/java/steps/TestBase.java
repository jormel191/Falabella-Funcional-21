package steps;

import org.openqa.selenium.WebDriver;
import pom.actions.CompraFalabellaAction;
import pom.actions.LoginAction;


public class TestBase {

    protected WebDriver driver =Hooks.getDriver();
    protected CompraFalabellaAction compra = new CompraFalabellaAction(driver);
    protected LoginAction loginAction= new LoginAction(driver);

}
