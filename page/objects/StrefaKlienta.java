package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StrefaKlienta {

    private WebDriver driver;

    public StrefaKlienta(WebDriver driver) {
        this.driver = driver;
    }
    private By strefaKlientaButton =  By.xpath("//*[@id=\"nav\"]/a[2]");
    public void clickOnStrefaKlientaLink() {
        WebElement strefaKlienta = driver.findElement(strefaKlientaButton);
        strefaKlienta.click();

    }
}