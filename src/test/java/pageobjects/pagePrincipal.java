package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagePrincipal {
    private WebDriver driverl;
    private WebDriverWait wait;
    //constructor
    public pagePrincipal(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }
    //locator
    @FindBy(id="sortfield")
    private WebElement selecionador;
    @FindBy(id="ec_add_to_cart_5")
    private WebElement producto1;
    @FindBy(id="ec_add_to_cart_4")
    private WebElement producto2;
    By carrito= By.cssSelector("a[title='View Cart']");

    //Actions
    public void busqueda(){
        wait.until(ExpectedConditions.visibilityOf(selecionador));
        selecionador.findElement(By.xpath("//option[. = 'Price Low-High']")).click();
    }
    public void selecciona(){
        wait.until(ExpectedConditions.visibilityOf(producto1));
        producto1.sendKeys(Keys.ENTER);
        producto2.sendKeys(Keys.ENTER);
    }
    public String textcarr(){
        wait.until(ExpectedConditions.visibilityOf(driverl.findElement(By.cssSelector("a[title='View Cart']"))));
        return driverl.findElement(By.cssSelector("a[title='View Cart']")).getText();
    }
    public void vaalcarro(){
        //wait.until(ExpectedConditions.elementToBeSelected(carrito));
        wait.until(ExpectedConditions.visibilityOf(driverl.findElement(By.cssSelector("a[title='View Cart']"))));
        driverl.findElement(carrito).sendKeys(Keys.ENTER);

    }


}
