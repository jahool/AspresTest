import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInButton {
    private WebDriver driver;

    public SignInButton(WebDriver driver) {
        this.driver = driver;
}
    public void clickOnSignInButton(){
        WebElement signOnButton = driver.findElement(By.xpath("//*[@id=\"loginEsp_LoginImageButton\"]"));
        signOnButton.click();
    }

}