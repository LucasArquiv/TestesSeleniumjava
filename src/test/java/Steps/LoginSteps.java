package Steps;

import Pages.LoginPage;
import Runner.RunAuxiliar;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        getDriver(RunAuxiliar.Browser.CHROME);
        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        loginPage.fillEmailCreate();
        loginPage.cliqueConta();

    }
}
