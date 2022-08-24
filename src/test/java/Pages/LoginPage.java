package Pages;

import Runner.RunCucumberTest;
import Support.Utils;
import org.openqa.selenium.By;

 //Teste de login de conta na onde será inserido um email criado randômico, para podemos ter acesso a tela de cadastro
public class LoginPage extends RunCucumberTest {

    private By CampoEmail = By.id("email_create");
    private By Botaoinscricao= By.id("SubmitCreate");

    public void acessarTelaLogin(){
        //coloque em getDriver(seu navegador)
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.waitElementBePresent(CampoEmail,20);
    }
    public void fillEmailCreate(){
        getDriver().findElement(CampoEmail).sendKeys(Utils.getRamdomEmail());
    }
    public void cliqueConta(){
        getDriver().findElement(Botaoinscricao).click();
    }

}
