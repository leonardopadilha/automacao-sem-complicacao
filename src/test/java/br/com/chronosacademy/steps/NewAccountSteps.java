package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.LoginPage;
import br.com.chronosacademy.pages.NewAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

import java.util.Map;

public class NewAccountSteps {
    NewAccountPage newAccountPage;
    String principalPage = "https://advantageonlineshopping.com/";
    String registerPage = "https://advantageonlineshopping.com/#/register";
    String userName;

    @Dado("que a pagina new account esteja sendo exibida")
    public void queAPaginaNewAccountEstejaSendoExibida() {
        newAccountPage = new NewAccountPage();
        Driver.getDriver().get(principalPage);
        Driver.getDriver().get(registerPage);
    }
    @Quando("os campos de cadastro estiverem preenchidos com")
    public void osCamposDeCadastroEstiveremPreenchidosCom(Map<String, String> map) {
        userName = map.get("username");

        newAccountPage.setInpUserName(userName);
        newAccountPage.setInpEmail(map.get("email"));
        newAccountPage.setInpPassword(map.get("password"));
        newAccountPage.setInpConfirmPassword(map.get("password"));
        //newAccountPage.selectCountry(map.get("country"));

        newAccountPage.clickInpIaGree();
        newAccountPage.clickBtnRegister();
    }
    @Entao("deve ser possivel logar no sistema após o cadastro")
    public void deveSerPossivelLogarNoSistemaApósOCadastro() {
        //LoginPage loginPage = new LoginPage();
        //Assert.assertEquals(userName, loginPage.getTextLogado());
    }
}
