package Steps;


import Pages.ValidacaoPage;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;


public class ValidacaoSteps extends RunCucumberTest {

    ValidacaoPage validaPage=  new ValidacaoPage();

    @Dado("^que estou na tela de inicial")
    public void que_estou_na_tela_de_inicial() {
        getDriver().get("http://automationpractice.com/index.php");
    }

    @Dado("^clico no item que quero adquirir$")
    public void  clico_no_item_que_quero_adquirir() {
    validaPage.BtnProduto();
    }

    @Então("^então visualizo o item correto$")
    public void então_visualizo_o_item_correto () {
    validaPage.Produto("Faded Short Sleeve T-shirts");

    }
}
