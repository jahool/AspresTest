package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertEquals;

public class MainPage {
    private  WebDriver driver;

    public MainPage(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


     //Lokatory


    @FindBy(xpath = "//*[@id=\"nav\"]/a[1]")
    private WebElement stronaGlownaGornylewyRog;

    @FindBy(xpath = "//*[@id=\"nav\"]/a[2]")
    private WebElement strefaKlientGornyLewyRog;

    @FindBy(xpath ="//*[@id=\"nav\"]/a[3]" )
    private WebElement kontaktZNamiPrawyGornyRog;

    @FindBy(xpath = "//*[@id=\"navi\"]/ul/li[1]/a")
    private WebElement biuroRachunkoweGorneMenu;

    @FindBy (xpath = "//*[@id=\"navi\"]/ul/li[2]/a")
    private WebElement naszaOfertaGornemenu;

    @FindBy (xpath = "//*[@id=\"navi\"]/ul/li[3]/a")
    private WebElement promocjeGornemenu;

    @FindBy (xpath = "//*[@id=\"navi\"]/ul/li[4]/a")
    private WebElement kontaktGorneMenu;

    @FindBy (xpath = "//*[@id=\"slider\"]/div[2]/a[1]")
    private WebElement wiecejHeader;

    @FindBy (xpath = "//*[@id=\"0\"]")
    private WebElement jedenHeader;

    @FindBy (xpath = "//*[@id=\"1\"]")
    private WebElement dwaHeader;

    @FindBy (xpath = "//*[@id=\"2\"]")
    private WebElement trzyHeader;

    @FindBy (xpath = "//*[@id=\"3\"]")
    private WebElement czteryHeader;

    @FindBy (xpath = "//*[@id=\"4\"]")
    private WebElement piecHeader;

    @FindBy (xpath = "//*[@id=\"foot1\"]/ul/li[1]/a")
    private WebElement biuroRachunkoweDolnemenu;

    @FindBy (xpath = "//*[@id=\"foot1\"]/ul/li[2]/a")
    private WebElement biuroKsiegoweDolneMenu;

    @FindBy (xpath = "//*[@id=\"foot1\"]/ul/li[3]/a")
    private WebElement ofertaDolneMenu;

    @FindBy (xpath = "//*[@id=\"foot1\"]/ul/li[4]/a")
    private WebElement promocjeDolneMenu;

    @FindBy (xpath = "//*[@id=\"foot1\"]/ul/li[5]/a")
    private WebElement przydatneLinkiDolneMenu;

    @FindBy (xpath ="//*[@id=\"foot1\"]/ul/li[6]/a")
    private WebElement uslugiKsiegoweDolneMenu;

    @FindBy (xpath = "//*[@id=\"foot1\"]/ul/li[7]/a")
    private WebElement kontaktDolneMenu;

    @FindBy (xpath = "//*[@id=\"foot2\"]/div/span[5]/a")
    private WebElement emailDolnaStopka;

    @FindBy (xpath = "//*[@id=\"foot2\"]/div/a")
    private WebElement mapaStronyDolnaStopka;



    public void clickOnStrefaKlientaLink() {
        strefaKlientGornyLewyRog.click();
    }
    public String checkPageTitle(){
        String pageTitle = driver.getTitle();
        return pageTitle;
    }
    public String checkStronaGlownaGornylewyRog(){
       String stronaGlowna =  stronaGlownaGornylewyRog.getText();
       return stronaGlowna;
    }
    public String clickStronaGlownaGornyLewyRog(){
        stronaGlownaGornylewyRog.click();
        String pageTitle = driver.getTitle();
        return pageTitle;

    }
    public String checkStrefaKlientaGornylewyRog() {
        String strefaKlienta = strefaKlientGornyLewyRog.getText();
        return strefaKlienta;

    }
    public String clickStrefaKlientaGornyLewyRog() {
        strefaKlientGornyLewyRog.click();
        String strefaKlientapageTitle = driver.getTitle();
        return strefaKlientapageTitle;
    }

    public String checkKontaktZNamiPrawyGornyRog(){
        String kontaktZNami = kontaktZNamiPrawyGornyRog.getText();
        return kontaktZNami;
    }

    public String clickKontaktZNamiPrawyGornyRog(){
        kontaktZNamiPrawyGornyRog.click();
        String kontaktZNamiTitle = driver.getTitle();
        return kontaktZNamiTitle;
    }

    public String checkBiuroRachunkoweUpperButton(){
        String biuroRachunkoweUpperButton = biuroRachunkoweGorneMenu.getText();
        return biuroRachunkoweUpperButton;
    }




}
