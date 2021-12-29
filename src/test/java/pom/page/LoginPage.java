package pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[text()='Inicia sesión']")
    private WebElement muestraInicioSesion;

    @FindBy(xpath = "//li/a[text()='Inicia sesión']")
    private WebElement iniciarSesion;

    @FindBy(xpath = "//a[text()='Regístrate']")
    private WebElement registrate;

    @FindBy(id = "testId-Input-firstName")
    private WebElement inputNombre;

    @FindBy(id = "testId-Input-lastName")
    private WebElement inputApellido;

    @FindBy(id = "testId-Input-document")
    private WebElement inputRut;

    @FindBy(id = "testId-Input-phoneNumber")
    private WebElement inputCelular;

    @FindBy(id = "testId-Input-email")
    private WebElement inputCorreo;

    @FindBy(id = "testId-Input-password")
    private WebElement inputContrasena;

    @FindBy(xpath = "//input[@id='testId-consent-consentTemplateRegistroTyC_FAL_CL-input']")
    private WebElement checkBookAceptoterminos;

    @FindBy(xpath = "//input[@id='testId-consent-consentTemplateRegistroPdP_FAL_CL-input']")
    private WebElement checkBookAutorizo;

    @FindBy(id = "testId-Button-submit")
    private WebElement btnRegistrase;

    @FindBy(xpath = "//p[text()='Hola']")
    private WebElement nombreMostradoLogin;


    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputpwd;

    @FindBy(id = "testId-cc-login-form-submit")
    private WebElement btnIngresar;

    public WebElement getMuestraInicioSesion() {
        return muestraInicioSesion;
    }

    public WebElement getRegistrate() {
        return registrate;
    }

    public WebElement getIniciarSesion() {
        return iniciarSesion;
    }

    public WebElement getInputNombre() {
        return inputNombre;
    }

    public WebElement getInputApellido() {
        return inputApellido;
    }

    public WebElement getInputRut() {
        return inputRut;
    }

    public WebElement getInputCelular() {
        return inputCelular;
    }

    public WebElement getInputCorreo() {
        return inputCorreo;
    }

    public WebElement getInputContrasena() {
        return inputContrasena;
    }


    public WebElement getCheckBookAceptoterminos() {
        return checkBookAceptoterminos;
    }

    public WebElement getCheckBookAutorizo() {
        return checkBookAutorizo;
    }

    public WebElement getBtnRegistrarse() {
        return btnRegistrase;
    }

    public WebElement getNombreMostradoLogin() {
        return nombreMostradoLogin;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputpwd() {
        return inputpwd;
    }

    public WebElement getBtnIngresar() {
        return btnIngresar;
    }


}
