package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraFalabellaStep extends TestBase{

    @Given("ingreso al sitio")
    public void ingresoAlSitio() throws Throwable {
        compra.closePopUp();

    }

    @When("presiono la opción Categorias")
    public void presionoLaOpcionCategorias() throws Throwable {
        compra.clickCategoria();
    }

    @Then("me dirijo a la opción Zapatos")
    public void meDirijoALaOpcion() throws Exception {
        compra.clickZapatos();
    }

    @And("selecciono {string}")
    public void selecciono(String product) throws Exception {
        compra.clickZapatosSeguridad(product);
    }

    @Then("selecciono el primer zapato mostrado")
    public void seleccionoElPrimerZapato() throws Exception {
        compra.clickPrimerZapatoMostrado();

    }
    @And("seleccionar talla {string}")
    public void seleccionarTalla(String talla) throws InterruptedException {
        compra.seleccionarTalla(talla);

    }

    @And("presiono la opcion Agregar al Carro")
    public void presionoLaOpcionAgregarAlCarro() throws Exception {
        compra.clickAgregarCarro();
    }

    @Then("presiono la opcion Ir al carro de Compras")
    public void presionoLaOpcionIrAlCarroDeCompras() throws Exception {
        compra.clickBotonIrCompras();
    }

    @And("valido el precio del carro de compra con el mostrado previamente")
    public void validoElPrecioDelCarroDeCompraConElMostradoPreviamente() {
        compra.compararPrecioDeProductos();
    }
}
