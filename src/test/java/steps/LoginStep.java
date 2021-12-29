package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep extends TestBase{


    @Then("usuario presiona boton registrarse")
    public void usuarioPresionaBotonRegistrarse() throws Exception {
        loginAction.clickMuestraIniciarSesion();
        loginAction.clickRegistrate();
    }

    @And("completa formulario ingresando nombre {string}")
    public void completaFormularioIngresandoNombreNombre(String nombre) {
        loginAction.sendKeysNombre(nombre);
        
    }

    @And("ingresa apellido {string}")
    public void ingresaApellidoApellido(String apellido) {
        loginAction.sendKeysApellido(apellido);
    }

    @And("ingresa rut {string}")
    public void ingresaRutRut(String rut) {
        loginAction.sendKeysRut(rut);
        
    }

    @And("ingresa celular {string}")
    public void ingresaCelular(String celular) {
        loginAction.sendKeysCelular(celular);
        
    }

    @And("ingresa correo {string}")
    public void ingresaCorreoCorreo(String email) {
        loginAction.sendKeysCorreo(email);
        
    }

    @And("ingresa contrasena {string}")
    public void ingresaContrasenaContrasena(String pwd) {
        loginAction.sendKeysContrasena(pwd);
    }


    @And("presiona boton registrase")
    public void presionaBotonRegistrase() throws Exception {
        loginAction.clickBtnRegistrarse();
    }

    @Then("validar que el {string} coincida con la cuenta ingresada")
    public void validarQueElCoincidaConLaCuentaCreada(String nombre) {
        Assert.assertTrue(loginAction.getTextNombreMostrado(nombre));
    }

    @Then("usuario presiona boton inciar sesion")
    public void usuarioPresionaBotonInciarSesion() throws Exception {
        loginAction.clickMuestraIniciarSesion();
        loginAction.clickIniciarSesion();
    }

    @And("introduce correo {string}")
    public void ingresaCorreo(String email) {
        loginAction.sendKeysEmail(email);
    }
    @And("introduce contrasena {string}")
    public void ingresaContrasena(String pwd) {
        loginAction.sendKeysPassword(pwd);
    }

    @Then("presiona ingresar")
    public void presionaContinuar() throws Exception {
        loginAction.clickIngresar();
    }

}
