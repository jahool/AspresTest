package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromocjePage {


        private WebDriver driver;

        public PromocjePage(org.openqa.selenium.WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    //Lokatory

    @FindBy (xpath = "//*[@id=\"cont\"]/div[1]/a/div")
    private WebElement uslugiKsiegowe;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[2]/a/div")
    private WebElement uslugiKadrowe;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[3]/a/div")
    private WebElement ksiegowoscOnline;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[4]/a/div")
    private WebElement ksiegowoscStowarzyszen;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[5]/a/div")
    private WebElement controlling;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[6]/a/div")
    private WebElement uslugiPrawne;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[7]/a/div")
    private WebElement interesujacePromocje;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[8]/a/div")
    private WebElement wirtualneBiuro;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[9]/a/div")
    private WebElement szkoleniaBHP;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[10]/a/div")
    private WebElement rozliczanieDotacji;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[11]/a/div")
    private WebElement monitoringNaleznosci;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[11]/a/div")
    private WebElement obslugaRachunku;

    @FindBy (xpath = "//*[@id=\"cont\"]/div[13]/a/div")
    private WebElement dzierzawaOprogramownia;

    @FindBy (xpath = "//*[@id=\"panel\"]")
    private WebElement strefaKlienta;





    }
