package tests;


import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.StrefaKlienta;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class SucceedLoginTest extends TestBase{


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


    }

