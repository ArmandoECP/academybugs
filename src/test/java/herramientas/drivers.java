package herramientas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers {
    private WebDriver driver;
    public WebDriver chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Tool\\Drivers\\Chrome\\version113\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://academybugs.com/find-bugs/");
        return driver;
    }
}
