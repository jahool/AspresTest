package page.objects;

import org.openqa.selenium.By;
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

    public String clickBiuroRachunkoweUpperButton(){
        biuroRachunkoweGorneMenu.click();
        String biuroRachunkoweTitle = driver.getTitle();
        return biuroRachunkoweTitle;
    }

    public String checkNaszaOfertaGornemenuButton(){
        String naszaOfertaGornemenuButton = naszaOfertaGornemenu.getText();
        return naszaOfertaGornemenuButton;
    }

    public String clickNaszaOfertaGornemenuButton(){
        naszaOfertaGornemenu.click();
        String naszaOfertaGornemenuTitle = driver.getTitle();
        return naszaOfertaGornemenuTitle;
    }

    public String clickPromocjeGornemenuButton(){
        promocjeGornemenu.click();
        String promocjeGornemenuTitle = driver.getTitle();
        return promocjeGornemenuTitle;
    }

    public String checkPromocjeGornemenu(){
        String promocjeGornemenuButton = promocjeGornemenu.getText();
        return promocjeGornemenuButton;
    }

    public String clickKontaktGorneMenu(){
        kontaktGorneMenu.click();
        String kontaktGorneMenuButton = driver.getTitle();
        return kontaktGorneMenuButton;
    }

    public String checkKontaktGorneMenu(){
        String kontaktGorneMenuButton = kontaktGorneMenu.getText();
        return kontaktGorneMenuButton;
    }

    public String clickJedenHeader(){
        jedenHeader.click();
        String jedenHeaderText = driver.findElement(By.xpath("//*[@id=\"0\"]/span")).getText();
        return jedenHeaderText;
    }

    public String clickDwaHeader(){
        dwaHeader.click();
        String dwaHeaderText = driver.findElement(By.xpath("//*[@id=\"1\"]/span")).getText();
        return dwaHeaderText;
    }

    public String clickTrzyHeader(){
        trzyHeader.click();
        String trzyHeaderText = driver.findElement(By.xpath("//*[@id=\"2\"]/span")).getText();
        return trzyHeaderText;
    }

    public String clickCzteryHeader(){
        czteryHeader.click();
        String czteryHeaderText = driver.findElement(By.xpath("//*[@id=\"3\"]/span")).getText();
        return czteryHeaderText;
    }

    public String clickPiecHeader(){
        piecHeader.click();
        String piecHeaderText = driver.findElement(By.xpath("//*[@id=\"4\"]/span")).getText();
        return piecHeaderText;
    }




}
