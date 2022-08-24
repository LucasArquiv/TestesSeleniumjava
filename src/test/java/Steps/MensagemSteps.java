package Steps;

import Pages.MensagemPage;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MensagemSteps extends RunCucumberTest {

    MensagemPage mensagemPage = new MensagemPage();
    @Dado("^que estou na tela de contact us$")
    public void que_estou_na_tela_de_contact_us() {
        mensagemPage.acessarContact();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos(){
    mensagemPage.selecionaSugestao("Webmaster");
    mensagemPage.enderecoEmail();
    mensagemPage.preenchemensagem("mensagem enviada");
    mensagemPage.EnvioArquivo("C:\\MeusProjetos\\MystoreTest\\images.jpg");

    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem(){
    mensagemPage.BTNmensagem();
    }

    @Então("^recebo feedback de envio de sucesso$")
   public void recebo_feedback_de_envio_de_sucesso() {
        String menssage = "Your message has been successfully sent to our team.";
        String Resultado = getDriver().findElement(By.cssSelector("#center_column > p")).getText();
        Assert.assertEquals(menssage,Resultado);
    }
}
