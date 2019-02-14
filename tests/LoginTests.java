/*tu du:
- changes on the websitesite - check!
- make order with the names of Methods and Strings
- subpage tests*/

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

        String biuroRachunkoweUpperButtonClick = mainPage.clickBiuroRachunkoweUpperButton();
        assertEquals( biuroRachunkoweUpperButtonClick, "Biuro rachunkowe Wrocław Krzyki - usługi księgowe");

        driver.navigate().to("http://www.aspres.pl/");

        String naszaOfertaGornemenuButtonCheck = mainPage.checkNaszaOfertaGornemenuButton();
        assertEquals(naszaOfertaGornemenuButtonCheck,"Nasza oferta");

        String naszaOfertaGornemenuButtonClick = mainPage.clickNaszaOfertaGornemenuButton();
        assertEquals(naszaOfertaGornemenuButtonClick,"Oferta biura rachunkowo-księgowego As-Pres z Wrocławia");

        driver.navigate().to("http://www.aspres.pl/");

        String PromocjeGornemenuButtonClick = mainPage.clickPromocjeGornemenuButton();
        assertEquals(PromocjeGornemenuButtonClick,"Promocje - As-Pres Wrocława");   // błąd na stronie - literówka w tytule strony

        driver.navigate().to("http://www.aspres.pl/");

        String promocjeGornemenuButtonCheck = mainPage.checkPromocjeGornemenu();
        assertEquals(promocjeGornemenuButtonCheck,"Promocje");

        String kontaktGorneMenuButtonClick = mainPage.clickKontaktGorneMenu();
        assertEquals(kontaktGorneMenuButtonClick,"Biuro rachunkowo As-Pres, Wrocław ul. Czerniawska 2A/27");

        driver.navigate().to("http://www.aspres.pl/");

        String kontaktGorneMenuButtonCheck = mainPage.checkKontaktGorneMenu();
        assertEquals(kontaktGorneMenuButtonCheck,"Kontakt");

        String jedenHeaderText = mainPage.clickJedenHeader();
        assertEquals(jedenHeaderText,"Dlaczego powinieneś nas wybrać?");

        String dwaHeaderText = mainPage.clickDwaHeader();
        assertEquals(dwaHeaderText, "Dlaczego outsourcing usług księgowych ?");

        String trzyHeaderText = mainPage.clickTrzyHeader();
        assertEquals(trzyHeaderText,"Obsługa księgowa już od 70 zł netto/m-c !!!");

        String czteryHeaderText = mainPage.clickCzteryHeader();
        assertEquals(czteryHeaderText,"W cenie program do fakturowania");

        String clickPiecHeaderText = mainPage.clickPiecHeader();
        assertEquals(clickPiecHeaderText,"Zapewniamy profesjonalną obsługę !");

        String biuroRachunkoweDolnemenuTitle = mainPage.clickBiuroRachunkoweDolnemenu();
        assertEquals(biuroRachunkoweDolnemenuTitle, "Biuro rachunkowe Wrocław Krzyki - usługi księgowe");

        String biuroKsiegoweDolneMenuTitle = mainPage.clickBiuroKsiegoweDolneMenu();
        assertEquals(biuroKsiegoweDolneMenuTitle,"Biuro księgowe Wrocław As-Pres");

        String ofertaDolneMenuTitle = mainPage.clickOfertaDolneMenu();
        assertEquals(ofertaDolneMenuTitle,"Oferta biura rachunkowo-księgowego As-Pres z Wrocławia");

        String promocjeDolneMenuTitle = mainPage.clickPromocjeDolneMenu();
        assertEquals(promocjeDolneMenuTitle,"Promocje - As-Pres Wrocława");

        String przydatneLinkiDolneMenuTitle = mainPage.clickPrzydatneLinkiDolneMenu();
        assertEquals(przydatneLinkiDolneMenuTitle,"Przydatne adresy - As-Pres Wrocław");

        String uslugiKsiegoweDolneMenuTitle = mainPage.clickUslugiKsiegoweDolneMenu();
        assertEquals(uslugiKsiegoweDolneMenuTitle,"Usługi księgowe - Wrocław - As-Pres");

        String kontaktDolneMenuTitle = mainPage.clickKontaktDolneMenu();
        assertEquals(kontaktDolneMenuTitle,"Biuro rachunkowo As-Pres, Wrocław ul. Czerniawska 2A/27");

        String emailDolnaStopkaText = mainPage.checkEmailDolnaStopka();
        assertEquals(emailDolnaStopkaText,"biuro@aspres.pl ");

        String mapaStronyDolnaStopkaText = mainPage.clickMapaStronyDolnaStopka();
        assertEquals(mapaStronyDolnaStopkaText,"Mapa strony - As-Pres Wrocław");



    }
}