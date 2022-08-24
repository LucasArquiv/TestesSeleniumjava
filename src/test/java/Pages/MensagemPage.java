package Pages;

import Runner.RunCucumberTest;
import Support.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/* Teste de Envio de mensagem, onde iremos Testar os campos de cadastro e envio e de  mensagem
 e verificaremos se mensagem enviada é mesma escrita*/

public class MensagemPage extends RunCucumberTest {

    private By Sugestao = By.id("id_contact");
    private By EnderecoEmail= By.id("email");
    private By Arquivo = By.id("fileUpload");
    private By Mensagem = By.id("message");
    private By Botaoenviar = By.id ("submitMessage");

    public void acessarContact(){
        getDriver().get("http://automationpractice.com/index.php?controller=contact");
        Utils.waitElementBePresent(Botaoenviar, 10);
    }
    public  void selecionaSugestao(String assunto){
        Select selecioneassunto = new Select(getDriver().findElement(Sugestao));
        selecioneassunto .selectByVisibleText(assunto);

    }
    public void preenchemensagem(String menssage){
       getDriver().findElement(Mensagem).sendKeys(menssage);

    }
    public void enderecoEmail(){
        getDriver().findElement(EnderecoEmail).sendKeys(Utils.getRamdomEmail());
    }

    public void EnvioArquivo(String pathfile) {
        getDriver().findElement(Arquivo).sendKeys(pathfile);
    }
    public void BTNmensagem(){
        getDriver().findElement(Botaoenviar).click();
    }

}
