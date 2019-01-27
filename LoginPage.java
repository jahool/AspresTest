import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeIntoUserNameField(String login){
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"loginEsp_UserName\"]"));
        usernameField.sendKeys(login);
    }

    public void typeIntoPasswordField(String password){
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"loginEsp_Password\"]"));
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){
        WebElement signOnButton = driver.findElement(By.xpath("//*[@id=\"loginEsp_LoginImageButton\"]"));
        signOnButton.click();
    }

    public String getWarningMessage(){
        WebElement messageWarning = driver.findElement(By.xpath("//*[@id=\"loginEsp\"]/tbody/tr/td/table/tbody/tr[5]/td"));
        String warningText = messageWarning.getText();
        return warningText;
    }
    public String getApprovedMessage(){
        WebElement messageApproved = driver.findElement(By.xpath("//*[@id=\"lHeader\"]"));
        String warningText = messageApproved.getText();
        return warningText;
    }
}