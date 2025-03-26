package sharedData;

import loggerUtility.LoggerUtility;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    //Aceasta clasa are ca rol sa deschida/inchida un browser
    //Vom face acest lucru folosind adnotari de TestNG

    public WebDriver driver;
    public String testName;

    @BeforeMethod
    public void prepareEnvironment() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        testName = this.getClass().getSimpleName();
        LoggerUtility.startTest(testName);
    }

    @AfterMethod
    public void clearEnvironment() {
        driver.quit();
        testName = this.getClass().getSimpleName();
        LoggerUtility.finishTest(testName);
    }
}