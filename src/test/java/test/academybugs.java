package test;

import herramientas.drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobjects.pageCarr;
import pageobjects.pagePrincipal;

public class academybugs {
    private WebDriver driver;
    private drivers driverh=new drivers();

    @Test
    public void inicio(){
        driver = driverh.chrome();
        pagePrincipal bienvenida=new pagePrincipal(driver);
        bienvenida.busqueda();
        bienvenida.selecciona();
        bienvenida.vaalcarro();
        pageCarr paginacarrito=new pageCarr(driver);
        paginacarrito.clickbotonmas();
        //paginacarrito.updateproduct(0);
        paginacarrito.calculasubtotal();
        paginacarrito.calculatotal();

    }
}
