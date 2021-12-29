package pom.actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.BasePage;
import pom.page.CompraFalabellaPage;


public class CompraFalabellaAction extends BasePage {
    CompraFalabellaPage compraPage;
    String a;

    public CompraFalabellaAction(WebDriver driver) {
        super(driver);
        compraPage = new CompraFalabellaPage(driver);
    }

    private int getPopUpSize() {
        return compraPage.getPopUpSizeBtn().size();
    }

    public void closePopUp() throws Exception {
        if (getPopUpSize() > 0) {
            click(compraPage.getPopUpBtn());
        }
    }

    public void clickCategoria() throws Exception {
        click(compraPage.getMenuCategorias());
    }

    public void clickZapatos() throws Exception {
        click(compraPage.getZapatos());
    }

    public void clickZapatosSeguridad(String product) {
        click(compraPage.getZapatosDeSeguridad(product));
    }


    public void clickPrimerZapatoMostrado() {
        a=getPrecioPrimerProducto();
        getPosicionProduto().click();
    }

    private WebElement getPosicionProduto() {
        return compraPage.getListaDeprecios().get(0);
    }

    private String getPrecioPrimerProducto() {
        return getPosicionProduto().getText().replace("$","").replace(" ", "");
    }

    public void seleccionarTalla(String talla) {
        click(compraPage.getTalla(talla));
    }

    public void clickAgregarCarro() throws Exception {
        click(compraPage.getBtnEligeTusOpciones());
        waitFor(2);
    }

    public void clickBotonIrCompras() throws Exception {
        click(compraPage.getBtnIrCompras());
    }

    public void compararPrecioDeProductos() {
        String b = compraPage.getPrecioCarroDeCompra().getText().replace("$", " ").replace(" ", "");
        Assert.assertEquals(b,a);
    }


}
