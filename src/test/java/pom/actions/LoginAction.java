package pom.actions;

import org.openqa.selenium.WebDriver;
import pom.BasePage;
import pom.page.LoginPage;

public class LoginAction extends BasePage {

    LoginPage loginPage;


    public LoginAction(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public void clickMuestraIniciarSesion() {
        waitFor(1);
        moveToElement(loginPage.getMuestraInicioSesion());
    }

    public void clickRegistrate() throws Exception {
        click(loginPage.getRegistrate());
    }

    public void sendKeysNombre(String nombre) {
        sendKeys(nombre, loginPage.getInputNombre());
    }

    public void sendKeysApellido(String Apellido) {
        sendKeys(Apellido, loginPage.getInputApellido());
    }

    public void sendKeysRut(String Rut) {
        sendKeys(Rut, loginPage.getInputRut());
    }

    public void sendKeysCelular(String Celular) {
        sendKeys(Celular, loginPage.getInputCelular());
    }

    public void sendKeysCorreo(String email) {
        int a = (int) Math.floor(Math.random() * 9998 + 1);
        String correo = email + a + "@yopmail.com";
        sendKeys(correo, loginPage.getInputCorreo());
        System.out.println(correo);
    }

    public void sendKeysContrasena(String Contrasena) {
        sendKeys(Contrasena, loginPage.getInputContrasena());
    }

    private void clickAceptoTerminos() {
        while (!loginPage.getCheckBookAceptoterminos().isSelected()) {
            loginPage.getCheckBookAceptoterminos().click();
        }
    }


    private void clickAutorizo() {
        while (!loginPage.getCheckBookAutorizo().isSelected()) {
            loginPage.getCheckBookAutorizo().click();
        }
    }

    public void clickBtnRegistrarse() throws Exception {
        scrollDown();
        waitFor(2);
        clickAceptoTerminos();
        clickAutorizo();
        click(loginPage.getBtnRegistrarse());
    }

    public boolean getTextNombreMostrado(String name){
       return getText(loginPage.getNombreMostradoLogin(),name);
    }

    public void clickIniciarSesion() throws Exception {
        click(loginPage.getIniciarSesion());
    }

    public void sendKeysEmail(String email){
        sendKeys(email, loginPage.getInputEmail());
    }

    public void sendKeysPassword(String pwd){
        sendKeys(pwd, loginPage.getInputpwd());
    }

    public void clickIngresar() throws Exception {
        click(loginPage.getBtnIngresar());
    }

}

