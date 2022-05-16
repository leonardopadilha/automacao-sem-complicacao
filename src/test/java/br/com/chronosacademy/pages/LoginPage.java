package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin() {
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar() {
        loginMap.btnFechar.click();
    }

    public void clickDivFecharModal() {
        loginMap.divFecharModal.click();
    }

    public void setInpUserName(String userName) {
        if (userName != null) {
            loginMap.inpUserName.sendKeys(userName);
        }
    }

    public void setInpPassword(String password) {
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }

    public void clickInpRemember() {
        loginMap.inpRemember.click();
    }

    public void clickBtnSignIn() {
        loginMap.btnSignIn.click();
    }

    public void clickLinkCreateAccount() {
        loginMap.linkCreateAccount.click();
    }

    public boolean isBtnSignIn() {
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityOfBtnFechar() {
        Driver.visibilityOf(loginMap.btnFechar);
    }

    public void invisibilityOfBtnFechar() {
        Driver.invisibilityOf(loginMap.btnFechar);
    }

    public void aguardaLoader() {
        Driver.visibilityOf(loginMap.divLoader);
        Driver.attributeChange(loginMap.divLoader, "display", "none");
    }

    public String getTextLogado() {
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public String getErroLogin() {
        Driver.visibilityOf(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();
    }

}
