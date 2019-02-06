package tests;


import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.MainPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTests extends TestBase {


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

    @Test
    public void StronaGlowna(){
        MainPage mainPage = new MainPage(driver);

        String mainPageTitle = mainPage.checkPageTitle();
        assertEquals (mainPageTitle,"Biuro rachunkowe Wrocław Krzyki - usługi księgowe");

        String stronaGlownaButton = mainPage.checkStronaGlownaGornylewyRog();
        assertEquals(stronaGlownaButton,"Strona Główna");

        String stronaGlownaButtonClick = mainPage.clickStronaGlownaGornyLewyRog();
        assertEquals (stronaGlownaButtonClick,"Biuro rachunkowe Wrocław Krzyki - usługi księgowe");

        String strefaKlientaButtonText = mainPage.checkStrefaKlientaGornylewyRog();
        assertEquals(strefaKlientaButtonText, "Strefa klienta");

        String strefaKlientaButtonClick = mainPage.clickStrefaKlientaGornyLewyRog();
        assertEquals(strefaKlientaButtonClick,"Logowanie");

        driver.navigate().to("http://www.aspres.pl/");

        String kontaktZNamiButtonText = mainPage.checkKontaktZNamiPrawyGornyRog();
        assertEquals(kontaktZNamiButtonText,"Kontakt z nami");

        String kontaktZNamiButtonClick = mainPage.clickKontaktZNamiPrawyGornyRog();
        assertEquals(kontaktZNamiButtonClick, "Biuro rachunkowo As-Pres, Wrocław ul. Czerniawska 2A/27");

        driver.navigate().to("http://www.aspres.pl/");

        String biuroRachunkoweUpperButtonCheck = mainPage.checkBiuroRachunkoweUpperButton();
        assertEquals(biuroRachunkoweUpperButtonCheck,"Biuro rachunkowe");












    }
}