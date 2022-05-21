package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountMap {
    @FindBy(css = "#menuUser")
    public WebElement linkUser;

    @FindBy(css = "#loginMiniTitle [translate='My_account']")
    public WebElement linkMyAccount;

    @FindBy(css = "[href*='accountDetails']")
    public WebElement linkEdit;

    @FindBy(css = "#myAccountContainer > div:nth-child(1) > div > div:nth-child(1) > label")
    public WebElement textUsuario;

    @FindBy(css = ".deleteMainBtnContainer")
    public WebElement btnDelete;

    @FindBy(css = ".deleteRed")
    public WebElement btnYes;

    @FindBy(css = ".modificationTwo > p")
    public WebElement textDelete;
}
