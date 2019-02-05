package tests;


import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.MainPage;

import static org.testng.AssertJUnit.assertEquals;

public class SucceedLoginTest extends TestBase {


    @Test
    public void UserTryToLogInWithCorrectLoginAndPassword() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickOnStrefaKlientaLink();
        loginPage.typeIntoUserNameField("olgierd@jacher.pl");
        loginPage.typeIntoPasswordField("NOWEhaslo1!");
        loginPage.clickOnLoginButton();
        String approvedMessage = loginPage.getApprovedMessage();

        assertEquals(approvedMessage, "Przepraszamy, w systemie wystąpił błąd.");

    }

    @Test
    public void UserTryToLogInWithIncorrectLoginAndPassword() {
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickOnStrefaKlientaLink();
        loginPage.typeIntoUserNameField("WrongLogin");
        loginPage.typeIntoPasswordField("WrongPassword");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Błędna nazwa użytkownika lub hasło.\n" + "Spróbuj zalogować się ponownie.");
    }
}