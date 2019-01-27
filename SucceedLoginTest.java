import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class SucceedLoginTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://www.aspres.pl/");
    }

    @Test
    public void UserTryToLogInWithIncorrectLoginAndPassword() {
        StrefaKlienta strefaKlienta = new StrefaKlienta(driver);
        LoginPage loginPage = new LoginPage(driver);
        strefaKlienta.clickOnStrefaKlientaLink();
        loginPage.typeIntoUserNameField("olgierd@jacher.pl");
        loginPage.typeIntoPasswordField("NOWEhaslo1!");
        loginPage.clickOnLoginButton();
        String approvedMessage = loginPage.getApprovedMessage();

        assertEquals(approvedMessage,"Przepraszamy, w systemie wystąpił błąd."); 

    }

    @AfterMethod
    public void afterTest() {


        driver.close();

        driver.quit();
    }

}