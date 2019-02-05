package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private  WebDriver driver;

    public MainPage(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnStrefaKlientaLink() {
        WebElement strefaKlienta = driver.findElement(By.xpath("//*[@id=\"nav\"]/a[2]"));
        strefaKlienta.click();
    }



}
