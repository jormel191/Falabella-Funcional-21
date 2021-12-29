package pom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompraFalabellaPage {
    @FindBy(xpath = "//div[@class='dy-modal-contents']/div[1]")
    private List<WebElement> PopUpSizeBtn;

    @FindBy(xpath = "//div[@id='buttonForCustomers']/button")
    private WebElement btnEligeTusOpciones;

    @FindBy(xpath = "//div[@class='dy-modal-contents']/div[1]")
    private WebElement PopUpBtn;

    @FindBy(xpath = "//span[contains(text(),'Menú')]")
    private WebElement menuCategorias;

    @FindBy(xpath = "//div[@class='TaxonomyDesktop-module_Box__1zcT3']//*[contains(text(),'Zapatos')]")
    private WebElement menuZapatos;

    @FindBy(xpath = "//a[contains(text(),'Zapatos de seguridad')]")
    private WebElement menuZapatosSeguridad;


    public By getZapatosDeSeguridad(String product) {
        return By.xpath("//a[contains(text(),'" + product + "')]");
    }

    @FindBy(xpath = "//div[@class='jsx-4001457643 search-results-4-grid grid-pod'][1]")
    private WebElement primerZapatoMostrado;

    @FindBy(xpath = " //div[@class='jsx-3704877324 cmr-icon-container']/span")
    private List<WebElement> listaDeprecios;

    public By getTalla(String talla) {
        return By.xpath("//div[@class='jsx-4058620773 size-options']/button[contains(text(),'" + talla + "')]//ancestor::button");

    }

    @FindBy(id = "linkButton")
    private WebElement btnIrCompras;

    @FindBy(xpath = "//div[@class='jsx-2572436404 price price-2']/span")
    private WebElement precioCarroDeCompra;


    public WebElement getBtnIrCompras() {
        return btnIrCompras;
    }

    public WebElement getBtnEligeTusOpciones() {
        return btnEligeTusOpciones;
    }


    public CompraFalabellaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getPopUpSizeBtn() {
        return PopUpSizeBtn;
    }

    public WebElement getPopUpBtn() {
        return PopUpBtn;
    }

    public WebElement getMenuCategorias() {
        return menuCategorias;
    }

    public WebElement getZapatos() {
        return menuZapatos;
    }

    public WebElement getPrimerZapatoMostrado() {
        return primerZapatoMostrado;
    }

    public List<WebElement> getListaDeprecios() {
        return listaDeprecios;
    }

    public WebElement getPrecioCarroDeCompra() {
        return precioCarroDeCompra;
    }

}
