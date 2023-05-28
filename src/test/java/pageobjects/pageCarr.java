package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class pageCarr {
    private WebDriver driverl;
    private WebDriverWait wait;
    public String resultado="";
    //Constructor
    public pageCarr(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,20);

    }
    //Locator
    @FindBy(xpath = "//*[@id=\"post-1374\"]/div/section/div[2]/div[5]")
    private WebElement submitpay;
    /*@FindBy(css = "#ec_cartitem_total_1129114")
    private WebElement precio1;
    @FindBy(xpath = "//*[@id=\"ec_cartitem_total_1129089\"]")
    private WebElement precio2;
    */
    @FindBy(xpath = "//table[@class=\"ec_cartitem_quantity_table\"]/tbody/tr[1]/td[3]/input")
        private WebElement boton1;
    @FindBy(id = "ec_cart_subtotal")
        private WebElement subtotal;
    @FindBy(id="ec_cart_shipping")
        private WebElement shipping;
    @FindBy(id="ec_cart_total")
        private WebElement totalt;



    //Action
    public void clickbotonmas(){
        wait.until(ExpectedConditions.visibilityOf(submitpay));
        System.out.println("Solo prueba  "+ submitpay.getText());
        boton1.click();


    }
    public void updateproduct(int nprod){
        System.out.println("Entrando al update");
        List <WebElement> sumauno=driverl.findElements(By.className("ec_cartitem_update_button"));
       // System.out.println(update.get(nprod).getText());
        sumauno.get(nprod).sendKeys(Keys.ENTER);
    }
    public String calculasubtotal(){
        wait.until(ExpectedConditions.visibilityOf(subtotal));
        List <WebElement>  precios = driverl.findElements(By.className("ec_cartitem_total"));
        String prec1=precios.get(0).getText().substring(1,6);
        String prec2=precios.get(1).getText().substring(1,6);
        double uno =Double.parseDouble(prec1);
        double dos =Double.parseDouble(prec2);
        double total=uno + dos;
        double subtot=Double.parseDouble(subtotal.getText().substring(1,6));
        //Assert.assertEquals(total,subtot);
        if(total==subtot){
            resultado="Correcto";
        }else{
            resultado="Incorrecto";
        }
        return resultado;

    }
    public String calculatotal(){
        wait.until(ExpectedConditions.visibilityOf(totalt));
        String resultado="";
        double subt=Double.parseDouble(subtotal.getText().substring(1,6));
        double ship=Double.parseDouble(shipping.getText().substring(1,4));
        double ttal=Double.parseDouble(totalt.getText().substring(1,6));
       // Assert.assertEquals(ttal,subt+ship);
        if(subt+ship==ttal){
            resultado="Correcto";
        }else{
            resultado="Incorrecto";
        }
        return resultado;

    }

}
