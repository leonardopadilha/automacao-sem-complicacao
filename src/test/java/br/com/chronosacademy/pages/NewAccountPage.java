package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage() {
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount() {
        Driver.visibilityOf(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();
    }

    public void setInpUserName(String userName) {
        Driver.visibilityOf(newAccountMap.inpUserName);
        newAccountMap.inpUserName.sendKeys(userName);
    }

    public void setInpEmail(String email) {
        newAccountMap.inpEmail.sendKeys(email);
    }

    public void setInpPassword(String password) {
        newAccountMap.inpPassword.sendKeys(password);
    }

    public void setInpConfirmPassword(String password) {
        newAccountMap.getInpConfirmPassword.sendKeys(password);
    }

    public void selectCountry(String country) {
        Select select = new Select(newAccountMap.slcCountry);
        Driver.aguardaOptions(select);
        select.selectByVisibleText(country);
    }

    public void clickInpIaGree() {
        newAccountMap.inpIaGree.click();
    }

    public void clickBtnRegister() {
        newAccountMap.btnRegister.click();
    }


}
