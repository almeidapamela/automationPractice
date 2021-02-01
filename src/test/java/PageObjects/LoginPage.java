package PageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage (){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextNavigationPage(){
        return navigationPage.getText();
    }

    public boolean isPageLogin() {
        return getTextNavigationPage().equals("Authentication");

    }

    public void sendKeysEmail(String mail){
        email.sendKeys(mail);
    }

    public void sendKeysPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickSubmitLogin(){
        submitLogin.click();
    }

    public void doLogin(String email, String password) {
        sendKeysEmail(email);
        sendKeysPassword(password);
        clickSubmitLogin();
    }
}
