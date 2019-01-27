package tests;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.StrefaKlienta;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class FailedLoginTest {

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
        loginPage.typeIntoUserNameField("WrongLogin");
        loginPage.typeIntoPasswordField("WrongPassword");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage,"Błędna nazwa użytkownika lub hasło.\n" + "Spróbuj zalogować się ponownie.");

    }

    @AfterMethod
    public void afterTest() {


        driver.close();

        driver.quit();
    }

}