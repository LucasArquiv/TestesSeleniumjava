package Pages;

import Runner.RunCucumberTest;
import Support.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


/* Teste de Cadastro onde testaremos todos os campos de inserção, inserindo informações geradas pelos métodos,
 para serem validados pelo sistema.
 todos métodos testados na tela de cadastro pela a sua ID*/


public class CadastroPage extends RunCucumberTest {
    //variaveis de id Abstraidas
    private By Masc = By.id("id_gender1");
    private By Feml = By.id("id_gender2");
    private By PriNome = By.id("customer_firstname");
    private By SobNome = By.id ("customer_lastname");
    private By Senha = By.id ("passwd");
    private By DiaNasc = By.id("days");
    private By MesNasc = By.id("months");
    private By AnoNasc = By.id("years");
    private By Rua = By.id("address1");
    private By Cidade = By.id("city");
    private By Estado = By.id("id_state");
    private By CEP = By.id("postcode");
    private By CElMobile = By.id ("phone_mobile");
    private By btnRegistrar = By.id("submitAccount");

    public void SelecioneSexo(Integer type){
        //  Tempo para Elemento estar presente na tela
        Utils.waitElementBePresent(Masc,10);
        if (type == 1){
            getDriver().findElement(Masc).click();

        } else if (type == 2) {
            getDriver().findElement(Feml).click();
        }
        if (type == 1){

        }
    }
    public void PreenchePrimeiroNome(String Nomes){getDriver().findElement(PriNome).sendKeys(Nomes);}
    public void PreencheSobreNome(String Sobrenome){getDriver().findElement(SobNome).sendKeys(Sobrenome);}
    public void CriarSenha(){getDriver().findElement(Senha).sendKeys(Utils.gerarSenhaAleatoria());}
    public void SelecioneNasc (Integer Dia, Integer Mes , String Ano){

        Select SelecioneDia = new Select(getDriver().findElement(DiaNasc));
        SelecioneDia.selectByIndex(Dia);

        Select SelecioneMes = new Select(getDriver().findElement(MesNasc));
        SelecioneMes.selectByIndex(Mes);

        Select SelecioneAno = new Select(getDriver().findElement(AnoNasc));
        SelecioneAno.selectByValue(Ano);
    }
    public void PreencherEndereco(String Endereco){
        getDriver().findElement(Rua).sendKeys(Endereco);
    }
    public void PreencherCidade(String Local){
        getDriver().findElement(Cidade).sendKeys(Local);
    }
    public void PreencherEstado(String Regiao){
        Select SelecioneDia = new Select(getDriver().findElement(Estado));
        SelecioneDia.selectByVisibleText(Regiao);
    }
    public void RegistroCEP(){
        getDriver().findElement(CEP).sendKeys(Utils.NumerosAleatorio());
    }
    public void NumeroCElular( String fone){
        getDriver().findElement(CElMobile).sendKeys(fone);
    }
    public void BTNRegistar(){
        getDriver().findElement(btnRegistrar).click();
    }

    public  void validacaocadastro( String Nomes, String Sobrenome){
        Utils.waitElementBePresent(By.className("button-search"), 10);
        String Resultado_Atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a")).getText();
        Assert.assertEquals(Nomes + " " + Sobrenome,Resultado_Atual);

    }
}
