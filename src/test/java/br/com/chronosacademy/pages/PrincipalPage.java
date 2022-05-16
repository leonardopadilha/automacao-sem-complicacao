package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    private WebDriver driver;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultadoPesquisaPage escreverCaixaPesquisa(String texto) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(texto + Keys.ENTER);
        return new ResultadoPesquisaPage(driver);
    }

}
