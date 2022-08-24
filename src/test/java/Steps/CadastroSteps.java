package Steps;

import Pages.CadastroPage;
import Runner.RunCucumberTest;
import Support.Utils;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;


public class CadastroSteps extends RunCucumberTest {

    //classe Estendida
    CadastroPage cadastroPage = new CadastroPage();

    String Nomes = Utils.getNomeAleatorio();
    String Sobrenome = Utils.getSobreNomeAleatorio();
    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() {
    cadastroPage.SelecioneSexo(1);
    cadastroPage.PreenchePrimeiroNome(Nomes);
    cadastroPage.PreencheSobreNome(Sobrenome);
    cadastroPage.CriarSenha();
    cadastroPage.SelecioneNasc(22,12,"1996");
    cadastroPage.PreencherEndereco("Rua God Street");
    cadastroPage.PreencherCidade("Los Santos");
    cadastroPage.PreencherEstado("Louisiana");
    cadastroPage.RegistroCEP();
    cadastroPage.NumeroCElular("55(11)40028922");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar(){
        cadastroPage.BTNRegistar();
    }

    @Então("^vejo cadastro realizado com sucesso$")
    public void vejo_caadastro_realizado_com_sucesso(){
        cadastroPage.validacaocadastro(Nomes, Sobrenome);
    }
}
