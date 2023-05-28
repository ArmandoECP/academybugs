package pruebasDefiniciones;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import herramientas.drivers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.pageCarr;
import pageobjects.pagePrincipal;

public class validaproductos {
    private WebDriver driver;
    private  drivers driverh=new drivers();

    @Given("^ingresa a la pagina Find Bugs$")
    public void ingresaALaPaginaFindBugs() {
        driver = driverh.chrome();
    }


    @When("^listamos por precios bajos$")
    public void listamosPorPreciosBajos() {
        pagePrincipal bienvenida=new pagePrincipal(driver);
        bienvenida.busqueda();
    }

    @And("^Seleccionamos productos$")
    public void seleccionamosProductos() {
        pagePrincipal bienvenida=new pagePrincipal(driver);
        bienvenida.selecciona();
    }

    @Then("^se debe presentar la opcion \"([^\"]*)\"$")
    public void seDebePresentarLaOpcion(String msgcarr) throws Throwable {
        pagePrincipal bienvenida=new pagePrincipal(driver);
        Assert.assertEquals(bienvenida.textcarr(),msgcarr);
    }

    @And("^entramos a la pagina View Cart$")
    public void entramosALaPaginaViewCart() {
        pagePrincipal bienvenida=new pagePrincipal(driver);
        bienvenida.vaalcarro();
    }

    @Then("^la suma de los precios debe dar el subtotal \"([^\"]*)\"$")
    public void laSumaDeLosPreciosDebeDarElSubtotal(String respuesta) throws Throwable {
        pageCarr paginacarrito=new pageCarr(driver);
        String cc=paginacarrito.calculasubtotal();
        Assert.assertEquals(paginacarrito.calculasubtotal(),respuesta);
    }
    @Then("^la suma del subtotal mas impuesto debe ser \"([^\"]*)\"$")
    public void laSumaDelSubtotalMasImpuestoDebeSer(String calcEsperado) throws Throwable {
        pageCarr paginacarrito=new pageCarr(driver);
        Assert.assertEquals(paginacarrito.calculatotal(),calcEsperado);
    }
    @After
    public void cierre(Scenario scenario){

        if(scenario.isFailed()){
            TakesScreenShot(scenario);
        }driver.quit();
    }

    public void TakesScreenShot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");

    }


}
