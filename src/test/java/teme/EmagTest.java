package teme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmagTest {

    public WebDriver driver;

    @Test
    public void accesareEmag(){

        driver=new ChromeDriver();

        //accesam o pagina web
        driver.get("https://emag.ro");

        //facem browserul in modul maximize
        driver.manage().window().maximize();
    }

}
